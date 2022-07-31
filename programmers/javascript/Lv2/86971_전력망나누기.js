// https://programmers.co.kr/learn/courses/30/lessons/86971

function solution(n, wires) {
    
    let adjList = wires.reduce((acc,cur)=>acc[cur[0]-1].push(cur[1]) && acc[cur[1]-1].push(cur[0]) && acc, Array.from({length:n}, ()=>[]));
    let visited = Array(n).fill(false);
    let answer = n;

    function dfs(i){

        let count;

        visited[i] = true;
        if(i && adjList[i].length === 1) return 1;

        count = adjList[i].map(x=>visited[x-1]?0:dfs(x-1)).filter(x=>x);
        answer = Math.min(answer,...count.map(x=>Math.abs(2*x-n)));

        return count.reduce((acc,cur)=>acc+cur, 1);
    }
    
    return dfs(0) && answer;
}
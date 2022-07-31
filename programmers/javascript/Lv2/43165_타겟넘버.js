// https://programmers.co.kr/learn/courses/30/lessons/43165

function solution(numbers, target) {
    
    function dfs(sum, depth) {
        if(depth == numbers.length) return (sum==target)?1:0;
        return dfs(sum+numbers[depth], depth+1) + dfs(sum-numbers[depth], depth+1);
    }
    
    return dfs(0, 0);
}
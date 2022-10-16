// https://programmers.co.kr/learn/courses/30/lessons/87946

function solution(k, dungeons) {
    
    let max = 0;
    
    return adventure(0, k, dungeons);
    
    function adventure(count, k, dungeons) {

        if(!dungeons.length || dungeons.slice(-1)[0][0]>k) return count;

        for(let i=0; i < dungeons.length; i++){
            max = Math.max(max, adventure(count+1, k-dungeons[i][1], dungeons.slice(1)));
        }
        
        return max;
    }
}

console.log(solution(80, [[80,20],[50,40],[30,10]]));


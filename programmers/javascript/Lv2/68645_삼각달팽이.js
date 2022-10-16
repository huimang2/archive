// https://programmers.co.kr/learn/courses/30/lessons/68645

function solution(n) {
    
    let result = Array.from({length:n}, ()=>[]);
    let count = Math.floor((n-1)/3)+1;
    let num = 1;

    for(let i=0; i<count; i++){
        for(let j=2*i; j<2*i+n; j++) result[j][i] = num++;
        for(let j=i+1; j<i+n; j++) result[2*i+n-1][j] = num++;
        for(let j=2*i+n-2; j>2*i; j--) result[j][j-i] = num++;
        n -= 3;
    }
    
    return result.reduce((acc,cur)=>acc.push(...cur) && acc, new Array());
}

console.log(solution(6));
// https://programmers.co.kr/learn/courses/30/lessons/12906

function solution(arr){
    return arr.filter((v,i)=>!i||arr[i-1]!==v);
}
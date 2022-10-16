// https://programmers.co.kr/learn/courses/30/lessons/12947

function solution(x) {
    return !(x%x.toString().split('').reduce((acc,v)=>+acc + +v));
}
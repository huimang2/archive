// https://programmers.co.kr/learn/courses/30/lessons/12973

function solution(s) {
    const arr = [];
    for(let i = 0, length = s.length; i < length; i++)
        !arr.length || arr[arr.length-1] !== s[i] ? arr.push(s[i]) : arr.pop();
    return arr.length ? 0 : 1;
}
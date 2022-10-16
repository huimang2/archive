// https://programmers.co.kr/learn/courses/30/lessons/12973

function solution(s) {
    return s.replace(/\w{2}/g, '') ? 0 : 1;
}
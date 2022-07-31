// https://programmers.co.kr/learn/courses/30/lessons/77885

function solution(numbers) {
    return numbers.map(x=>x%2?parseInt(("0"+x.toString(2)).replace(/01(1*)$/, "10$1"),2):x+1);
}
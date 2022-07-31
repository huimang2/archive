// https://programmers.co.kr/learn/courses/30/lessons/42578

function solution(clothes) {
    const hash = [...new Set(clothes.map(x=>x[1]))];
    return clothes.reduce((acc,cur)=> ++acc[hash.indexOf(cur[1])] && acc, Array(hash.length).fill(0)).reduce((acc,cur)=>++cur*acc, 1)-1;
}
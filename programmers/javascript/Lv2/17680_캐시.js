// https://programmers.co.kr/learn/courses/30/lessons/17680

function solution(cacheSize, cities) {
    let cache = [];
    return cities.reduce((acc,cur)=>{
        cur = cur.toLowerCase();
        if(!cacheSize) return acc+5;
        else if(cache.length < cacheSize && !cache.includes(cur)) return cache.push(cur) && acc+5;
        else if(cache.includes(cur)) return cache.push(...cache.splice(cache.indexOf(cur),1)) && ++acc;
        else return cache.shift() && cache.push(cur) && acc+5;
    }, 0)
}
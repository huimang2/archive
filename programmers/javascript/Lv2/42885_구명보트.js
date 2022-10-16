// https://programmers.co.kr/learn/courses/30/lessons/42885

function solution(people, limit) {
    
    let count = 0;
    
    people.sort((a,b)=>a-b);
    
    while(1){
        if(people.length === 1) return ++count;
        else if(!people.length) return count;
        else if(people[0]+people.pop()<=limit) people.shift();
        count++;
    }
}
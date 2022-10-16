// https://school.programmers.co.kr/learn/courses/30/lessons/42587

function solution(priorities, location) {

    let count = 0;
    let max = Math.max(...priorities);

    const queue = [];

    priorities.forEach((v, i) => queue.push([i,v]));

    while(queue.length) {

        const cur = queue.shift();

        if(cur[1] === max) {
            count++;
            if(cur[0] === location) return count;
            priorities[cur[0]] = 0;
            max = Math.max(...priorities);   
        } else queue.push(cur);
    }
}
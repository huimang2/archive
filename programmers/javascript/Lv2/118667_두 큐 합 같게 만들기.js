// https://school.programmers.co.kr/learn/courses/30/lessons/118667

function solution(queue1, queue2) {

    let sum = queue1.reduce((auc, cur) => auc + cur);

    queue1 = queue1.concat(queue2);

    const answer = queue1.reduce((auc, cur) => auc + cur) / 2;
    const length = 3 * queue2.length;
    const count = [0, 0];

    if( answer != answer|0 ) return -1;
    
    while (count[0] + count[1] < length) {
        if (sum == answer) return count[0] + count[1];
        else if (sum > answer) (sum -= queue1[count[0]]) && queue2.push(queue1[count[0]++]);
        else (sum += queue2[count[1]]) && queue1.push(queue2[count[1]++]);
    }

    return -1;
<<<<<<< HEAD
}
=======
}
>>>>>>> 65c7086 (프로그래머스 118667 문제 풀이)

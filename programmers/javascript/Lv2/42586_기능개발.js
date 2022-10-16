// https://school.programmers.co.kr/learn/courses/30/lessons/42586

function solution(progresses, speeds) {
    const answer = [1];
    let i = 0;
    let max = Math.ceil((100-progresses.shift())/speeds.shift());
    while(progresses.length) {
        const deploy = Math.ceil((100-progresses.shift())/speeds.shift());
        if(max < deploy) {
            max = deploy;
            i++;
            answer.push(1);
        } else answer[i]++;
    }
    return answer;
}
// https://school.programmers.co.kr/learn/courses/30/lessons/131130

function solution(cards) {
    const result = [];
    for(let i = 0, length = cards.length; i < length; i++) {
        if(!cards[i]) continue;
        let [n, count] = [i, 0];
        while(cards[n]) {
            const next = cards[n] - 1;
            cards[n] = 0;
            n = next;
            count++;
        }
        result.push(count);
    }
    if(result.length < 2) return 0;
    result.sort((a, b) => b - a);
    return result[0] * result[1];
}
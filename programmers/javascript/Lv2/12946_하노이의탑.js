// https://programmers.co.kr/learn/courses/30/lessons/12946

function solution(n) {
    return hanoi(n, 1, 2, 3);
}

function hanoi(disk, from, remain, to) {   
    if(!disk) return [];
    return hanoi(disk-1, from, to, remain).concat([[from, to]], hanoi(disk-1, remain, from, to));
}
// https://school.programmers.co.kr/learn/courses/30/lessons/1844

function solution(maps) {

    const rowLength = maps.length;
    const colLength = maps[0].length;

    const queue = [[0, 0, 1]];

    while(queue.length) {
        const [row, col, count] = queue.shift();
        if(row === rowLength - 1 && col === colLength - 1) return count;
        if(maps[row][col] === 1) {
            maps[row][col] = 0;
            if(row > 0 && maps[row-1][col] === 1) queue.push([row-1, col, count+1]);
            if(col < colLength - 1 && maps[row][col+1] === 1) queue.push([row, col+1, count+1]);
            if(row < rowLength - 1 && maps[row+1][col] === 1) queue.push([row+1, col, count+1]);
            if(col > 0 && maps[row][col-1] === 1) queue.push([row, col-1, count+1]);
        }
    }

    return -1;
}
// 효율성  테스트
// 테스트 1 〉	실패 (시간 초과)
// 테스트 2 〉	통과 (2.28ms, 29.6MB)
// 테스트 3 〉	실패 (시간 초과)
// 테스트 4 〉	통과 (3.68ms, 30.1MB)
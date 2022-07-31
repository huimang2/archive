// https://programmers.co.kr/learn/courses/30/lessons/87377

function solution(line) {

    let arr = [];
    let tmp, range, answer;

    for (let i = 0; i < line.length - 1; i++) {
        for (let j = i + 1; j < line.length; j++) {
            tmp = equations(line[i], line[j]);
            if (tmp) arr.push(tmp);
        }
    }

    range = arr.reduce((acc, cur) => {
        acc[0][0] = Math.min(acc[0][0], cur[0]);
        acc[0][1] = Math.max(acc[0][1], cur[0]);
        acc[1][0] = Math.min(acc[1][0], cur[1]);
        acc[1][1] = Math.max(acc[1][1], cur[1]);
        return acc;
    }, [
        [Infinity, -Infinity],
        [Infinity, -Infinity]
    ]);

    answer = Array(range[1][1] - range[1][0] + 1).fill(0).map(() => Array(range[0][1] - range[0][0] + 1).fill("."));

    arr.forEach(x => {
        answer[range[1][1] - x[1]][x[0] - range[0][0]] = "*";
    });

    return answer.map(x => x.join(''));
}

function equations(a, b) {

    if (a[0] * b[1] == a[1] * b[0]) return false;

    let x = (a[1] * b[2] - a[2] * b[1]) / (a[0] * b[1] - a[1] * b[0]);
    let y = (a[2] * b[0] - a[0] * b[2]) / (a[0] * b[1] - a[1] * b[0]);

    if (Math.floor(x) == x && Math.floor(y) == y) return [x, y];
    else return false;
}

console.log([1, 2, 3, 3].indexOf(3));
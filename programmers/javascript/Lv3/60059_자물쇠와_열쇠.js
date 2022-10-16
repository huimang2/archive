//https://programmers.co.kr/learn/courses/30/lessons/60059

// XOR를 사용하여 비트연산을 하려했지만 오버플로우가 발생...
// 어쩔수없이 문자비교

function solution(key, lock) {

    const keyNumber = lock.flat().map(x => x ? 0 : 1).join('');

    if (keyNumber == Array(lock.length ** 2).fill(0).join('')) return true;

    for (let rowMargin = -key.length + 1; rowMargin < lock.length; rowMargin++) {
        for (let colMargin = -key.length + 1; colMargin < lock.length; colMargin++) {
            for (let rotation = 0; rotation < 4; rotation++) {
                if (unLock(rowMargin, colMargin)) return true;
                key = rotate(key);
            }
        }
    }

    return false;

    function unLock(rowMargin, colMargin) {
        let serializedKey = zerofill(key, rowMargin).map(row => row ? zerofill(row, colMargin) : Array(lock.length).fill(0)).flat().join('');
        return serializedKey == keyNumber ? true : false;
    }

    function zerofill(arr, margin) {
        return Array(margin > 0 ? margin : 0).fill(0)
            .concat(arr.slice(margin < 0 ? -margin : 0))
            .concat(Array(key.length + margin < lock.length ? lock.length - key.length - margin : 0).fill(0))
            .slice(0, lock.length);
    }

    function rotate(arr) {
        return arr.reduce((acc, row) => row.map((_, col) => [row[col], ...(acc[col] || [])]), []);
    }
}

console.log(solution([[0, 0, 0], [1, 0, 0], [0, 1, 1]], [[1, 1, 1], [1, 1, 0], [1, 0, 1]]))
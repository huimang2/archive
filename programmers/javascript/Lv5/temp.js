function solution(rectangles = [[0]]) {
    
    const Y_DATA_ARR = [...rectangles.reduce( (set, rectangle) => {
        set.add(rectangle[1]);
        set.add(rectangle[3]);
        return set;
    }, new Set())];

    const Y_INDEX_ARR = [];

    Y_DATA_ARR.sort((a, b) => a - b);
    Y_DATA_ARR.forEach((el, idx) => Y_INDEX_ARR[el] = idx);

    const X_DATA_ARR = [];

    rectangles.forEach( (rec, idx) => {
        (X_DATA_ARR[2 * idx] = [rec[0], Y_INDEX_ARR[rec[1]], Y_INDEX_ARR[rec[3]], 1]) && 
        (X_DATA_ARR[2 * idx + 1] = [rec[2], Y_INDEX_ARR[rec[1]], Y_INDEX_ARR[rec[3]], -1]);
    });

    X_DATA_ARR.sort((a, b) => a[0] - b[0]);

    const   DATA_SIZE = Y_DATA_ARR.length,
            DEPTH = Math.ceil(Math.log(DATA_SIZE) / Math.log(2)) + 1,
            TREE_SIZE = Math.pow(2, DEPTH),
            SUM = [0], COUNT = [0];

    for (let i = 0; i < TREE_SIZE; i++) COUNT[i] = SUM[i] = 0;

    let answer = 0, width = 0;

    X_DATA_ARR.forEach( (el, idx, arr) => {

        if(idx > 0) width = el[0] - arr[idx - 1][0];
        answer += width * SUM[1];

        update(el[1], el[2]-1, el[3], 1, 0, DATA_SIZE - 1);
    });

    return answer;

    function update(left, right, count, node, start, end) {
        
        if (left > end || right < start) return;
    
        if (left <= start && end <= right) COUNT[node] += count;
        else {
            let mid = (start + end) / 2 | 0;
            update(left, right, count, node * 2, start, mid);
            update(left, right, count, node * 2 + 1, mid + 1, end);
        }
    
        if(COUNT[node] > 0) SUM[node] = Y_DATA_ARR[end + 1] - Y_DATA_ARR[start];
        else {
            if (start === end) SUM[node] = 0;
            else SUM[node] = SUM[node * 2] + SUM[node * 2 + 1];
        }
    }
}

console.log(solution([[1, 1, 6, 5], [2, 0, 4, 2], [2, 4, 5, 7], [4, 3, 8, 6], [7, 5, 9, 7]]));
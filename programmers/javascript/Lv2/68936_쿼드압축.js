// https://programmers.co.kr/learn/courses/30/lessons/68936

function solution(arr) {
    return dp(arr);
}

function dp(arr) {
    if(arr.length === 1) return arr[0][0] ? [0,1] : [1,0];
    arr = quarter(arr);
    return merge(...arr.map(x=>dp(x)).reduce((acc,cur)=>cur.map((x,i)=>acc[i]+x), [0,0]));
}

function merge(a,b) {
    return (a===4 && b===0) ? [1,0] : (a===0 && b===4) ? [0,1] : [a,b];
}

function quarter(arr) {
    return Array(4).fill(0).reduce((acc,_,i)=>{
        if(i === 0) acc[0] = arr.splice(0,arr.length/2);
        else if(i === 1) acc[1] = acc[0].map(row => row.splice(arr.length, arr.length));
        else if(i === 2) acc[2] = arr.map(row => row.splice(0, arr.length));
        else if(i === 3) acc[3] = arr;
        return acc;
    }, []);
}

// dp보다 백트래킹이 더 효율적인듯..
function solution(arr) {
    if (arr.every(row => row.every(cell => cell === 0))) return [1, 0];
    if (arr.every(row => row.every(cell => cell === 1))) return [0, 1];
    const len = arr.length,
        q1 = arr.splice(0, len/2),
        q2 = q1.map(row => row.splice(len/2, len/2)),
        q3 = arr,
        q4 = q3.map(row => row.splice(len/2, len/2));
    return [q1,q2,q3,q4].reduce((ans, x) => solution(x).map((d, i) => d + ans[i]), [0, 0]);
}
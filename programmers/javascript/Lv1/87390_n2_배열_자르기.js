function solution(n, left, right) {

    let arr = [];

    for(let i=left; i<=right; i++){
        arr.push(i%n>Math.floor(i/n)?i%n+1:Math.floor(i/n)+1);
    }
    return arr;
}
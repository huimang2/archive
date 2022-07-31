// https://school.programmers.co.kr/learn/courses/30/lessons/12940

// function solution(n, m) {
//     var answer = [];
//     const GCD = (n, m) => n<m?GCD(m,n):(n%m?GCD(m,n%m):m);
//     const gcd = GCD(n,m);
//     return [gcd, n*m/gcd];
// }

function GCD(a, b) {

    let result = 1;

    if(a > b) [a, b] = [b, a];

    let i = 2;    
    while(1) {
        while(a%i === 0 && b%i === 0) {
            a /= i;
            b /= i;
            result *= i;
        }
        if(a === 1 || a === i++) return result;
    } 
}

function LCM(a, b) {
    return a * b / GCD(a, b);
}

console.log(GCD(6,12));
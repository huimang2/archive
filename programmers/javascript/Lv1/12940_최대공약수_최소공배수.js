// https://school.programmers.co.kr/learn/courses/30/lessons/12940

function solution(n, m) {
    var answer = [];
    const GCD = (n, m) => n<m?GCD(m,n):(n%m?GCD(m,n%m):m);
    const gcd = GCD(n,m);
    return [gcd, n*m/gcd];
}
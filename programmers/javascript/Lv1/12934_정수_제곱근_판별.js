function solution(n) {
    return n%n**(1/2)?-1:(n**(1/2)+1)**2;
}
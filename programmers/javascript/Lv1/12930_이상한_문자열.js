function solution(s) {
    return s.split(' ').map(x=>x.split('').map((x,i)=>i%2?x.toLowerCase():x.toUpperCase()).join('')).join(' ');
}
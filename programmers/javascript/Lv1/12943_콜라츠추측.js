// https://programmers.co.kr/learn/courses/30/lessons/12943

function solution(num) {
    var answer = 0;
    while(num!=1 && answer!=500){
        answer++;
        num = num%2?num*3+1:num/2;
    } 
    return num==1?answer:-1;
}
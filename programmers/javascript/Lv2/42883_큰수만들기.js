// https://programmers.co.kr/learn/courses/30/lessons/42883

// 10번이 통과를 못하고 있다... 뭐가 문제일까?

function solution(number, k) {
    
    let length = number.length;

    number = number.split('');
    
    for(let i=0; k; i++) {
        if(i === length - 1) break;
        else if(number[i] < number[i+1]) {
            number.splice(i--,1);
            length--;
            k--;
            i--;
        }
    }

    return number.slice(0, length - k).join('');
}
num='';
for(let i=0; i<1000000; i++) num+='9';
console.log(solution(num, 1000000-3));

// function solution(number, k) {
    
//     let length = number.length;

//     number = number.split('');
    
//     for(let i=0; k; i++) {
//         if(i === length) i = 0;
//         if(
//             number[i] < number[(i+1)%length] || 
//             i === length-1 && number[i] === number[(i+1)%length]
//         ){
//             number.splice(i--%length--,1) && k-- && i--;
//         }
//     }

//     return number.join('');
// }
// num='';
// for(let i=0; i<1000000; i++) num+='9';
// console.log(solution(num, 1000000-3));
// https://programmers.co.kr/learn/courses/30/lessons/92335

// 에라스토테네스 체를 사용하면 배열의 크기가 커서 런타임 오류 발생
// 단순하게 소수인지 확인하는 함수를 작성하는 방향으로 갈 것
function solution(n, k) {
    
    let arr = n.toString(k).split('0').filter(x=>x&&x!=1).sort((a,b)=>b-a);
    let primeNums = [false,false].concat(Array(arr[0]-1).fill(true));
        
    for(let i=2; i**2<=arr[0]; i++){
        if(primeNums[i]){
            for(let j=i**2; j<=arr[0]; j+=i){
                primeNums[j] = false;
            }
        }
    }
    
    return arr.reduce((acc,cur)=>acc+(primeNums[cur]?1:0),0);
}

// 함수 작성
function isPrimes(n){

    if(n==1) return false;

    for(let i=2; i<=Math.sqrt(n); i++){
        if(n%i==0) return false;
    }
    return true; 
}

function solution(n, k) { 
    let arr = n.toString(k).split('0').filter(x=>x&&x!=1).sort((a,b)=>b-a); 
    return arr.reduce((acc,cur)=>acc+(isPrimes(cur)?1:0),0);
}
// https://programmers.co.kr/learn/courses/30/lessons/12923

// 자신을 제외한 약수의 최대값을 찾으면 됨

function solution(begin, end) {
    
    let arr = Array(end-begin+1).fill(1);
    
    for(let i=begin; i<=end; i++){
        
        if(i==1){
            arr[0] = 0;
            continue;
        }
        
        for(let j=2; j**2<=i; j++){
            if(i%j==0 && i/j<=10000000) {
                arr[i-begin] = i/j;
                break;
            }
            
        }
    }
    return arr;
}
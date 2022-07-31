// https://programmers.co.kr/learn/courses/30/lessons/42840

function solution(answers) {
    
    const patterns = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]];   
    let point = [0,0,0];
    
    answers.forEach((x,i)=>{
        for(let j=0; j<3; j++){
            if(x==patterns[j][i%patterns[j].length]) point[j]++;
        }
    });
    
    return point.map((x,i)=>x===Math.max(...point)?i+1:0).filter(x=>x);
}
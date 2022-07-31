// https://programmers.co.kr/learn/courses/30/lessons/42747

function solution(citations) {

    let h = 0;

    citations.sort((a,b)=>b-a);
    for(h=0; citations[h] > h; h++);

    return h;
}

// 필터링을 통해서도 출력 가능
function solution(citations) {
    return citations.sort((a,b)=>b-a).filter((x,i)=>x>=i+1).length;
}
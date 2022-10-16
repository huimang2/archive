// https://programmers.co.kr/learn/courses/30/lessons/92334
// 행렬로 값을 대입하여 column 값의 합이 k보다 크면 정지가 된 것이므로 row마다 신고가 된 column의 수를 찾음.

function solution(id_list, report, k) {

    let matrix = Array(id_list.length).fill(0).map(()=>Array(id_list.length).fill(0));
    
    for(v of report) {
        v = v.split(' ');
        matrix[id_list.indexOf(v[0])][id_list.indexOf(v[1])] = 1;
    }

    return id_list.map((_,i)=>id_list.reduce((acc,_,x)=>acc+(id_list.reduce((acc,_,y)=>acc+matrix[y][x],0)<k?0:matrix[i][x]?1:0),0));
}
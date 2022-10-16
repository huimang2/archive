function solution(n, apeach_info) {
    
    const point = Array.from({length:11},(v,i)=>10-i);
    let apeach_score, ryan_score, best_info;
    let max_score_gap = 0;
    let max_depth = 0;
     
    function calc(ryan_info, remain) {
        
        let depth = ryan_info.length;

        if(depth == 10){
            ryan_info.push(remain);
            remain = 0;
        }
 
        if(!remain) {

            ryan_info.push(...Array(11-ryan_info.length).fill(0));
            
            ryan_score = ryan_info.reduce((a,c,i)=>+(c>0)*point[i]+a,0);
            apeach_score = apeach_info.reduce(
                (a,c,i)=>(apeach_info[i]>ryan_info[i]?+(c>0)*point[i]:0)+a,0);
            
            if(ryan_score-apeach_score > max_score_gap ||
              ryan_score-apeach_score == max_score_gap &&
              max_depth < depth) {
                max_depth = depth;
                max_score_gap = ryan_score-apeach_score;
                best_info = ryan_info;
            }
            
            return;
        }
        
        if(apeach_info[depth] < remain) {
            ryan_info.push(apeach_info[depth]+1)
            calc([...ryan_info], remain-(apeach_info[depth]+1));
        }
        
        if(ryan_info.length !== depth) ryan_info.pop();
        ryan_info.push(0);
        calc([...ryan_info], remain);

    }
    
    calc([], n);
    
    return max_score_gap?best_info:[-1];
}
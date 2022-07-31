// https://programmers.co.kr/learn/courses/30/lessons/17679

function solution(m, n, board) {
    
    let del = [];
    board = board.reduce((acc,row)=>row.split('').map((_,col)=>[...(acc[col] || []), row[col]]), []);

    do{
        del.forEach(x=>board[x[0]][x[1]] = board[x[0]+1][x[1]] = board[x[0]][x[1]+1] = board[x[0]+1][x[1]+1] = false);
        del = [];
        
        board = board.map(x=>{
            x = x.filter(x=>x);
            return Array(m-x.length).fill(false).concat(x);
        });

        for(let i=0; i<n-1; i++){
            for(let j=0; j<m-1; j++){
                if(
                    board[i][j] && 
                    board[i][j] == board[i][j+1] && 
                    board[i][j] == board[i+1][j] && 
                    board[i][j] == board[i+1][j+1]
                ) del.push([i,j]);
            }
        }
    } while(del.length);
    
    return board.flat().filter(x=>!x).length;
}
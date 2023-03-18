// https://school.programmers.co.kr/learn/courses/30/lessons/169199

function solution(board) {

  board = board.map(e => e.split(""));

  const ry = board.findIndex(r => r.includes("R")),
        rx = board[ry].findIndex(c => c.includes("R")),
        queue = [[ry, rx, 0]];

  while (queue.length) {
      const [y, x, count] = queue.shift();
      let [_y, _x] = [y, x];

      if (board[y][x] === "G") return count;

      if ([".", "R"].includes(board[y][x])) {
          board[y][x] = "";
          while(true) if(--_y < 0 || board[_y][x] === "D") break;
          if(board[++_y][x] !== "") queue.push([_y, x, count+1]);
          while(true) if(--_x < 0 || board[y][_x] === "D") break;
          if(board[y][++_x] !== "") queue.push([y, _x, count+1]);
          [_y, _x] = [y, x];
          while(true) if(board[++_y] === undefined || board[_y][x] === "D") break;
          if(board[--_y][x] !== "") queue.push([_y, x, count+1]);
          while(true) if(board[y][++_x] === undefined || board[y][_x] === "D") break;
          if(board[y][--_x] !== "") queue.push([y, _x, count+1]);
      }
  }

  return -1;
}
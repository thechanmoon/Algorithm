/**
 * @param {number[][]} grid
 * @return {number}
 */
var orangesRotting = function(grid) {
        let queue = [];
        let cor = [ [0,1], [0,-1], [1,0], [-1,0] ];

        let fresh = 0; 
        let time = 0;

        for (let i = 0; i < grid.length; i++) {
            for (let j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    queue.push([ i, j ]);
                }
            }
        }
        
        while (queue.length != 0 && fresh > 0) {

            for (let i = queue.length; i > 0; i--) {

                let curr = queue.shift();
                for (let d = 0; d < 4; d++) {

                    let x = curr[0] + cor[d][0];
                    let y = curr[1] + cor[d][1];

                    if (x < 0 || y < 0||  x >= grid.length || y >= grid[0].length || grid[x][y] != 1) {
                        continue;
                    }

                    grid[x][y] = 2;
                    queue.push([ x, y ]);
 
                    fresh--;
                }
            }
            time++;
        }

        if(fresh<=0)
            return time;
        
        return -1;   
};

console.log(orangesRotting([[2,1,1],[1,1,0],[0,1,1]]));
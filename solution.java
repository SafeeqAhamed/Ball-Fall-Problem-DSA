class Solution {
    public int[] findBall(int[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        int[] ans = new int[c];
        
        for (int start = 0; start < c; start++) {
            
            int x = 0;
            int y = start;
            
            while (x < r) {
                
                int dir = grid[x][y];     
                
                int ny = y + dir;           

                if (ny < 0 || ny >= c || grid[x][ny] != dir) {
                    y = -1;
                    break;
                }
                
                // move to next cell
                x++;
                y = ny;
            }
            
            ans[start] = y;
        }
        
        return ans;
    }
}

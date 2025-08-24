class Solution {
    public int minimumArea(int[][] grid) {

        int m = grid.length;//rows 
        int n = grid[0].length; // columns

        int min_r = m;
        int max_r = -1;

        int min_c = n;
        int max_c = -1;


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){// columns 
                if(grid[i][j] == 1 ){
                    min_r = Math.min(min_r, i);
                    max_r = Math.max(max_r, i);

                    min_c = Math.min(min_c, j);
                    max_c = Math.max(max_c, j);
                }
    


            }
        }

        return (max_r - min_r + 1)*(max_c - min_c + 1);

        
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)helper(grid,i,j,2);
            }
        }
        int ans=2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return -1;
                ans=Math.max(ans,grid[i][j]);
            }
        }
        return ans-2;
    }
    public void helper(int[][] grid,int i,int j,int min){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return;
        }
        if(grid[i][j]==0||(1<grid[i][j]&&grid[i][j]<min))return;
        grid[i][j]=min;
        helper(grid,i-1,j,min+1);
        helper(grid,i,j+1,min+1);
        helper(grid,i+1,j,min+1);
        helper(grid,i,j-1,min+1);
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;


        int islands = 0;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    dfs(grid, visited, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }
    void dfs(char[][] grid, boolean[][] visited, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return;
        if(grid[r][c]=='0' || visited[r][c])
            return;
        visited[r][c] = true;

        dfs(grid, visited, r-1,c);
        dfs(grid, visited, r+1,c);
        dfs(grid, visited, r,c-1);
        dfs(grid, visited, r,c+1);

    }
}

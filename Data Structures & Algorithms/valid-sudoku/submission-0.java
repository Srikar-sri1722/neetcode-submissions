class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(is_valid(board,i,j)==false)return false;
                }
            }
        }
        return true;
    }
    public boolean is_valid(char[][] board,int row,int col){
        for(int i=0;i<9;i++){
            if(col!=i && board[row][i]==board[row][col])return false;
        }
        for(int i=0;i<9;i++){
            if(row!=i && board[row][col]==board[i][col])return false;
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if((row!=i||col!=j)&&board[row][col]==board[i][j])return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> H = new HashSet<String>();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    
                    
                    if(H.contains("row" + i + board[i][j]) || H.contains("col" + j + board[i][j])) {
                        return false;
                    }
                    
                    H.add("row" + i + board[i][j]);
                    H.add("col" + j + board[i][j]);
                    
                    
                    if(H.contains("box" + (i/3)*3 + j/3 + board[i][j])) {
                        return false;
                    }
                    
                    H.add("box" + (i/3)*3 + j/3 + board[i][j]);
                }
            }
        }
        return true;
    }
}
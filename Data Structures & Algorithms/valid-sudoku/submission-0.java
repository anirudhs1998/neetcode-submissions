class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row=0; row<9;row++){
            Set<Character> hashset = new HashSet<>();
            for(int i =0; i<9;i++){
                if(board[row][i] == '.'){
                    continue;
                }
                if(hashset.contains(board[row][i])){
                    return false;
                }
                hashset.add(board[row][i]);
            }
        }
        
        for(int col = 0; col< 9;col++){
            Set<Character> hashset = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[j][col] == '.'){
                    continue;
                }
                if(hashset.contains(board[j][col])){
                    return false;
                }
                hashset.add(board[j][col]);
            }
        }

        for(int square = 0; square < 9; square++){
            Set<Character> hashset = new HashSet<>();
            for(int i =0; i<3;i++){
                for(int j = 0; j <3;j++){
                    int row = (square / 3) *3 + i;
                    int col = (square % 3) * 3 + j;
                    if(board[row][col] == '.') continue;

                    if(hashset.contains(board[row][col])){
                        return false;
                    }
                    hashset.add(board[row][col]);
                }
            }
        }

        return true;


        
    }
}

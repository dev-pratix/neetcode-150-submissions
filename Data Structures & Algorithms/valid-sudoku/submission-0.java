class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rowM = new HashMap<>();
        Map<Integer,Set<Character>> colM = new HashMap<>();
        Map<String,Set<Character>> square = new HashMap<>();

        for(int row = 0 ; row < 9 ; row++){
            for(int col = 0 ; col < 9 ; col++){
                if(board[row][col] == '.') continue;

                String squareKey = (row/3) +"," + (col/3);
                if(rowM.computeIfAbsent(row,k->new HashSet<>()).contains(board[row][col]) ||
                colM.computeIfAbsent(col,k->new HashSet<>()).contains(board[row][col]) ||
                square.computeIfAbsent(squareKey,k->new HashSet<>()).contains(board[row][col])){
                    return false;
                }

                rowM.get(row).add(board[row][col]);
                colM.get(col).add(board[row][col]);
                square.get(squareKey).add(board[row][col]);
            }
        }
        return true;

    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int r = 0 ; r<9 ; r++){
            for(int c = 0 ; c<9 ; c++){
                char val = board[r][c];
                int box = (r/3) * 3 + (c/3);
                if (val != '.'){
                     if(!rows[r].add(val) || !cols[c].add(val) || !boxes[box].add(val)){
                        return false; //This is because set.add returns false if duplicate
                     }
                }
            }

        }
        return true;
    }
}

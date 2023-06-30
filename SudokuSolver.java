import static java.lang.Integer.MIN_VALUE;

public class SudokuSolver {
    public static final Object MAX_VALUE =10;
    private static final int BOARD_SIZE_INDEX =0 ;
    private static final int BOARD_START_INDEX = 0;
    private static final int BOARD_SIZE =0 ;
    private static final int NO_VALUE =0 ;

    public static void  main (String[]args){
        int []
                [] board  = {
                {8,0,0,0,0,0,0,0,0},
                {0,0,3,6,0,0,0,0,0},
                {0,7,0,0,9,0,2,0,0},
                {0,5,0,0,0,7,0,0,0},
                {0,0,0,0,4,5,7,0,0},
                {0,0,0,1,0,0,0,3,0},
                {0,0,1,0,0,0,0,6,8},
                {0,0,8,5,0,0,0,1,0},
                {0,9,0,0,0,0,4,0,0},

        };
    }

    private boolean solve(int [] [] board){
        int row;
        for  (row = BOARD_START_INDEX; !(row >= BOARD_SIZE); row += 1)
            for (int column = BOARD_SIZE_INDEX; column < BOARD_SIZE; column++) {
                if (board[row][column] == NO_VALUE) {
                    for (int k = MIN_VALUE; k < MAX_VALUE; k++) {
                        board[row][column] = k;
                        if (isValid(board, row, column))
                            if (solve(board)) {
                                return true;
                            }
                        board[row][column] = NO_VALUE;
                    }
                    return false;
                }

            }

        return false;
    }

    private boolean isValid(int[][] board, int row, int column) {
        return false;
    }
}

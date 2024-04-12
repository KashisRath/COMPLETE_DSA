package S11_Backtracking;

public class S5_countNqueens{
    
     
    public static boolean isSafe(char board[][], int row, int col) {
        // Check for queens in the same column (above the current row)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check for queens in the left diagonal (above and to the left)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check for queens in the right diagonal (above and to the right)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void Nqueens(char board[][], int row) {
        // Base case: If all queens are placed, print the board
        if (row == board.length) {
            count++;
            return;
        }

        // Try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';  // Place the queen
                Nqueens(board, row + 1);  // Recur to the next row
                board[row][j] = 'x';  // Backtrack by removing the queen
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------------Chess Board--------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
 
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        
        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        Nqueens(board, 0);
        System.out.println("total ways to solve n queens= "+count);
    }
}


import java.util.*;

public class Queen{
    public static void nQueens(char board[][], int row) {
        if(row == board.length) {
            printBoard(board);
            countWays++;
            return;
        }
        //cols
        for(int j=0; j<board[0].length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);//function call
                board[row][j] = 'x';//backtraking step
            } 
        }
    }

    
   public static void printBoard(char board[][]) {
        System.out.println("---- safe board ----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        //up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //up left diag
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //up right diag
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int countWays = 0;
   
    public static void main(String args[])
    {
        int n=4;
        char board[][]=new char[n][n];

        for(int i=0 ; i<board.length ; i++)
        {
            for(int j=0 ; j<board[0].length ; j++)
            {
                board[i][j]='x';
            }
        }

        nQueens(board,0);

        System.out.println("Total number of ways = "+ countWays);

    }
}
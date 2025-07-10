//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//Note:
//A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//Only the filled cells need to be validated according to the mentioned rules.
package dsa;
import java.util.*;
public class ValidSudoko {

	public static boolean isValidSudoku(char[][] board) {
        // TODO: Implement your logic here
		Map<Integer,Set<Character>> rows = new HashMap<>();
		Map<Integer,Set<Character>> cols = new HashMap<>();
		Map<String,Set<Character>> squares = new HashMap<>();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]=='.')continue;
				String squaresKey = (i/3)+","+(j/3);
				if(rows.computeIfAbsent(i,k-> new HashSet<>()).contains(board[i][j])||
						cols.computeIfAbsent(j, k-> new HashSet<>()).contains(board[i][j])||
						squares.computeIfAbsent(squaresKey, k-> new HashSet<>()).contains(board[i][j])){
					return false;
				}
				rows.get(i).add(board[i][j]);
				cols.get(j).add(board[i][j]);
				squares.get(squaresKey).add(board[i][j]);
				
			}
		}
		
        return true;
    }

    public static void main(String[] args) {
        char[][] validBoard = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] invalidBoard = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Valid board result: " + isValidSudoku(validBoard));   // Should return true
        System.out.println("Invalid board result: " + isValidSudoku(invalidBoard)); // Should return false
    }

}

package LeetCode.ArraysAndHashing;
import java.util.*;

/*
Problem: Valid Sudoku

Pattern: Hashing / Duplicate Detection

Data Structure: HashSet

Algorithm: Validate the Sudoku board in three stages. First, traverse each
row and use a HashSet to detect duplicate digits. Clear the set after each
row. Next, repeat the same process for every column. Finally, traverse each
3x3 sub-box and check for duplicate digits using the same HashSet. Ignore
empty cells represented by '.'.

Time Complexity: O(1)

Reason: The Sudoku board always has a fixed size of 9x9. Rows, columns,
and sub-boxes each examine a constant number of cells.

Space Complexity: O(1)

Reason: The HashSet can contain at most 9 digits at any time, regardless
of input, and the remaining variables use constant extra space.

Key Idea: A valid Sudoku cannot contain duplicate filled digits within
any individual row, column, or 3x3 sub-box.
*/

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> entries = new HashSet<>();
        char entry;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                entry = board[row][column];
                if (entry != '.' && entries.contains(entry))
                    return false;
                else if (entry != '.')
                    entries.add(entry);
            }
            entries.clear();
        }
        for (int column = 0; column < 9; column++) {
            for (int row = 0; row < 9; row++) {
                entry = board[row][column];
                if (entry != '.' && entries.contains(entry))
                    return false;
                else if (entry != '.')
                    entries.add(entry);
            }
            entries.clear();
        }
        for (int row = 0; row < 9; row += 3) {
            for (int column = 0; column < 9; column += 3) {
                for (int subRow = row; subRow < row + 3; subRow++) {
                    for (int subColumn = column; subColumn < column + 3; subColumn++) {
                        entry = board[subRow][subColumn];
                        if (entry != '.' && entries.contains(entry))
                            return false;
                        else if (entry != '.')
                            entries.add(entry);
                    }

                }
                entries.clear();
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        ValidSudoku sudoku=new ValidSudoku();
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '5', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.print(sudoku.isValidSudoku(board));
    }
}
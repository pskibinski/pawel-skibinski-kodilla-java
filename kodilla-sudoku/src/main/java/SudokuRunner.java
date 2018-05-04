import com.kodilla.sudoku.SudokuBoard;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.addNumber();
        System.out.println(sudokuBoard);
    }
}

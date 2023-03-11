package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] b;
    private int size;
    public Board(Character[][] matrix) {
        this.b = matrix;
        this.size = this.b[0].length;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }

    public String getWinner() {
        int numX = 0;
        int numO = 0;
        Character letter;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                letter = this.b[row][col];
                if (letter.equals('X')) {
                    numX++;
                }
                else if (letter.equals('O')) {
                    numO++;
                }
            }
            if (numX == 3) {return "X";}
            else if (numO == 3) {return "O";}
            numX = 0;
            numO = 0;
        }

        for (int row = 0; row < size; row ++) {
            for (int col = 0; col < size; col ++) {
                letter = this.b[row][col];
                if (letter.equals('X')) {
                    numX++;
                }
                else if (letter.equals('O')) {
                    numO++;
                }
            }
            if (numX == 3) {return "X";}
            else if (numO == 3) {return "O";}
            numX = 0;
            numO = 0;
        }

        // diagonals
        if (b[0][0].equals('X') && b[1][1].equals('X') && b[2][2].equals('X')) { return "X"; }
        if (b[0][2].equals('X') && b[1][1].equals('X') && b[2][0].equals('X')) { return "X"; }
        if (b[0][0].equals('O') && b[1][1].equals('O') && b[2][2].equals('O')) { return "O"; }
        if (b[0][2].equals('O') && b[1][1].equals('O') && b[2][0].equals('O')) { return "O"; }

        return "";
    }

}

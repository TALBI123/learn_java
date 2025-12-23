package board;

import enums.*;
import java.util.ArrayList;
import utils.ColorText;

public class Board {
    public  int x = 7;
    private static Board instance;
    private Cell[][] cells;
    private ArrayList<Cell> lastCells;
    int boardSize = 3;

    private Board(int boardSize) {
        this.boardSize = boardSize;
        System.out.println("hh");
        this.cells = new Cell[this.boardSize][this.boardSize];
        this.lastCells = new ArrayList<>();
        this.createCells();
        System.out.println(this.cells[0][1]);
        System.out.println("Board");
    }

    public static Board getInstance(int boardSize) {
        if (instance == null) {
            instance = new Board(boardSize);
        }
        return instance;
    }

    public void backTracking() {
        for (int i = 0; i < this.boardSize; i++) {
            for (int j = 0; j < this.boardSize; j++) {
               Cell cell =   this.fillCell(Symbole.QUEN, j, i);

            }
        }
    }
    // boolean 
    public void printBoard() {
        System.out.println("");
        for (int i = 0; i < boardSize; i++) {
            System.out.println("\n\t" + " ".repeat(3) + "----".repeat(this.boardSize));
            System.out.print("\t" + " ".repeat(2) + "| ");
            for (int j = 0; j < boardSize; j++) {
                String cellValue = String.valueOf(cells[i][j].getSymboleValue().getValue());
                String textColored = ColorText.colorize(cellValue, (i * boardSize + j) % 2 == 1 ? Colors.RED : Colors.BLUE);
                System.out.print(textColored);
                if (j != boardSize - 1) {
                }
                System.out.print(" | ");
            }
            if (i != boardSize - 1) {
            }
        }
        System.out.println("\n\t" + " ".repeat(3) + "----".repeat(this.boardSize));
        System.err.println("\n");
    }

    @Override
    public String toString() {
        String obj = "Board : {\nboardSize:" + this.boardSize + ",\ncells : { ";
        for (int i = 0; i < this.boardSize; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Cell : " + this.cells[i][j]);
                obj += this.cells[i][j] + " ,\n";
            }
        }
        return super.toString();
    }

    private void createCells() {
        for (int i = 0; i < this.boardSize; i++) {
            for (int j = 0; j < this.boardSize; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell fillCell(Symbole symbole, int row, int col) {
        return this.cells[row][col].setSymboleValue(symbole);
    }      

    public static class Cell {

        private Symbole symboleValue;
        private int row;
        private int col;

        Cell(int row, int col) {
            this.symboleValue = Symbole.VIDE;
            this.row = row;
            this.col = col;
            // System.err.println(this.symboleValue);
        }

        public Cell setSymboleValue(Symbole symboleValue) {
            this.symboleValue = symboleValue;
            return this;
        }

        public int getRow() {
            return this.row;
        }

        public int getCol() {
            return this.col;
        }

        public Symbole getSymboleValue() {
            return this.symboleValue;
        }

        public boolean isEmpty() {
            return this.symboleValue == Symbole.VIDE;
        }

        @Override
        public String toString() {
            return "Cell : { symboleValue : " + this.symboleValue.getValue() + " }";
        }

    }
}

package Boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int linha, int coluna) {
        this.row = linha;
        this.column = coluna;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return row + "," + column;
    }
}

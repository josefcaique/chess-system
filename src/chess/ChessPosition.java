package chess;

public class ChessPosition {

    private Character column;
    private Integer row;

    public ChessPosition(Character column, Integer row) {
        this.column = column;
        this.row = row;
    }

    public Character getColumn() {
        return column;
    }

    public void setColumn(Character column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}

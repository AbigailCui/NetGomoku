package core;

import java.io.Serializable;
import java.util.Objects;

public class Move implements Serializable {
    public final int row;
    public final int col;

    /**
     * 移动方法
     * @param row 行
     * @param col 列
     */
    public Move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Move(char columnLetter, int rowNumber, int boardSize) {
        this.row = boardSize - rowNumber;
        this.col = (char) (columnLetter - 'A');
    }

    public String getAlgebraicString(int boardSize) {
        int rowAlgebraic = boardSize - row;
        char colAlgebraic = (char) ('A' + col);
        return new String(Character.toString(colAlgebraic) + rowAlgebraic);
    }

    @Override
    public String toString() {
        return String.format("[%d.%d]",row,col);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.row, this.col);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Move) {
            Move move = (Move) obj;
            return move.row == this.row && move.col == this.col;
        }
        return false;
    }
}

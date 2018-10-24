package core;

import java.io.Serializable;

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

    @Override
    public String toString() {
        return String.format("[%d.%d]",row,col);
    }
}

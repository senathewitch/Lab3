package Lab3;

import java.util.Objects;

class Squares {
    public final Integer row;
    public final String column;

    Squares(Integer row, String column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {

        return row;
    }

    public String getColumn() {

        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Squares)) return false;
        Squares squares = (Squares) o;
        return Objects.equals(row, squares.row) && Objects.equals(column, squares.column);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}

public abstract class Piece<Player> {
    int value;
    boolean isWhite;
    Player player;

    public Piece(int i, boolean b) {
        this.value = value;
        this.player = player;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void move();
}

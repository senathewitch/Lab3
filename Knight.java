package Lab3;

public class Knight extends Piece{
    public Knight(int value, Object o) {
        super(2, false);
    }

    public Knight() {
        super(2, false);
    }

    public Knight(boolean isWhite) {
        super(2, true);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString(){
        return "Knight{value='" + value + "'}";
    }

}

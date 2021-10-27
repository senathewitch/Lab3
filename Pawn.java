package Lab3;

public class Pawn extends Piece{
    public Pawn(int value, Object o) {
        super(2, false);
    }

    public Pawn() {
        super(2, false);
    }

    public Pawn(boolean isWhite) {
        super(2, true
        );
    }

    public Pawn(boolean b, Queen o) {
        super(2, false);
    }

    public Pawn(boolean b, Knight knight) {
        super(2, false);
    }

    @Override
    public void move() {
        System.out.println("One step forward");
    }

    @Override
    public String toString(){
        return "Pawn{value='" + value + "2}";
    }
}

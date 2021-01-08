package Piece;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Coordinate)
            return ((x == ((Coordinate)obj).getX()) && (y == ((Coordinate)obj).getY()));
        return false;
    }

    @Override
    public int hashCode() {
        return x*199 + y;
    }

    @Override
    public String toString() {
        return "" +
                "(" + x +
                "," + y +
                ") : ";
    }
    
    public static void main(String[] args) {
		
    	Coordinate c1 = new Coordinate(1,1);
    	Coordinate c2 = new Coordinate(2,1);
    	System.out.println(c1.equals(c2));

	}
}

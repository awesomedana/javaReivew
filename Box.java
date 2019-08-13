import java.security.InvalidParameterException;

public class Box {
	int x;
	int y;
	
	public Box(int theX, int theY) {
		x = theX;
		y = theY;
	}
	
	public int getArea() {
		return x*y;
	}

	public void setSize(int theX, int theY) throws InvalidParameterException {
		if (theX < 0 || theY < 0) {
			throw new InvalidParameterException();
		}
		x = theX;
		y = theY;
	}
	
	public static void main(String[] args) {
		Box b1 = new Box(10, 15);
		System.out.println("Area: " + b1.getArea());
	}

}

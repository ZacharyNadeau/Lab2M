
public class Fraction implements INumber {
	
	private int numerator = 0;
	private int denominator = 0;
	
	public Fraction(int x, int y) {
		numerator = x;
		denominator = y;
	}
	
	@Override
	public Object plus(Object input) {
		return null;
	}

	@Override
	public Object minus(Object input) {
		return null;
	}

	@Override
	public Object divide(Object input) {
		return null;
	}

	@Override
	public Object multiply(Object input) {
		return null;
	}
	
	@Override
	public void print() {
	/*
	 * Samuel Fickett
	 * Prints out the Fraction as a String
	 */
	public void print() {
		String str = "";
		str += numerator + "/" + denominator;
		System.out.println(str);
	}
	
	public int compare(Fraction F) {
		return 0;
	}
	
	public int getNum() {
		return numerator;
	}

	public int getDenom() {
		return denominator;
	}


}

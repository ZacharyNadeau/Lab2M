public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int compare(Fraction F) {
		if ((double) this.numerator / this.denominator < (double) F.numerator / F.denominator) {
			return -1;
		} else if ((double) this.numerator / this.denominator > (double) F.numerator / F.denominator) {
			return 1;
		}
		return 0;
	}

	public Fraction minus(Fraction input) {
		int Denominator = this.denominator * input.denominator;
		int Numerator = (this.numerator * input.denominator) - (input.numerator * this.denominator);
		return new Fraction(Numerator, Denominator);
	}

	public static Fraction findMax(Fraction[] input) {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("INVALID array may be empty or null.");
		}

		Fraction maxFraction = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i].compare(maxFraction) > 0) {
				maxFraction = input[i];
			}
		}

		return maxFraction;
	}

	public static Fraction findMin(Fraction[] input) {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("INVALID array may be empty or null.");
		}

		Fraction minFraction = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i].compare(minFraction) < 0) {
				minFraction = input[i];
			}
		}

		return minFraction;
	}
}

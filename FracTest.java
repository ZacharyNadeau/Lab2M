
public class FracTest {

	public static void main(String[] args) {
		Fraction frac1 = new Fraction(2, 5);
		Fraction frac2 = new Fraction(3, 8);
		Fraction frac3 = new Fraction(7, 23);
		
		/*
		 * Samuel Fickett
		 * These three statement output all three results 
		 * of the compare method
		 */
		System.out.println(frac1.compare(frac2)); // output: 1
		System.out.println(frac3.compare(frac2)); // output: -1
		System.out.println(frac1.compare(new Fraction(2, 5))); // output: 0
		
		Fraction[] fractionArray = new Fraction[100];
		for (int i = 0; i < fractionArray.length; ++i) {
			fractionArray[i] = new Fraction(i, i+1);
		}
		
		Fraction testMult1 = new Fraction(frac1.multiply(frac2));
		Fraction testMult2 = new Fraction(frac2.multiply(frac3));
		Fraction testMult3 = new Fraction(frac1.multiply(frac1));
		testMult1.print();
		testMult2.print();
		testMult3.print();
		
		Fraction testMinus1 = new Fraction(frac1.minus(frac2));
		Fraction testMinus2 = new Fraction(frac2.minus(frac3));
		Fraction testMinus3 = new Fraction(frac2.minus(frac2));
		testMinus1.print();
		testMinus2.print();
		testMinus3.print();
		
		Fraction testDivide1 = new Fraction(frac1.divide(frac2));
		Fraction testDivide2 = new Fraction(frac2.divide(frac3));
		Fraction testDivide3 = new Fraction(frac3.divide(frac3));
		testDivide1.print();
		testDivide2.print();
		testDivide3.print();
		
		System.out.println(getCountGreater(fractionArray, new Fraction(3,4)));
		System.out.println(getCountGreater(fractionArray, new Fraction(5,2)));	
		System.out.println(getCountGreater(fractionArray, new Fraction(49,50)));
		
		Fraction testFrac = new Fraction(fractionArray[2].plus(fractionArray[3]));
		testFrac.print();
		
		Fraction testFrac1 = new Fraction(fractionArray[6].plus(fractionArray[8]));
		testFrac1.print();
		
		Fraction testFrac2 = new Fraction(fractionArray[4].plus(fractionArray[6]));
		testFrac2.print();
		
		Fraction max = new Fraction(findMax(fractionArray));
		Fraction min = new Fraction(findMin(fractionArray));
		max.print();
		min.print();
	}

  //Zach
	 public static int getCountGreater(Fraction[] inputArray, Fraction inputFraction) {
		// Initialize the counter
	    int count = 0;

		// Iterate through the array and compare each fraction
		for (Fraction fraction : inputArray) {
	        int commonDenominator = inputFraction.getDenom() * fraction.getDenom();

	        int commonNumerator1 = inputFraction.getNum() * (commonDenominator / inputFraction.getDenom());
	        int commonNumerator2 = fraction.getNum() * (commonDenominator / fraction.getDenom());

	        // Compare the numerators
	        if (commonNumerator1 < commonNumerator2) {
	            count++;
	        }
	    }

	    return count;
	}

  //Abdul
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

  //Abdul
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

  //Patrick
	void selectionSort(Fraction[] input)
	{
		for(int i = 0; i < input.length - 1; i++)
		{
			int smallestFrac = i;
			for(int j = i+1; j < input.length; j++)
			{
				if(input[j].compare(input[smallestFrac]) < 0)
						{
							smallestFrac = j;
						}
			}
			swap(input,i,smallestFrac);
		}
	}

  //Patrick
	void swap(Fraction[] input, int pos1, int pos2)
	{
		Fraction frac1 = input[pos1];
		Fraction frac2 = input[pos2];
		input[pos1] = frac2;
		input[pos2] = frac1;
	}

}

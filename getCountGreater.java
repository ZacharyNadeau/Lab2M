public class test {
 public static void main(String[] args) {
	Fraction[] fractionArray = new Fraction[100];
	for(int i = 0; i < fractionArray.length; i++) {
		fractionArray[i] = new Fraction(i, i+1);
		
	}
	System.out.println(getCountGreater(fractionArray, new Fraction(3,4) ));
	
	System.out.println(getCountGreater(fractionArray, new Fraction(5,2) ));
	
	System.out.println(getCountGreater(fractionArray, new Fraction(49,50) ));
	
	Fraction testFrac = new Fraction(fractionArray[2].add(fractionArray[3]));
	testFrac.print();
	
	Fraction testFrac1 = new Fraction(fractionArray[6].add(fractionArray[8]));
	testFrac1.print();
	
	Fraction testFrac2 = new Fraction(fractionArray[4].add(fractionArray[6]));
	testFrac2.print();
 }
 
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
 
}

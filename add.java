public Fraction add(Object input) {
		int num = getNum();
	    
	    int dom = getDenom();
	    
	    
	    int num2 = ((Fraction) input).getNum();
	    
	    int dom2 = ((Fraction) input).getDenom();
	    
	    // Find the least common multiple (LCM) of the two denominators
	    int lcm = findLCM(dom, dom2);
	    
	    // Convert both fractions to have a common denominator (LCM)
	    int commonDenominator = lcm;
	    int commonNumerator1 = num * (lcm / dom);
	    int commonNumerator2 = num2 * (lcm / dom2);
	    
	    // Add the two fractions
	    int sumNumerator = commonNumerator1 + commonNumerator2;
	    
	    // Simplify the result by finding the greatest common divisor (GCD)
	    int gcd = findGCD(sumNumerator, commonDenominator);
	    
	    // Simplify the fraction by dividing both the numerator and denominator by the GCD
	    int simplifiedNumerator = sumNumerator / gcd;
	    int simplifiedDenominator = commonDenominator / gcd;
	    
	    
	    Fraction answer = new Fraction(simplifiedNumerator, simplifiedDenominator);
	    	return answer;
	  
	    

		}
	// Method to find the least common multiple
	private static int findLCM(int a, int b) {
	    return (a * b) / findGCD(a, b);
	}

	// Method to find the greatest common denominator
	private static int findGCD(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
		

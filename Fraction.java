
public class Fraction implements INumber {
	
	private int numerator = 0;
	private int denominator = 0;
	
	public Fraction(int x, int y) {
		numerator = x;
		denominator = y;
	}
	
	public Fraction(Object input) {
		numerator = ((Fraction) input).getNum();
		denominator = ((Fraction) input).getDenom();
	}
	
	@Override
	//Zach
	public Fraction plus(Object input) {
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

	@Override
	// Abdul
	public Fraction minus(Object input) {
		int Denominator = this.denominator * ((Fraction) input).getDenom();
		int Numerator = (this.numerator * ((Fraction) input).getDenom()) - (((Fraction) input).getNum() * this.denominator);
		return new Fraction(Numerator, Denominator);
	}

	@Override
	/*
	 * Samuel Fickett
	 * Divides the current Fraction object by another Fraction object, then creates
	 * a new Fraction object using the new data
	 * @param input the inputed Fraction object
	 * @return newFrac a new Fraction object obtained with the results from the division
	 */
	public Fraction divide(Object input) {
		int top = 0;
		int bottom = 0;
		
		top = this.numerator * ((Fraction) input).getDenom();
		bottom = this.denominator * ((Fraction) input).getNum();
		
		Fraction newFrac = new Fraction(top, bottom);
		return newFrac;
	}

	@Override
	//Patrick
	public Object multiply(Object input) {
		int top1 = ((Fraction)input).getNum();
		int top2 = this.numerator;
		int bottom1 = ((Fraction) input).getDenom();
		int bottom2 = this.denominator;
		boolean isReduced;
		for(int i = 2; i <= top2 && i <=bottom1; i++)
		{
			isReduced = false;
			while(isReduced == false)
			{
				if((double) top2/i == top2/i && (double) bottom1/i == bottom1/i)
				{
					top2 = top2/i;
					bottom1 = bottom1/i;
				
				}
				else
				{
					isReduced = true;
				}
			}
		}
		for(int i = 2; i <= top1 && i <=bottom2; i++)
		{
			isReduced = false;
			while(isReduced == false)
			{
				if((double) top1/i == top1/i && (double) bottom2/i == bottom2/i)
				{
					top1 = top1/i;
					bottom2 = bottom2/i;
				
				}
				else
				{
					isReduced = true;
				}
			}
		}
	
		int top = top1 * top2;
		int bottom = bottom1 * bottom2;
		Fraction newFrac  = new Fraction(top, bottom);
		return newFrac;
	}
	
	@Override
	/*
	 * Samuel Fickett
	 * Prints out the Fraction as a String
	 */

	public void print() {	
		String str = "";
		str += numerator + "/" + denominator;
		System.out.println(str);
	}
	
	/*
	 * Samuel Fickett
	 * Compares two Fraction objects
	 * @param F Fraction being compared to
	 * @return result after comparing
	 */
	public int compare(Fraction F) {
		if ((double)(this.numerator)/this.denominator < (double)(F.getNum())/F.getDenom()) {
			return -1;
		}
		else if ((double)(this.numerator)/this.denominator > (double)(F.getNum())/F.getDenom()) {
			return 1;
		}
		return 0;
	}
	
	public int getNum() {
		return numerator;
	}

	public int getDenom() {
		return denominator;
	}


}

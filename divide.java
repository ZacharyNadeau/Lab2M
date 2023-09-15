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

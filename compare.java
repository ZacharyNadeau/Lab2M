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

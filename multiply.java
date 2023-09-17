

public Fraction multiply(Object input) {
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
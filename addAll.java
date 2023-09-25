/*
	 * Samuel Fickett
	 * This method adds an array of Fraction objects to 
	 * the existing arraylist
	 * @param frc the input arraylist of Fraction objects
	 * @return true
	 */
	public static boolean addAll(Fraction[] frc) {
		int index = list.indexOf(list.get((next()));
		for (int i = 0; i < list.size(); ++i) {
			list.add(index ,frc[i]);
		}
		return true;
	}

/*
	 * Samuel Fickett
	 * Searches through the list and returns the index
	 * of the first object that matches the input
	 * @param input the base object being matched for 
	 * @return i index of the first matching Fraction object
	 */
	public static int indexOf(Fraction input) {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).compare(input) == 0) {
				return i;
			}
		}
		return -1;
	}

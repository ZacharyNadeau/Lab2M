	/*
	 * Samuel Fickett
	 * This method removes all Fraction objects after
	 * the return method from next() would be called
	 */
public static void removeAllNext() {
		int index = list.indexOf(list.get(next()));
		while(hasNext()) {
			list.remove(index);
			next();
		}
	}

/**
	 * Abdul Addan Returns the next element in the list and advances the iterator
	 * forward.
	 * 
	 * @return the next element in the list
	 * @throws IllegalStateException if there is no next element
	 */
	public class myListIterator {
		private int listIndex = -1; // Initialize to -1, so next() starts from the first element

		public Fraction next() {
			if (!hasNext()) {
				throw new IllegalStateException("No next element.");
			}
			listIndex++;
			return list.get(listIndex);
		}

		/**
		 * Abdul Addan Returns the previous element in the list and moves the iterator
		 * backward.
		 * 
		 * @return the previous element in the list
		 * @throws IllegalStateException if there is no previous element
		 */
		public Fraction previous() {
			if (!hasPrevious()) {
				throw new IllegalStateException("No previous element.");
			}
			listIndex--;
			return list.get(listIndex);
		}

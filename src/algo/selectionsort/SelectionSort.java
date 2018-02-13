package algo.selectionsort;

public class SelectionSort {

	/**
	 * @param integer [] data The array to be sorted
	 * @param integer start Start sorting from a given position
	 *
	 * @return integer []
	 */
	public int [] sort(int [] data, int start) {

		int min = data[start];
		int minOldPosition = 0;
		boolean hasNewMin = false;

		// start + 1
		for (int i = start + 1; i < data.length ; i++) {
			if (data[i] < min) {
				// so we found a smaller value!
				hasNewMin = true;
				min = data[i];
				minOldPosition = i;
			}
		}

		if (hasNewMin) {
			// swap it!
			data[minOldPosition] = data[start];
			data[start] = min;
		}

		if (data.length != start + 1) {
			data = sort(data, start + 1);
		}

		return data;
	}
}

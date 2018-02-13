package algo.binarysearch;

// data must be sorted
public class BinarySearch {

	public int search(int data, int [] list) {

		int a = 0; // left
		int b = list.length - 1; // right

		while (a<=b) {
			int p = (a + b) / 2; // position

			if (data==list[p]) {
				return p;
			}

			if (data<list[p]) {
				b = p-1;
			} else {
				a = p+1;
			}
		}

		return -1;
	}
}

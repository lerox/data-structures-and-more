package algo.linearsearch;

// O(n)
public class LinearSearch {
	public int getPosition(int [] a, int key) {
		for (int i=0; i<a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
}

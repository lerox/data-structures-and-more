package algo.selectionsort;

public class App {
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();

		int [] myArray = selectionSort.sort(new int [] {100, 99, 98, 33, 999, 99999, 34, 2}, 0);

		for (int a = 0; a < myArray.length; a++) {
			System.out.println(myArray[a]);
		}
	}
}

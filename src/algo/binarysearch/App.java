package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();

		int [] sortedData = {1, 2, 3, 4, 70, 80, 100, 1000, 1200};

		System.out.println(binarySearch.search(80, sortedData));
	}
}

package algo.linearsearch;

public class App {

	public static void main(String[] args) {

		int [] data = {1, 2, 5, 9, 10, 8, 6};

		LinearSearch linearSearch = new LinearSearch();

		System.out.println(linearSearch.getPosition(data, 10));
	}
}

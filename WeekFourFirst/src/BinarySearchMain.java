
class BinarySearch {

	public static void binarySearch1(int key, int[] arr) {

		int n = arr.length;
		int first = 0;
		int last = n - 1;

	}

	public static void binarySearch(int key, int[] arr) {

		int length = arr.length - 1;

		int start = 0;
		int mid = (start + length) / 2;

		while (start <= length) {

			if (arr[mid] == key) {
				System.out.println("key is found in mid");
				break;
			}

			if (arr[mid] < key) {
				start = mid + 1;

			} else {
				length = mid - 1;
			}
			mid = (start + length) / 2;

		}

		if (start > length) {
			System.out.println("key not found");
		}

	}
}

public class BinarySearchMain {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 9, 12, 15 };
		int key = 12;
		BinarySearch.binarySearch(key, arr);

	}

}

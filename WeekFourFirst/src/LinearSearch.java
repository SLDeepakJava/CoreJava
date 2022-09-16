import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elment to be searched");
		int key = sc.nextInt();

		int result = searchValue(arr, key);
		if (result == 1) {
			System.out.println("key found");
		} else {
			System.out.println("key not found");
		}

	}

	public static int searchValue(int[] arr, int key) {
		long startTime = System.nanoTime();    
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				long estimatedTime = System.nanoTime() - startTime;
				System.out.println("time take to find : " + estimatedTime);
				return 1;
			}
		}
		
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println("time take to find : " + estimatedTime);
		return -1;
	}

}

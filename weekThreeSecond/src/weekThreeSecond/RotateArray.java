package weekThreeSecond;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;

		int[] result = new int[nums.length];// 6 7 
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
			
			//result[0] = nums[7 - 2 + 0]
			//result[1] = nums[7 - 2 + 1]
			
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);

	}

	public static void main(String[] args) {

		RotateArray r = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		r.rotate(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// input : 1 2 3 4 5 6 7 no : 4
		// output : 4 5 6 7 1 2 3

		// input : 1 2 3 4 5 6 7 no : 3
		// output : 5 6 7 1 2 3 4

	}

}


public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,7,8,9,1,5};
		for(int i: arr) {
			System.out.print(i + " ");
		}
		int n = arr.length;
		QuickSort qs = new QuickSort();
		qs.sort(arr,0,n-1);
		
		System.out.println("sorted array");
		for(int i: arr) {
			System.out.print(i + " ");
		}

	}

	private void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			
			int pi = partition(arr,low,high);
			
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
		
	}

	private int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		int pivot = arr[high];
		int i= (low-1);
		
		for(int j=low;j<high;j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

}

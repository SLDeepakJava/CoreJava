
public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {70,20,30,40};
		
		System.out.println("given array elements");
		printArray(arr);
		
		MergeSort ms = new MergeSort();
		ms.sort(arr,0,arr.length-1);
		
		System.out.println("after merging sort");
		printArray(arr);
		
	}

	private void sort(int[] arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		
		if(startIndex < endIndex) {
			
			int mid = (startIndex+endIndex)/2;
			
			sort(arr,startIndex,mid);//left array
			sort(arr,mid+1,endIndex);//right array
			
			merge(arr,startIndex,mid,endIndex);
		}
		
	}

	private void merge(int[] arr, int startIndex, int mid, int endIndex) {
		// TODO Auto-generated method stub
		
		int n1 = mid - startIndex + 1;
		int n2 = endIndex - mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for(int i=0;i<n1;++i) {
			leftArr[i] = arr[startIndex + i];
		}
		for(int j = 0;j<n2;++j) {
			rightArr[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = startIndex;
		
		while(i<n1 && j<n2) {
			
			if(leftArr[i] <= rightArr[j]) {
				
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		
		while(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
		
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		
	}

}


public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,1,6,3};
		int length = arr.length;
		selectionSort(arr);
		System.out.println("after selection sort");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		

	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			
			int index = i;
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[j] < arr[index]) {
					
					index = j;
				}
			}
			
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
			
		}
		
	}

}

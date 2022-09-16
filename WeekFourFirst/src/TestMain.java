import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestMain {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Jhon");
		list.add("Deepak");
		list.add("Abc");
		list.add("Camel");
		System.out.println(list);
		System.out.println("---after sorting--");
		//Collections and collection
		Collections.sort(list); // utilty class
	//	System.out.println(Collections.reverseOrder());
		System.out.println(list);
		
		int[] arr = {10,3,2,50,5};
		Arrays.sort(arr);// utility class
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}

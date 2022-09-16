class Stack {

	static final int max = 5;
	int[] arr = new int[max];
	int top;

	Stack() {
		top = -1;
	}

	// insert data in stack
	boolean push(int x) {

		
		/*java.util.Stack s = new java.util.Stack<>();
		s.push(10);
		s.pop();*/
		
		if (top >= (max - 1)) { // to check if stack is full or not
			System.out.println("stack overflow ");
			return false;
		} else {
			arr[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}

	}

	// to remove data from stack
	int pop() {

		int x = arr[top--];
		System.out.println(x + " data popped from stack");
		return x;
	}

}

public class StackMain {

	public static void main(String[] args) {

		System.out.println("insert data into stack");
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(40);

		System.out.println("------------------");
		
		s.pop();
		s.pop();


	}

}

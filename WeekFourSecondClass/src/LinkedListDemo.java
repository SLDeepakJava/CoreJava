
class LinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static LinkedList insert(int data, LinkedList list) {

		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {

			list.head = new_node;
		} else {

			//
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		// TODO Auto-generated method stub
		return list;
	}
	
	public static void printLinkedList(LinkedList list) {
		Node currNode = list.head;
		
		while(currNode!=null) {
			
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
}

}

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// insert value in linkedlist
		list = list.insert(10, list);
		list = list.insert(20, list);
		list = list.insert(30, list);
		list = list.insert(40, list);
		//System.out.println(list.head.next.next.data);
		
		list.printLinkedList(list);
	}

	

}

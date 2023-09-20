package LinkedList;

public class MyLinkedList<T> {
	Node<T> head = null;
	int length = 0;
	
	void makeHead(T e) {
		length++;
		head = new Node<>(e);
	}
	
	void add(T e) {
		if(length == 0) {
			makeHead(e);
			return;
		}
		
		length++;		
		Node<T> pre = head;
		while(pre.next != null) {
			pre = pre.next;
		}
		pre.next = new Node<T>(e);
		pre.next.pre = pre;

	}
	
	void add(T e, int index) {
		if(index > length) {
			System.out.println("Index Out Of Bounds!");
			return;
		}
		
		length++;
		if(index == 0) {
			Node<T> target = new Node<>(e);
			target.next = head;
			head.pre = target;
			head = target;
		}else {
			Node<T> pre = head;
			for(int i = 0; i < index - 1; i++) {
				pre = pre.next;
			}
			if(pre.next == null) {
				pre.next = new Node<>(e);
				pre.next.pre = pre;
				return;
			}
			
			pre.next.pre = new Node<>(e);
			pre.next.pre.pre = pre;
			pre.next.pre.next = pre.next;
			pre.next = pre.next.pre;
		}
		
	}
	
	void add(T e, Node<T> target) {		
		Node<T> pre = head;
		
		while(pre != null && pre.equals(target) == false) {
			pre = pre.next;
		}
		
		if(pre == null) {
			System.out.println("target not found!");
			return;
		}
		
		length++;
		if(pre.next == null) {
			pre.next = new Node<>(e);
			pre.next.pre = pre;
			return;
		}
		
		pre.next.pre = new Node<>(e);
		pre.next.pre.pre = pre;
		pre.next.pre.next = pre.next;
		pre.next = pre.next.pre;
	}
}

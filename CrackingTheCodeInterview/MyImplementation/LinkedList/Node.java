package LinkedList;

public class Node <T>{
	Node<T> pre;
	Node<T> next;
	T data;
	
	Node(T data){
		this.data = data;
	}
}

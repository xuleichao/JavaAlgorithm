package Practices;

public class LinkedList<E> {
	
	private Node head;
	private int size;
	
	private class Node{
		public E value;
		public Node next;
		
		public Node(E ele, Node next){
			this.value = ele;
			this.next = next;
		}
		
		public Node(E ele){
			this(ele, null);
		}
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("LinkedList is: ");
		Node N = head;
		while(N != null){
			System.out.println(N.value);
			res.append(N.value + "->");
			N = N.next;
		}
		res.append("null");
		return res.toString();
	}
	
	public LinkedList(E ele){
		head = new Node(ele);
		head.next = null;
		size = 1;
	}
	
	public LinkedList(){
		this(null);
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void insert(E element){
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		size += 1;
	}
	
	public static void main(String[] args){
		LinkedList<Object> LL = new LinkedList<>("E");
		System.out.println(LL);
		System.out.println(LL.getSize());
		LL.insert("ele");
		System.out.println(LL.getSize());
		System.out.println(LL);
	}
	

}

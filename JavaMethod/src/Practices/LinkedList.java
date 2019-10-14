package Practices;

public class LinkedList<E> {
	
	private Node head;
	private int size;
	private Node dummyNode = new Node(null);
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
			res.append(N.value + "->");
			N = N.next;
		}
		res.append("null");
		return res.toString();
	}
	
	public LinkedList(E ele){
		head = new Node(ele);
		head.next = null;
		dummyNode.next = head;
		size = 1;
	}
	
	public LinkedList(){
		this(null);
		dummyNode.next = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void addFirst(E element){
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		dummyNode.next = head;
		size += 1;
	}
	
	//在链表第n个元素的之前添加一个节点
	public void addItem(E ele, int index){
		if (index < 0 | index >= getSize())
			throw new IllegalArgumentException("The index is illegal");
		//Node prev;
		// 对索引为 0 的索引特殊处理
		if (index == 0)
			addFirst(ele);
		// 任意位置添加元素
		Node pin = head;
		for(int i = 0; i < index-1; i++){
			pin = pin.next;
		}
		Node newNode = new Node(ele, pin.next);
		pin.next = newNode;
		size++;
	}
	
	//在链表第n个元素的之前添加一个节点
		public void addItemWithDummy(E ele, int index){
			if (index < 0 | index >= getSize())
				throw new IllegalArgumentException("The index is illegal");
			//Node prev;
			// 任意位置添加元素
			Node pin = dummyNode;
			for(int i = 0; i < index; i++){
				pin = pin.next;
			}
			
			Node newNode = new Node(ele, pin.next);
			pin.next = newNode;
			size++;
		}
	
	public static void main(String[] args){
		LinkedList<Object> LL = new LinkedList<>("E");
		System.out.println(LL);
		LL.addFirst("ele");
		System.out.println(LL);
		LL.addItem("add", 1);
		System.out.println(LL);
		LL.addItem("add", 2);
		System.out.println(LL);
		LL.addItemWithDummy("addDummy", 0);
		System.out.println(LL);
	}
	

}

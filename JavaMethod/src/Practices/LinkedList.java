package Practices;

public class LinkedList<E> {
	
	private int size;
	private Node dummyNode;
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
		Node N = dummyNode.next;
		while(N != null){
			res.append(N.value + "->");
			N = N.next;
		}
		res.append("null");
		return res.toString();
	}
	
	public LinkedList(E ele){
		dummyNode = new Node(ele, null);
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
		newNode.next = dummyNode.next;
		dummyNode.next = newNode;
		size += 1;
	}
	
	//�������n��Ԫ�ص�֮ǰ���һ���ڵ�
	public void addItem(E ele, int index){
		if (index < 0 | index >= getSize())
			throw new IllegalArgumentException("The index is illegal");
		//Node prev;
		// ������Ϊ 0 ���������⴦��
		if (index == 0)
			addFirst(ele);
		// ����λ�����Ԫ��
		Node pin = dummyNode.next;
		for(int i = 0; i < index-1; i++){
			pin = pin.next;
		}
		Node newNode = new Node(ele, pin.next);
		pin.next = newNode;
		size++;
	}
	
	//�������n��Ԫ�ص�֮ǰ���һ���ڵ�
		public void addItemWithDummy(E ele, int index){
			if (index < 0 | index >= getSize())
				throw new IllegalArgumentException("The index is illegal");
			//Node prev;
			// ����λ�����Ԫ��
			Node pin = dummyNode;
			for(int i = 0; i < index; i++){
				pin = pin.next;
			}
			
			Node newNode = new Node(ele, pin.next);
			pin.next = newNode;
			size++;
		}
	
	// TODO
	public E get(int index){
		Node cur = dummyNode.next;
		for(int i = 0; i < index; i++){
			cur = cur.next;
		}
		return cur.value;
	}
	
	// TODO �޸����� idx ��Ԫ��
	public void changeEle(int idx, E ele){
		Node cur = dummyNode.next;
		for(int i = 0; i < idx; i++){
			cur = cur.next;
		}
		cur.value = ele;
	}
	
	// TODO �鿴�Ƿ����
	public boolean contains(E ele){
		Node cur = dummyNode;
		while (cur.next != null){
			if (cur.value.equals(ele))
				return true;
			cur = cur.next;
		}
		return false;
	}
	
	// TODO ɾ��Ԫ��
	public void remove(int index){
		if (index < 0 | index > size){
			throw new IllegalArgumentException("index out of size");
		}
		Node cur = dummyNode;
		for(int i = 0; i < index; i++){
			cur = cur.next;
		}
		cur.next = cur.next.next;
		//cur.next.next = null;
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
		System.out.println(LL.contains("ele"));
		LL.remove(1);
		System.out.println(LL);
		System.out.println(LL.contains("ele"));
	}
	

}

package DataStructures;

/*链表的实现
 * 
 */

public class SingleLinkedList {
	
	//定义私有变量head
	private Node head;
	
	//在链头插入
	public void insertHead(int x){
		Node newhead = new Node(x);
		newhead.next = head;
		head = newhead;
	}
	
	// 在第n 个位置插入
	public void insertNth(int x, int position){
		// 判断是否可以被删除
		if (position < 0 || position > getSize()){
			throw new RuntimeException("input position is not satisfied.");
		}
		
		else if (position == 0){
			insertHead(x);
		}
		Node newNode = new Node(x);
		//遍历链表， 找到被插入的位置
		Node cur = head;
		for(int i=1; i<position; ++i){
			cur = cur.next;
		}
		
		cur.next = newNode;
		newNode.next = cur.next;
	}
	
	private int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	// delete head node
	public void deleteHead(){
		if (isEmpty()){
			throw new RuntimeException("the Linked list is empty.");
		}
		head = head.next;
	}
	
	//delete nth node
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteNthNode(int position){
		// 判断是否可以被删除
		if (position < 0 || position > getSize()){
			throw new RuntimeException("input position is not satisfied.");
		}
				
		
		if (isEmpty()){
			throw new RuntimeException("the Linked list is empty.");
		}
		
		if (position == 0){
			deleteHead();
		}
		
		Node cur = head;
		for(int i=1; i<position; i++){
			cur = cur.next;
		}
		cur.next = cur.next.next;
	}
	
	public static void main(String args[]){
		SingleLinkedList mylist = new SingleLinkedList();
		assert mylist.isEmpty();
		mylist.insertHead(2);
		mylist.display();
		mylist.insertHead(1);
		mylist.display();
		assert mylist.isEmpty();  //?????????
		System.out.println(mylist.isEmpty());
		for(int i=0; i<10; ++i){
			System.out.println(i);
		}
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}
}


class Node {
	
	int value;
	Node next;
	// 构造器 Constructor
	Node(int value){
		this.value = value;
		this.next = null;
	}
}

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

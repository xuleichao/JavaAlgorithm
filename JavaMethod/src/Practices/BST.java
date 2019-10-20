package Practices;

public class BST <E extends Comparable<E>>{
	
	private class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int ele){
			val = ele;
			left = null;
			right = null;
		}
	}
	
	// 根节点
	Node root;
	int size;
	
	public BST(){
		root = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	//TOOD add elements
}

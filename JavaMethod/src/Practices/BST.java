package Practices;

public class BST <E extends Comparable<E>>{
	
	private class Node{
		E val;
		Node left;
		Node right;
		
		public Node(E ele){
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
	
	//add elements 不处理相等的情况，非递归实现
	public void add(Node root, E ele){
		if (root == null){
			root = new Node(ele);
			return;
		}
		Node NN = root;
		while (NN != null){
			if (ele.compareTo(NN.val) < 0){
				NN = NN.left;
			}
			else if (ele.compareTo(NN.val) > 0){
				NN = NN.right;
			}
			else{
				return;
			}
		}
		NN = new Node(ele);
	}
	
	public void addItem(E ele){
		
	}
	
	private Node addItem(Node N, Integer ele){
		return N;
	}
	
	// toString
	@Override
	public String toString(){
		return "";
	}
}

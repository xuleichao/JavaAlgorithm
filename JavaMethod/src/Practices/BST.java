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
	
	//add elements 不处理相等的情况，非递归实现
	public void add(Node root, Integer ele){
		if (root == null){
			root = new Node(ele);
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
				
			}
		}
		NN = new Node(ele);
	}
	
	// toString
	@Override
	public String toString(){
		return "";
	}
}

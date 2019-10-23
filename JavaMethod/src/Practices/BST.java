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
			size ++;
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
		size ++;
	}
	
	public void addItem(E ele){
		if (root == null){
			root = new Node(ele);
			size ++;
			return;
		}
		addItem(root, ele);
		size ++;
	}
	
	private void addItem(Node N, E ele){
		if (N.val.compareTo(ele) < 0){
			if (N.right != null){
				addItem(N.right, ele);
			}
			else{
				N.right = new Node(ele);
			}
		}
		else{
			if (N.left != null){
				addItem(N.left, ele);
			}
			else{
				N.left = new Node(ele);
			}
		}
	}
	
	public void forthTraverse(Node nn){
		if (nn == null){
			return;
		}
		System.out.println(nn.val);
		forthTraverse(nn.left);
		forthTraverse(nn.right);
		
	}
	
	// toString
	@Override
	public String toString(){
		return "";
	}
	
	private String recursionString(){
		return "";
	}
	
	public static void main(String[] args){
		BST<Integer> tree = new BST<>();
		tree.addItem(4);
		tree.addItem(9);
		tree.addItem(2);
		tree.forthTraverse(tree.root);
	}
}

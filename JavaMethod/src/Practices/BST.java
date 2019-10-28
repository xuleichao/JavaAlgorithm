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
	
	// 前序遍历实现
	public void forthTraverse(Node nn){
		if (nn == null){
			return;
		}
		System.out.println(nn.val);
		forthTraverse(nn.left);
		forthTraverse(nn.right);
	}
	
	//中序遍历实现
	public void middleTraverse(Node NN){
		if (NN == null){
			return;
		}
		middleTraverse(NN.left);
		System.out.println(NN.val);
		middleTraverse(NN.right);
	}
	
	// 后序遍历
	public void backTraverse(Node NN){
		if (NN == null){
			return;
		}
		backTraverse(NN.left);
		backTraverse(NN.right);
		System.out.println(NN.val);
	}
	
	// toString realize
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		recursionString(root, 0, res);
		return res.toString();
	}
	
	private void recursionString(Node NN, int depth, StringBuilder res){
		if (NN == null){
			res.append(gnrtDepthString(depth) + "null\n");
			return;
		}
		else
			res.append(gnrtDepthString(depth) + NN.val + '\n');
		recursionString(NN.left, depth+1, res);
		recursionString(NN.right, depth+1, res);
	}
	
	private String gnrtDepthString(int depth){
		StringBuilder rel = new StringBuilder();
		for(int i = 0; i < depth; i++){
			rel.append("--");
		}
		return rel.toString();
	}
	
	public E delMin(Node root){
		if (root == null){
			return null;
		}
		
		Node NN = root;
		while (NN.left != null){
			NN = NN.left;
		}
		Node newNN = NN;
		NN = NN.right;
		return newNN.val;
	}
	
	public static void main(String[] args){
		BST<Integer> tree = new BST<>();
		int[] list = {4, 9, 2, 7, 1, 0};
		/**
		 *            4
		 *         2     9
		 *        1     7
		 *       0
		 */
		for(int i = 0; i < list.length; i++){
			tree.addItem(list[i]);
		}
		//tree.backTraverse(tree.root);
		System.out.println(tree.toString());
		Object N = tree.delMin(tree.root);
		System.out.println(tree.toString());
	}
}

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
	
	//寻找最小节点
	public Node findMin(Node NN){
		if (NN.left == null){
			return NN;
		}
		else{
			return findMin(NN.left);
		}
	}
	
	public Node delMin(Node NN){
		if (NN.left == null){
			Node rightNode = NN.right;
			NN.left = rightNode;
			NN = null;
			size--;
			return rightNode;
		}
		NN.left = delMin(NN.left);
		return NN;
	}
	
	//TODO
	public Node delMax(Node NN){
		if(NN == null)
			return null;
		// while right child is null
		if(NN.right == null){
			Node leftNode = NN.left;
			NN.right = leftNode;
			NN = null;
			return leftNode;
		}
		NN.right = delMax(NN);
		return NN;
	}
	
	// 删除任意指定节点
	public Node delItem(E e){
		if (root.val == e){
			return delItem(root, e);
		}
		
		return (BST<E>.Node) e;
	}
	
	public void remove(E e){
		Node res = delItem(root, e);
	}
	
	/**
	 * 情况1 2 3 hibbard deletion
	 * 情况1 只有左子树 删除节然后补齐即可
	 * 情况2 只有右子树 删除节点然后补齐即可
	 * 情况3 左右子树都存在，在左子树寻找被删除节点的前驱或者在右子树寻找被删除
	 * 节点的后继
	 * 前驱、后继的解释，后继指节点右子树的最小值，前驱指左子树的最大值
	 * @param NN
	 * @return
	 */
	private Node delItem(Node NN, E e){
		if(NN == null){
			return null;
		}
		if (e.compareTo(NN.val) > 0){
			Node rightNode = delItem(NN.right, e);
			NN.right = rightNode;
			return NN;
		}
		else if (e.compareTo(NN.val) < 0){
			Node leftNode = delItem(NN.left, e);
			NN.left = leftNode;
			return NN;
		}
		else{
			//当只有右子树
			if(NN.left == null){
				Node rightNode = NN.right;
				NN.right = null;
				size--;
				return rightNode;
			}
			//当只有左子树
			if(NN.right == null){
				Node leftNode = NN.left;
				NN.left = null;
				size --;
				return leftNode;
			}
			//即有左子树，又有右子树
			Node succer = findMin(NN.right);
			Node NewrightNode = delMax(NN.right);
			succer.left = NN.left;
			succer.right = NewrightNode;
			NN.left = null;
			NN.right = null;
			return succer;
			
		}	
	}
	
	private boolean containItem(Node NN, E e){
		if (e.compareTo(NN.val) > 0){
			if (NN.right == null)
				return false;
			return containItem(NN.right, e);
		}
		
		else if(e.compareTo(NN.val) < 0){
			if (NN.left == null)
					return false;
			return containItem(NN.left, e);
		}
		
		else{
			return true;
		}
			
	}
	
	public boolean contains(E e){
		
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
		N = tree.findMin(tree.root);
		System.out.println(N);
		
	}
}

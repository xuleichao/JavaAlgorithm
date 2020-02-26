package Practices;

public class BSTSet<E extends Comparable<E>> implements Set<E>{

	// 定义二叉树
	private BST<E> bst;
	//构造函数
	public BSTSet(){
		bst = new BST();
	}
	@Override
	public void add(E e){
		bst.addItem(e);
	}
	
	@Override
	public void remove(E e){
		
	}
	
	@Override
	public boolean contains(E e){
		boolean res;
		return true;
	}
	
	@Override
	public int getSize(){
		return bst.size;
	}
	
	@Override
	public boolean isEmpty(){
		return bst.isEmpty();
	}
}

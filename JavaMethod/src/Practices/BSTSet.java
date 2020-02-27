package Practices;

public class BSTSet<E extends Comparable<E>> implements Set<E>{

	// ���������
	private BST<E> bst;
	//���캯��
	public BSTSet(){
		bst = new BST();
	}
	@Override
	public void add(E e){
		bst.addItem(e);
	}
	
	@Override
	public void remove(E e){
		bst.remove(e);
	}
	
	@Override
	public boolean contains(E e){
		boolean res = bst.contains(e);
		return res;
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

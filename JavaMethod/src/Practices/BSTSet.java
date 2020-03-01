package Practices;

import Utils.FileUtils;
import java.util.ArrayList;

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
	
	public static void main(String[] args){
		ArrayList<String> lst = new ArrayList<>();
		BSTSet<String> bstset = new BSTSet<>();
		boolean res = FileUtils.readFile("./src/Utils/a-tale-of-two-cities.txt", lst);
		// 如果读文件成功
		if (res == true){
			for(int i=0; i<lst.size(); i++){
				bstset.add(lst.get(i));
			}
			System.out.println(lst.size());
			System.out.println(bstset.getSize());
		}
		
	}
}

package Practices;

public class ArrayStack<E> implements StackInterface<E> {
	MyArray<E> array;
	
	public ArrayStack(int capacity){
		array = new MyArray <E> (capacity);
	}
	
	public ArrayStack(){
		array = new MyArray<E>();
	}
	
	@Override
	public boolean isEmpty(){
		return array.getSize() == 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return array.getSize();
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}

	@Override
	public E getTop() {
		// TODO Auto-generated method stub
		int nowSize = array.getSize();
		if (nowSize != 0){
			return array.get(nowSize-1);
		}
		else{
			throw new IllegalArgumentException("emtpy stack");
		}
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		int nowSize = array.getSize();
		if (nowSize != 0){
			array.remove(nowSize - 1);
			return array.get(nowSize - 1);
		}
		else{
			throw new IllegalArgumentException("emtpy stack");
		}
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Stack is: [");
		for(int i = 0; i < array.getSize(); i++){
			res.append(array.get(i));
			res.append(", ");
		}
		res.append("]\n");
		return res.toString();
	}
	
	public static void main(String [] args){
		ArrayStack<Object> stack = new ArrayStack<>();
		stack.push("First");
		System.out.println(stack.toString());
		stack.push(2);
		System.out.println(stack.toString());
		Object popitem = stack.pop();
		System.out.println(popitem);
		System.out.println(stack.toString());
		System.out.println(stack.getTop());
		System.out.println(stack.getSize());
		//System.out.println(stack.array);
	}

}

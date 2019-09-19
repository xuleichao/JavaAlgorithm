package Practices;

public class MyArray {
	private int[] array;
	private int size;
	
	// 构造方法
	public MyArray(int capacity){
		array = new int[capacity];
		size = 0;
	}
	
	// 默认参数构造方法
	public MyArray(){
		this(10);
	}
	
	public void add(int index, int e){
		if (index < 0 | index > size){
			throw new IllegalArgumentException("索引超出范围");
		}
		if (size == getCapacity()){
			throw new IllegalArgumentException("数组已经满了");
		}
		if (size == 0){
			array[0] = e;
		}
		for(int i=size-1;(i>0)&(i<=index);i--){
			System.out.println(i);
			array[i+1] = array[i];
		}
		array[index] = e;
		size += 1;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getCapacity(){
		return array.length;
	}
	
	public static void main(String[] args){
		MyArray a = new MyArray();
		a.add(0, 2);
		System.out.println(a.getCapacity());
		System.out.println(a.size);
		System.out.println(a.array[0]);
		
	}
}

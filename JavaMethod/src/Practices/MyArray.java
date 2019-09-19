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
	}
	

}

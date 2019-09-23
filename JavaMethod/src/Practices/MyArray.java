package Practices;

public class MyArray<E> {
	private E[] array;
	private int size;
	
	// 构造方法
	public MyArray(int capacity){
		array = (E[]) new Object [capacity];
		size = 0;
	}
	
	// 默认参数构造方法
	public MyArray(){
		this(10);
	}
	
	public void add(int index, E e){
		if (index < 0 | index > size){
			throw new IllegalArgumentException("索引超出范围");
		}
		if (size == getCapacity()){
			resize(2 * array.length);
			//throw new IllegalArgumentException("数组已经满了");
		}
		if (size == 0){
			array[0] = e;
		}
		for(int i=size-1;i>=index;i--){
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
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append(String.format("array is size = %d, capacity = %d\n", size, array.length));
		for(int i = 0;i < size;i++){
			res.append(String.format("the %d element is %s\n", i, array[i].toString()));
		}
		return res.toString();
		
	}
	
	//查找元素并返回对应的索引
	public int find(E ele){
		for(int i = 0; i < size; i++){
			if (array[i].equals(ele)){
				return i;
			}
		}
		return -1;
	}
	
	//是否包含元素
	public boolean contains(E ele){
		for(int i = 0; i < size; i++){
			if (array[i].equals(ele)){
				return true;
			}
		}
		return false;
	}
	
	//根据索引 get 元素
	public E get(int idx){
		return array[idx];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void addLast(E ele){
		int lastIdx = getSize();
		add(lastIdx, ele);
	}
	
	
	//remove by index
	public void remove(int idx){
		if (idx < 0 | idx > size){
			throw new IllegalArgumentException("索引超出范围");
		}
		
		if (size == 0){
			throw new IllegalArgumentException("试图从空数组中删除数据");
		}
		
		for(int i = idx + 1; i < size; i++){
			array[i - 1] = array[i];
		}
		size = size - 1;
	}
	
	//resize
	private void resize(int capacity){
		E[] newArray = (E[]) new Object[capacity];
		for(int i = 0; i < size; i++){
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	public static void main(String[] args){
		MyArray <Object> arr = new MyArray<>(8);
		for(int i = 0; i < 10; i++)
			arr.add(i, i);
		System.out.println(arr);
		arr.add(0, -1);
		System.out.println(arr);
		System.out.println(arr.contains(-2));
		System.out.println(arr.contains(-1));
		System.out.println(arr.find(4));
		arr.remove(11);
		arr.add(6, "ttt");
		System.out.println(arr);
		System.out.println(arr.getCapacity());
		
	}
}

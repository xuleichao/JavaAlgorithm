package Practices;

public class loopArrayQueue<E> implements loopQueueInterface <E>{
	private E[] arr;
	private int size;
	private int font, tail;
	
	
	@SuppressWarnings("unchecked")
	public loopArrayQueue(int capacity){
		arr = (E[]) new Object [capacity + 1];
		size = 0;
		font = 0;
		tail = 0;
	}
	
	public loopArrayQueue(){
		arr = (E[]) new Object [11];
		size = 0;
		font = 0;
		tail = 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return arr.length;
	}

	@Override
	public int getFont() {
		// TODO Auto-generated method stub
		return font;
	}

	@Override
	public int gettail() {
		// TODO Auto-generated method stub
		return tail;
	}

	@Override
	public void enqueue(E ele) {
		// TODO Auto-generated method stub
		if(tail + 1 == font)
			throw new IllegalArgumentException("队列已满");
		arr[tail] = ele;
		tail = tail % arr.length + 1;
		size++;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (size == 0)
			throw new IllegalArgumentException("空队列");
		E fontitem = arr[font];
		font = font % arr.length + 1;
		return fontitem;
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("队列元素为：font [");
		for(int i = 0; i < size; i++){
			res.append(arr[i]);
			res.append(", ");
		}
		res.append("] tail");
		return res.toString();
	}
	
	public static void main(String [] args){
		loopArrayQueue <Object> queue = new loopArrayQueue<>();
		for(int i = 0; i < 10; i++){
			queue.enqueue(i);
		}
		System.out.println(queue);
	}
}

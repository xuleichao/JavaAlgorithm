package Practices;

public interface loopQueueInterface<E> {
	/**
	 * 循环队列接口
	 */
	int getSize();
	int getCapacity();
	void enqueue(E ele);
	E dequeue();
	
}

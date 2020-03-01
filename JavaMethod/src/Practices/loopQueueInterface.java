package Practices;

public interface loopQueueInterface<E> {
	/**
	 * 
	 */
	int getSize();
	int getCapacity();
	int getFont();
	int gettail();
	void enqueue(E ele);
	E dequeue();
	
}

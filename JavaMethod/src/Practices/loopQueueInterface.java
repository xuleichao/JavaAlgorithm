package Practices;

public interface loopQueueInterface<E> {
	/**
	 * ѭ�����нӿ�
	 */
	int getSize();
	int getCapacity();
	void enqueue(E ele);
	E dequeue();
	
}

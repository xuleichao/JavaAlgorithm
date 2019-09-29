package Practices;

public interface queueInterface<E> {
	
	void enqueue(E ele);
	E dequeue();
	E getFont();
	int getSize();
	int getCapacity();
	boolean isEmpy();
	

}

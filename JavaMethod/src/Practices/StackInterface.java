package Practices;

public interface StackInterface<E> {
		 int getSize();
		 void push(E element);
		 boolean isEmpty();
		 E getTop();
		 E pop();
}

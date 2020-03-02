package Practices;

public interface MapInterface<K, V> {
	void add(K k, V v);
	boolean contains(K k);
	int getSize();
	V getValue(K k);
	void remove(K k);
	boolean isEmpty();
	boolean set(K k, V v);
}

package Practices;

public class linkedMap<K, V> implements MapInterface<K, V> {
	
	private int size;
	private Node head;
	
	private class Node<K, V>{
		K key;
		V value;
		Node next;
		
		public Node(K k, V v){
			this.key = k;
			this.value = v;
			this.next = null;
		}
		
		public Node(){
			this.key = null;
			this.value = null;
			this.next = null;
		}
	}
	
	public linkedMap(K k, V v){
		Node n = new Node(k, v);
		head = new Node();
		head.next = n;
		size ++;
	}
	
	public linkedMap(){
		head = new Node();
		head.next = null;
	}
	
	@Override
	public void add(K k, V v){
		Node n = new Node(k, v);
		Node tmp = head;
		while (tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = n;
		size ++;
	}

	@Override
	public boolean contains(K k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public V getValue(K k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean set(K k, V v) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		Node tmp = head;
		while (tmp.next != null){
			tmp = tmp.next;
			res.append("key is \""+tmp.key+"\", value is \""+tmp.value+"\"");
		}
		return res.toString();
	}
	
	public static void main(String[] args){
		System.out.println("test");
		linkedMap map = new linkedMap();
		map.add("test", "value");
		System.out.println(map);
	}
}

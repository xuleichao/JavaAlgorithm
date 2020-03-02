package Practices;

public class linkedMap<K, V> implements MapInterface<K, V> {
	
	private int size;
	private Node head;
	
	private class Node{
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
		Node tmp = head.next;
		while(tmp.next != null){
			if (tmp.key == k){
				return true;
			}
			tmp = tmp.next;
		}
		return false;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public V getValue(K k) {
		Node tmp = head.next;
		while(tmp.next != null){
			if (tmp.key.equals(k)){
				return tmp.value;
			}
			tmp = tmp.next;
		}
		return null;
	}
	
	private Node getNode(K k){
		Node tmp = head.next;
		while(tmp.next != null){
			if (tmp.key.equals(k)){
				return tmp;
			}
			tmp = tmp.next;
		}
		return null;
	}
	
	private Node removeItem(Node N, K x){
		if (N == null){
			return null;
		}
		else if(N.key == x){
			return N.next;
		}
		else{
			N.next = removeItem(N.next, x);
			return N;
		}
	}
	
	@Override
	public void remove(K k){
		// find the node to be removed
		head.next = removeItem(head.next, k);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean set(K k, V v) {
		Node tmp = getNode(k);
		if (tmp != null){
			tmp.value = v;
			return true;
		}
		else{
			return false;
		}
		
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
		map.add("test1", "value");
		map.add("test2", "value");
		map.remove("test1");
		System.out.println(map);
	}
}

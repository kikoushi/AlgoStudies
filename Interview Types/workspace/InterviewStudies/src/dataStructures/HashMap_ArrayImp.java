package dataStructures;

public class HashMap_ArrayImp<K,V>{

	private Node<K,V>[] hashArray;
	private int size; 
	private final int DEFAULT_SIZE = 2;
	
	private static final class Node<K,V>{
		private K key;
		private V value;
		
		private Node(){
			this(null,null);
		}
		private Node(K _key, V _value){
			key = _key;
			value = _value;
		}
		public String toString(){
			return key.toString() + " " + value.toString();
		}
	}
	
	@SuppressWarnings("unchecked")
	public HashMap_ArrayImp(){
		hashArray = new Node[DEFAULT_SIZE];
		size = 0;
	}
	public boolean isEmpty(){
		return (size==0);	
	}
	public int size(){
		return size;
	}
	public V get(Object _key){
		int idx = containsKey((K) _key);
		return idx == -1 ? null : hashArray[idx].value;
	}
	public int containsKey(K _key){
		for(int i=0; i<size; i++)
			if(hashArray[i].key == _key)
				return i;
		return -1;
	}
	public boolean containsValue(V _value){
		for(int i=0; i<size; i++)
			if(hashArray[i].value.toString().equals(_value.toString()))
				return true;
		return false;
	}
	public void put(K _key, V _value){
		int idx = containsKey(_key);
		if(idx != -1)
			hashArray[idx].value = _value;
		else{
			ensureCapacity();
			hashArray[size++] = new Node<K,V>(_key, _value);
		}
	}		
	
	public boolean remove(K _key){
		int idx = containsKey(_key); 
		if(idx == -1)
			return false;
			
		hashArray[idx] = hashArray[--size];
		hashArray[size] = null;
		return true;		
	}
	
	@SuppressWarnings("unchecked")
	public void ensureCapacity(){
		if(size < hashArray.length)
			return;
			
		Node<K,V>[] subs = hashArray.clone();
		hashArray = new Node[size*2];
		for(int i=0; i<size; i++)
			hashArray[i] = subs[i];
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<size; i++)
			sb.append(hashArray[i].toString() + "\n");
		return sb.toString();
	}
	
}


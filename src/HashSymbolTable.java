public class HashSymbolTable<K,V> implements SymbolTable<K,V> {

	private class Entry {
		public K key;
		public V val;
		public Entry (K k, V v) {
			key=k;
			val=v;
		}
	}
	
	private float maxLoadFactor;
	pivate int numEntries;
	private Entry[] table;
	
	@Override
	public void insert(K key, V val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V search(K key) {
		// TODO Auto-generated method stub
		return null;
	}
}

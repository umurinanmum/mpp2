package DAL;

import java.util.HashMap;
import java.util.Map;

public interface DataAccess<K, V> {
	public V add(K key, V value);
	public V update(K key, V value);
	public V get(K key);
	public V delete(K key);
	public Map<K, V> getDB();
}
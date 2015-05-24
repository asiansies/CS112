/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 3
 * 
 */

import java.util.ArrayList;

public class MyHashTable<K extends Comparable<K>, E> {
	ArrayList<Entry<K,E>> buckets;
	int numCollisions = 0;

	// Creates a hash table with a specified number of buckets.
	public MyHashTable(int numBuckets) {
		buckets = new ArrayList<Entry<K,E>>(numBuckets);
	}

	// Returns the total number of entries in the hash table.
	public int size() {
		int size = 0;

		for (int i = 0; i < buckets.size(); i++) {
			if (buckets.get(i) != null) {
				size++;
			}
		}

		return size;
	}

	// Returns whether or not the hash table is empty.
	public boolean isEmpty() {
		return (this.size() == 0);
	}

	// Returns the value of the entry at a specified key and null
	// if the key is not found.
	public E get(K key) {
		MyString key2 = new MyString(key.toString());
		int index = key2.hashCode() % buckets.size();
		return buckets.get(index).value;
	}

	// Inserts an entry based on keys. If an entry with the key already
	// exists, the value will be replaced. Returns previous value of the entry.
	public E put(K key, E value) {

		E val = this.get(key);

		if (val == null) {
			Entry<K, E> entry = new Entry<K, E>(key, value);

			int i = 0;
			K currentKey = buckets.get(i).key;

			while (key.compareTo(currentKey) > 0) {
				currentKey = buckets.get(i).key;
				i++;
			}

			buckets.add(i, entry);
		}

		if (val != value) {
			for (int i = 0; i < buckets.size(); i++) {
				if (buckets.get(i).key.compareTo(key) == 0) {
					buckets.get(i).value = value;
				}
			}
			numCollisions++;
		}

		return val;
	}

	// Removes an entry from the hash table and returns the value
	// of the removed entry.
	public E remove(K key) {
		E val = null;
		
		for (int i = 0; i < buckets.size(); i++) {
			if (key.compareTo(buckets.get(i).key) == 0) {
				val = buckets.get(i).value;
				buckets.remove(i);
				break;
			}
		}
		
		return val;
		
	}
	
	// Returns a list of all the values in the hash table.
	public ArrayList<E> values() {
		ArrayList<E> values = new ArrayList<E>();
		
		for (int i = 0; i < buckets.size(); i++) {
			if (buckets.get(i).value != null) {
				values.add(buckets.get(i).value);
			}
		}

		return values;
	}
	
	// Returns a list of all the keys in the hash table.
	public ArrayList<K> keys() {
		ArrayList<K> keys = new ArrayList<K>();
		
		for (int i = 0; i < buckets.size(); i++) {
			if (buckets.get(i).key != null) {
				keys.add(buckets.get(i).key);
			}
		}
		
		return keys;
	}
	
	// Returns a list of all the entries in the hash table.
	public ArrayList<Entry<K, E>> entries() {
		ArrayList<Entry<K,E>> entries = new ArrayList<Entry<K,E>>();
		
		for (int i = 0; i < buckets.size(); i++) {
			if (buckets.get(i).key != null) {
				entries.add(buckets.get(i));
			}
		}
		
		return entries;
	}
	
	// Creates an Entry object.
	class Entry<K, E> {
		K key = null;
		E value = null;

		public Entry(K key, E value) {
			this.key = key;
			this.value = value;
		}
	}
}


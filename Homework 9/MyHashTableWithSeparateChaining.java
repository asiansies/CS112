/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 4
 * 
 */

import java.util.ArrayList;

public class MyHashTableWithSeparateChaining<K extends Comparable<K>, E> {
	ArrayList<Bucket<K,E>> buckets;
	int numCollisions = 0;

	// Creates a hash table with a specified number of buckets.
	public MyHashTableWithSeparateChaining(int numBuckets) {
		buckets = new ArrayList<Bucket<K,E>>(numBuckets);
	}

	// Returns the total number of entries in the hash table.
	public int size() {
		int size = 0;

		for (int i = 0; i < buckets.size(); i++) {
			size += buckets.get(i).entries.size();
		}

		return size;
	}

	// Returns whether or not the hash table is empty.
	public boolean isEmpty() {
		for (int i = 0; i < buckets.size(); i++) {
			if (!buckets.get(i).entries.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	// Returns the value of the entry at a specified key and null
	// if the key is not found.
	public E get(K key) {
		for (int i = 0; i < buckets.size(); i++) {
			for (int j = 0; j < buckets.get(i).entries.size(); j++) {
				if (buckets.get(i).entries.get(j).key.compareTo(key) == 0) {
					return buckets.get(i).entries.get(j).value;
				}
			}
		}
		return null;
	}

	// Inserts an entry based on keys. If an entry with the key already
	// exists, the value will be replaced. Returns previous value of the entry.
	public E put(K key, E value) {

		E valAtKey = this.get(key);

		if (valAtKey == null) {
			Bucket<K,E> newBucket = new Bucket<K,E>(new Entry<K, E>(key, value));

			int i = 0;
			K currentKey = buckets.get(i).entries.get(0).key;

			while (key.compareTo(currentKey) > 0) {
				currentKey = buckets.get(i).entries.get(0).key;
				i++;
			}

			buckets.add(i, newBucket);
		} else {
			for (int i = 0; i < buckets.size(); i++) {
				if (buckets.get(i).entries.get(0).key.compareTo(key) == 0) {
					buckets.get(i).entries.add(new Entry<K, E>(key, value));
				}
			}
			
			numCollisions++;
		}

		return valAtKey;
	}

	// Removes an entry from the hash table and returns the value
	// of the removed entry.
	public E remove(K key) {
		E val = null;
		
		for (int i = 0; i < buckets.size(); i++) {
			if (key.compareTo(buckets.get(i).entries.get(0).key) == 0) {
				val = buckets.get(i).entries.get(0).value;
				buckets.get(i).entries.remove(0);
				break;
			}
		}
		
		return val;
		
	}
	
	// Returns a list of all the values in the hash table.
	public ArrayList<E> values() {
		ArrayList<E> values = new ArrayList<E>();
		
		for (int i = 0; i < buckets.size(); i++) {
			for(int j = 0; j < buckets.get(i).entries.size(); j++) {
				if (buckets.get(i).entries.get(j).value != null) {
					values.add(buckets.get(i).entries.get(j).value);
				}
			}
		}
		return values;
	}

	// Returns a list of all the keys in the hash table.
	public ArrayList<K> keys() {
		ArrayList<K> keys = new ArrayList<K>();
		
		for (int i = 0; i < buckets.size(); i++) {
			if (buckets.get(i).entries.get(0).key != null) {
				keys.add(buckets.get(i).entries.get(0).key);
			}
		}
		
		return keys;
	}
	
	// Returns a list of all the entries in the hash table.
	public ArrayList<Entry<K, E>> entries() {
		ArrayList<Entry<K,E>> entries = new ArrayList<Entry<K,E>>();

		for (int i = 0; i < buckets.size(); i++) {
			for (int j = 0; j < buckets.get(i).entries.size(); j++) {
				if (buckets.get(i).entries.get(j).key != null) {
					entries.add(buckets.get(i).entries.get(j));
				}
			}
		}
		
		return entries;
	}
	
	// Prints out number of entries in each bucket and the entry data
	// held in each bucket.
	public String hashStats() {
		Integer numEntries = 0;
		String entryData = null;
		
		for(int i = 0; i < buckets.size(); i++) {
			for (int j = 0; j < buckets.get(i).entries.size(); j++) {
				if (buckets.get(i).entries.get(j) != null) {
					numEntries++;
					entryData += "(" + buckets.get(i).entries.get(j).key + buckets.get(i).entries.get(j).value + ") ";
				}
			}
			numEntries = 0;
		}

		return "Number of entries: " + numEntries.toString() + " " + entryData;
	}

	// Creates a Bucket object.
	class Bucket<K, E> {
		ArrayList<Entry<K,E>> entries;
		
		public Bucket(Entry<K,E> entry) {
			 this.entries = new ArrayList<Entry<K,E>>();
			 entries.add(entry);
		}
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


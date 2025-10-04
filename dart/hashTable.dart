// Hash Table Implementation in Dart
// Using separate chaining for collision resolution

class HashTable<K, V> {
  List<List<MapEntry<K, V>>> _buckets;
  int _size;
  int _capacity;
  static const double _loadFactor = 0.75;

  HashTable({int initialCapacity = 16}) 
      : _capacity = initialCapacity,
        _size = 0,
        _buckets = List.generate(initialCapacity, (_) => []);

  // Hash function
  int _hash(K key) {
    return key.hashCode.abs() % _capacity;
  }

  // Insert key-value pair
  void put(K key, V value) {
    int index = _hash(key);
    List<MapEntry<K, V>> bucket = _buckets[index];

    // Check if key already exists
    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i].key == key) {
        bucket[i] = MapEntry(key, value);
        return;
      }
    }

    // Add new key-value pair
    bucket.add(MapEntry(key, value));
    _size++;

    // Resize if load factor exceeded
    if (_size > _capacity * _loadFactor) {
      _resize();
    }
  }

  // Get value by key
  V? get(K key) {
    int index = _hash(key);
    List<MapEntry<K, V>> bucket = _buckets[index];

    for (MapEntry<K, V> entry in bucket) {
      if (entry.key == key) {
        return entry.value;
      }
    }
    return null;
  }

  // Remove key-value pair
  bool remove(K key) {
    int index = _hash(key);
    List<MapEntry<K, V>> bucket = _buckets[index];

    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i].key == key) {
        bucket.removeAt(i);
        _size--;
        return true;
      }
    }
    return false;
  }

  // Check if key exists
  bool containsKey(K key) {
    return get(key) != null;
  }

  // Get all keys
  List<K> keys() {
    List<K> keyList = [];
    for (List<MapEntry<K, V>> bucket in _buckets) {
      for (MapEntry<K, V> entry in bucket) {
        keyList.add(entry.key);
      }
    }
    return keyList;
  }

  // Get all values
  List<V> values() {
    List<V> valueList = [];
    for (List<MapEntry<K, V>> bucket in _buckets) {
      for (MapEntry<K, V> entry in bucket) {
        valueList.add(entry.value);
      }
    }
    return valueList;
  }

  // Get size
  int get size => _size;

  // Check if empty
  bool get isEmpty => _size == 0;

  // Clear all entries
  void clear() {
    _buckets = List.generate(_capacity, (_) => []);
    _size = 0;
  }

  // Resize hash table
  void _resize() {
    List<MapEntry<K, V>> oldEntries = [];
    
    // Collect all entries
    for (List<MapEntry<K, V>> bucket in _buckets) {
      oldEntries.addAll(bucket);
    }

    // Double capacity and rehash
    _capacity *= 2;
    _buckets = List.generate(_capacity, (_) => []);
    _size = 0;

    // Reinsert all entries
    for (MapEntry<K, V> entry in oldEntries) {
      put(entry.key, entry.value);
    }
  }

  // Print hash table structure
  void printTable() {
    print('Hash Table (Capacity: $_capacity, Size: $_size)');
    for (int i = 0; i < _buckets.length; i++) {
      if (_buckets[i].isNotEmpty) {
        String entries = _buckets[i]
            .map((e) => '${e.key}:${e.value}')
            .join(', ');
        print('Bucket $i: [$entries]');
      }
    }
  }
}

// String-specific hash table with custom hash function
class StringHashTable<V> extends HashTable<String, V> {
  StringHashTable({int initialCapacity = 16}) : super(initialCapacity: initialCapacity);

  @override
  int _hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length; i++) {
      hash = (hash * 31 + key.codeUnitAt(i)) % _capacity;
    }
    return hash;
  }
}

// Main function to demonstrate hash table operations
void main() {
  print('Hash Table Implementation in Dart');
  print('================================');
  
  // Create hash table
  var hashTable = HashTable<String, int>();
  
  // Insert some data
  print('Inserting data...');
  hashTable.put('apple', 5);
  hashTable.put('banana', 3);
  hashTable.put('cherry', 8);
  hashTable.put('date', 2);
  hashTable.put('elderberry', 6);
  
  // Display table structure
  hashTable.printTable();
  
  print('\nOperations:');
  print('Get apple: ${hashTable.get('apple')}');
  print('Get grape: ${hashTable.get('grape')}');
  print('Contains banana: ${hashTable.containsKey('banana')}');
  print('Contains grape: ${hashTable.containsKey('grape')}');
  
  print('\nAll keys: ${hashTable.keys()}');
  print('All values: ${hashTable.values()}');
  
  // Update existing key
  print('\nUpdating apple to 10...');
  hashTable.put('apple', 10);
  print('Get apple: ${hashTable.get('apple')}');
  
  // Remove key
  print('\nRemoving cherry...');
  hashTable.remove('cherry');
  print('Contains cherry: ${hashTable.containsKey('cherry')}');
  
  // Test collision handling
  print('\nTesting collisions...');
  var stringTable = StringHashTable<String>();
  stringTable.put('abc', 'first');
  stringTable.put('bca', 'second');
  stringTable.put('cab', 'third');
  stringTable.printTable();
  
  // Performance test
  print('\nPerformance test (1000 insertions):');
  var perfTable = HashTable<int, String>();
  var stopwatch = Stopwatch();
  
  stopwatch.start();
  for (int i = 0; i < 1000; i++) {
    perfTable.put(i, 'value$i');
  }
  stopwatch.stop();
  
  print('Inserted 1000 items in ${stopwatch.elapsedMicroseconds}μs');
  print('Final size: ${perfTable.size}');
  print('Load factor: ${perfTable.size / perfTable._capacity}');
}

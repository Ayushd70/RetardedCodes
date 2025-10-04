// Queue Implementation in Dart
// FIFO (First In, First Out) data structure

class Queue<T> {
  List<T> _items = [];

  // Enqueue element to rear
  void enqueue(T item) {
    _items.add(item);
  }

  // Dequeue element from front
  T? dequeue() {
    if (isEmpty) return null;
    return _items.removeAt(0);
  }

  // Peek at front element without removing
  T? peek() {
    if (isEmpty) return null;
    return _items.first;
  }

  // Peek at rear element
  T? peekRear() {
    if (isEmpty) return null;
    return _items.last;
  }

  // Check if queue is empty
  bool get isEmpty => _items.isEmpty;

  // Check if queue is not empty
  bool get isNotEmpty => _items.isNotEmpty;

  // Get queue size
  int get size => _items.length;

  // Clear all elements
  void clear() {
    _items.clear();
  }

  // Convert to list
  List<T> toList() {
    return List.from(_items);
  }

  // Print queue contents
  void printQueue() {
    if (isEmpty) {
      print('Queue is empty');
      return;
    }
    print('Queue (front to rear): $_items');
  }
}

// Circular Queue implementation
class CircularQueue<T> {
  List<T?> _items;
  int _front = 0;
  int _rear = 0;
  int _size = 0;
  int _capacity;

  CircularQueue(this._capacity) : _items = List.filled(_capacity, null);

  // Enqueue element
  bool enqueue(T item) {
    if (isFull) return false;
    
    _items[_rear] = item;
    _rear = (_rear + 1) % _capacity;
    _size++;
    return true;
  }

  // Dequeue element
  T? dequeue() {
    if (isEmpty) return null;
    
    T? item = _items[_front];
    _items[_front] = null;
    _front = (_front + 1) % _capacity;
    _size--;
    return item;
  }

  // Peek at front element
  T? peek() {
    if (isEmpty) return null;
    return _items[_front];
  }

  // Check if queue is empty
  bool get isEmpty => _size == 0;

  // Check if queue is full
  bool get isFull => _size == _capacity;

  // Get queue size
  int get size => _size;

  // Print circular queue
  void printQueue() {
    if (isEmpty) {
      print('Circular Queue is empty');
      return;
    }
    
    List<T> elements = [];
    for (int i = 0; i < _size; i++) {
      int index = (_front + i) % _capacity;
      elements.add(_items[index]!);
    }
    print('Circular Queue: $elements');
  }
}

// Priority Queue implementation
class PriorityQueue<T> {
  List<MapEntry<T, int>> _items = [];

  // Enqueue with priority
  void enqueue(T item, int priority) {
    _items.add(MapEntry(item, priority));
    _items.sort((a, b) => b.value.compareTo(a.value)); // Higher priority first
  }

  // Dequeue highest priority item
  T? dequeue() {
    if (isEmpty) return null;
    return _items.removeAt(0).key;
  }

  // Peek at highest priority item
  T? peek() {
    if (isEmpty) return null;
    return _items.first.key;
  }

  // Check if empty
  bool get isEmpty => _items.isEmpty;

  // Get size
  int get size => _items.length;

  // Print priority queue
  void printQueue() {
    if (isEmpty) {
      print('Priority Queue is empty');
      return;
    }
    print('Priority Queue: ${_items.map((e) => '${e.key}(${e.value})').join(', ')}');
  }
}

// Queue applications and algorithms
class QueueAlgorithms {
  // Generate binary numbers from 1 to n
  static List<String> generateBinaryNumbers(int n) {
    List<String> result = [];
    Queue<String> queue = Queue<String>();
    
    queue.enqueue('1');
    
    for (int i = 0; i < n; i++) {
      String binary = queue.dequeue()!;
      result.add(binary);
      
      queue.enqueue(binary + '0');
      queue.enqueue(binary + '1');
    }
    
    return result;
  }

  // Level order traversal of binary tree (simulated)
  static List<int> levelOrderTraversal(List<int> tree) {
    List<int> result = [];
    Queue<int> queue = Queue<int>();
    
    if (tree.isNotEmpty) {
      queue.enqueue(0); // Start with root index
    }
    
    while (queue.isNotEmpty) {
      int index = queue.dequeue()!;
      result.add(tree[index]);
      
      int leftChild = 2 * index + 1;
      int rightChild = 2 * index + 2;
      
      if (leftChild < tree.length) queue.enqueue(leftChild);
      if (rightChild < tree.length) queue.enqueue(rightChild);
    }
    
    return result;
  }

  // Find first non-repeating character in stream
  static String firstNonRepeating(String stream) {
    Map<String, int> charCount = {};
    Queue<String> queue = Queue<String>();
    String result = '';
    
    for (int i = 0; i < stream.length; i++) {
      String char = stream[i];
      
      charCount[char] = (charCount[char] ?? 0) + 1;
      queue.enqueue(char);
      
      while (queue.isNotEmpty && charCount[queue.peek()!]! > 1) {
        queue.dequeue();
      }
      
      result += queue.isEmpty ? '#' : queue.peek()!;
    }
    
    return result;
  }

  // Sliding window maximum
  static List<int> slidingWindowMax(List<int> nums, int k) {
    List<int> result = [];
    Queue<int> queue = Queue<int>();
    
    for (int i = 0; i < nums.length; i++) {
      // Remove elements outside window
      while (queue.isNotEmpty && queue.peek()! <= i - k) {
        queue.dequeue();
      }
      
      // Remove smaller elements
      while (queue.isNotEmpty && nums[queue.peekRear()!] <= nums[i]) {
        queue.dequeue();
      }
      
      queue.enqueue(i);
      
      if (i >= k - 1) {
        result.add(nums[queue.peek()!]);
      }
    }
    
    return result;
  }
}

// Main function to demonstrate queue operations
void main() {
  print('Queue Implementation in Dart');
  print('===========================');
  
  // Basic queue operations
  var queue = Queue<String>();
  
  print('Basic Queue Operations:');
  print('Enqueuing: A, B, C, D, E');
  queue.enqueue('A');
  queue.enqueue('B');
  queue.enqueue('C');
  queue.enqueue('D');
  queue.enqueue('E');
  
  queue.printQueue();
  print('Queue size: ${queue.size}');
  print('Front element: ${queue.peek()}');
  print('Rear element: ${queue.peekRear()}');
  
  print('\nDequeuing elements:');
  while (queue.isNotEmpty) {
    print('Dequeued: ${queue.dequeue()}');
  }
  
  // Circular Queue
  print('\nCircular Queue (capacity: 5):');
  var circularQueue = CircularQueue<String>(5);
  
  for (int i = 1; i <= 7; i++) {
    bool success = circularQueue.enqueue('Item$i');
    print('Enqueue Item$i: ${success ? 'Success' : 'Failed (full)'}');
  }
  
  circularQueue.printQueue();
  print('Dequeued: ${circularQueue.dequeue()}');
  circularQueue.printQueue();
  
  // Priority Queue
  print('\nPriority Queue:');
  var priorityQueue = PriorityQueue<String>();
  priorityQueue.enqueue('Low', 1);
  priorityQueue.enqueue('High', 3);
  priorityQueue.enqueue('Medium', 2);
  priorityQueue.enqueue('Critical', 4);
  
  priorityQueue.printQueue();
  print('Dequeued: ${priorityQueue.dequeue()}');
  priorityQueue.printQueue();
  
  // Queue applications
  print('\nQueue Applications:');
  
  // 1. Binary number generation
  print('\n1. Generate Binary Numbers (1-10):');
  List<String> binaryNumbers = QueueAlgorithms.generateBinaryNumbers(10);
  print(binaryNumbers);
  
  // 2. Level order traversal
  print('\n2. Level Order Traversal:');
  List<int> tree = [1, 2, 3, 4, 5, 6, 7];
  List<int> traversal = QueueAlgorithms.levelOrderTraversal(tree);
  print('Tree: $tree');
  print('Level order: $traversal');
  
  // 3. First non-repeating character
  print('\n3. First Non-Repeating Character:');
  String stream = 'aabcbc';
  String result = QueueAlgorithms.firstNonRepeating(stream);
  print('Stream: $stream');
  print('Result: $result');
  
  // 4. Sliding window maximum
  print('\n4. Sliding Window Maximum:');
  List<int> nums = [1, 3, -1, -3, 5, 3, 6, 7];
  int k = 3;
  List<int> maxValues = QueueAlgorithms.slidingWindowMax(nums, k);
  print('Array: $nums, Window size: $k');
  print('Max values: $maxValues');
  
  // Performance test
  print('\nPerformance Test (1000 operations):');
  var perfQueue = Queue<int>();
  var stopwatch = Stopwatch();
  
  stopwatch.start();
  for (int i = 0; i < 1000; i++) {
    perfQueue.enqueue(i);
  }
  while (perfQueue.isNotEmpty) {
    perfQueue.dequeue();
  }
  stopwatch.stop();
  
  print('1000 enqueue/dequeue operations completed in ${stopwatch.elapsedMicroseconds}μs');
}
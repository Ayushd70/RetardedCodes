import 'dart:math' show Random;
import 'dart:collection';

// Graph representation using adjacency list
class Graph {
  Map<int, List<Edge>> adjacencyList;
  bool isDirected;
  int vertices;

  Graph(this.vertices, {this.isDirected = false}) 
      : adjacencyList = {};

  // Add an edge between two vertices
  void addEdge(int from, int to, {int weight = 1}) {
    adjacencyList.putIfAbsent(from, () => []);
    adjacencyList[from]!.add(Edge(to, weight));
    
    if (!isDirected) {
      adjacencyList.putIfAbsent(to, () => []);
      adjacencyList[to]!.add(Edge(from, weight));
    }
  }

  // Remove an edge between two vertices
  void removeEdge(int from, int to) {
    adjacencyList[from]?.removeWhere((edge) => edge.destination == to);
    if (!isDirected) {
      adjacencyList[to]?.removeWhere((edge) => edge.destination == from);
    }
  }

  // Add a vertex
  void addVertex(int vertex) {
    adjacencyList.putIfAbsent(vertex, () => []);
  }

  // Get neighbors of a vertex
  List<int> getNeighbors(int vertex) {
    return adjacencyList[vertex]?.map((edge) => edge.destination).toList() ?? [];
  }

  // Check if there's an edge between two vertices
  bool hasEdge(int from, int to) {
    return adjacencyList[from]?.any((edge) => edge.destination == to) ?? false;
  }

  // Get all vertices
  List<int> getVertices() {
    return adjacencyList.keys.toList();
  }

  // Print the graph
  void printGraph() {
    for (int vertex in adjacencyList.keys) {
      String neighbors = adjacencyList[vertex]!
          .map((edge) => '${edge.destination}(${edge.weight})')
          .join(', ');
      print('$vertex -> [$neighbors]');
    }
  }
}

// Edge class for weighted graphs
class Edge {
  int destination;
  int weight;

  Edge(this.destination, this.weight);
}

// Graph Algorithms class
class GraphAlgorithms {
  // Breadth-First Search (BFS)
  static List<int> bfs(Graph graph, int startVertex) {
    List<int> result = [];
    Set<int> visited = {};
    Queue<int> queue = Queue<int>();

    visited.add(startVertex);
    queue.add(startVertex);

    while (queue.isNotEmpty) {
      int current = queue.removeFirst();
      result.add(current);

      for (int neighbor in graph.getNeighbors(current)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          queue.add(neighbor);
        }
      }
    }

    return result;
  }

  // Depth-First Search (DFS) - Recursive
  static List<int> dfsRecursive(Graph graph, int startVertex) {
    List<int> result = [];
    Set<int> visited = {};
    _dfsHelper(graph, startVertex, visited, result);
    return result;
  }

  static void _dfsHelper(Graph graph, int vertex, Set<int> visited, List<int> result) {
    visited.add(vertex);
    result.add(vertex);

    for (int neighbor in graph.getNeighbors(vertex)) {
      if (!visited.contains(neighbor)) {
        _dfsHelper(graph, neighbor, visited, result);
      }
    }
  }

  // Depth-First Search (DFS) - Iterative
  static List<int> dfsIterative(Graph graph, int startVertex) {
    List<int> result = [];
    Set<int> visited = {};
    List<int> stack = [startVertex];

    while (stack.isNotEmpty) {
      int current = stack.removeLast();
      
      if (!visited.contains(current)) {
        visited.add(current);
        result.add(current);

        for (int neighbor in graph.getNeighbors(current)) {
          if (!visited.contains(neighbor)) {
            stack.add(neighbor);
          }
        }
      }
    }

    return result;
  }

  // Check if graph is connected
  static bool isConnected(Graph graph) {
    if (graph.adjacencyList.isEmpty) return true;
    
    int startVertex = graph.adjacencyList.keys.first;
    List<int> visited = bfs(graph, startVertex);
    return visited.length == graph.adjacencyList.length;
  }

  // Find shortest path using BFS (unweighted graph)
  static List<int> shortestPathBFS(Graph graph, int start, int end) {
    if (start == end) return [start];

    Map<int, int> parent = {};
    Set<int> visited = {};
    Queue<int> queue = Queue<int>();

    visited.add(start);
    queue.add(start);

    while (queue.isNotEmpty) {
      int current = queue.removeFirst();

      for (int neighbor in graph.getNeighbors(current)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          parent[neighbor] = current;
          queue.add(neighbor);

          if (neighbor == end) {
            return _reconstructPath(parent, start, end);
          }
        }
      }
    }

    return []; // No path found
  }

  static List<int> _reconstructPath(Map<int, int> parent, int start, int end) {
    List<int> path = [];
    int current = end;

    while (current != start) {
      path.add(current);
      current = parent[current]!;
    }
    path.add(start);
    return path.reversed.toList();
  }

  // Dijkstra's Algorithm for shortest path in weighted graph
  static Map<int, int> dijkstra(Graph graph, int start) {
    Map<int, int> distances = {};
    Set<int> visited = {};
    PriorityQueue<MapEntry<int, int>> pq = PriorityQueue<MapEntry<int, int>>(
      (a, b) => a.value.compareTo(b.value)
    );

    // Initialize distances
    for (int vertex in graph.getVertices()) {
      distances[vertex] = vertex == start ? 0 : double.infinity.toInt();
    }

    pq.add(MapEntry(start, 0));

    while (pq.isNotEmpty) {
      MapEntry<int, int> current = pq.removeFirst();
      int vertex = current.key;
      int distance = current.value;

      if (visited.contains(vertex)) continue;
      visited.add(vertex);

      for (Edge edge in graph.adjacencyList[vertex] ?? []) {
        int neighbor = edge.destination;
        int newDistance = distance + edge.weight;

        if (newDistance < (distances[neighbor] ?? double.infinity.toInt())) {
          distances[neighbor] = newDistance;
          pq.add(MapEntry(neighbor, newDistance));
        }
      }
    }

    return distances;
  }

  // Detect cycle in directed graph using DFS
  static bool hasCycle(Graph graph) {
    Set<int> visited = {};
    Set<int> recursionStack = {};

    for (int vertex in graph.getVertices()) {
      if (!visited.contains(vertex)) {
        if (_hasCycleDFS(graph, vertex, visited, recursionStack)) {
          return true;
        }
      }
    }
    return false;
  }

  static bool _hasCycleDFS(Graph graph, int vertex, Set<int> visited, Set<int> recursionStack) {
    visited.add(vertex);
    recursionStack.add(vertex);

    for (int neighbor in graph.getNeighbors(vertex)) {
      if (!visited.contains(neighbor)) {
        if (_hasCycleDFS(graph, neighbor, visited, recursionStack)) {
          return true;
        }
      } else if (recursionStack.contains(neighbor)) {
        return true;
      }
    }

    recursionStack.remove(vertex);
    return false;
  }

  // Topological Sort (for DAG)
  static List<int> topologicalSort(Graph graph) {
    if (hasCycle(graph)) {
      throw Exception('Graph contains a cycle, topological sort not possible');
    }

    List<int> result = [];
    Set<int> visited = {};
    List<int> tempStack = [];

    for (int vertex in graph.getVertices()) {
      if (!visited.contains(vertex)) {
        _topologicalSortDFS(graph, vertex, visited, tempStack);
      }
    }

    while (tempStack.isNotEmpty) {
      result.add(tempStack.removeLast());
    }

    return result;
  }

  static void _topologicalSortDFS(Graph graph, int vertex, Set<int> visited, List<int> stack) {
    visited.add(vertex);

    for (int neighbor in graph.getNeighbors(vertex)) {
      if (!visited.contains(neighbor)) {
        _topologicalSortDFS(graph, neighbor, visited, stack);
      }
    }

    stack.add(vertex);
  }
}

// Custom Priority Queue implementation
class PriorityQueue<T> {
  List<T> _heap = [];
  int Function(T, T) _compare;

  PriorityQueue(this._compare);

  void add(T item) {
    _heap.add(item);
    _bubbleUp(_heap.length - 1);
  }

  T removeFirst() {
    if (_heap.isEmpty) throw StateError('Queue is empty');
    
    T first = _heap[0];
    T last = _heap.removeLast();
    
    if (_heap.isNotEmpty) {
      _heap[0] = last;
      _bubbleDown(0);
    }
    
    return first;
  }

  bool get isNotEmpty => _heap.isNotEmpty;

  void _bubbleUp(int index) {
    while (index > 0) {
      int parentIndex = (index - 1) ~/ 2;
      if (_compare(_heap[index], _heap[parentIndex]) >= 0) break;
      
      _swap(index, parentIndex);
      index = parentIndex;
    }
  }

  void _bubbleDown(int index) {
    while (true) {
      int leftChild = 2 * index + 1;
      int rightChild = 2 * index + 2;
      int smallest = index;

      if (leftChild < _heap.length && 
          _compare(_heap[leftChild], _heap[smallest]) < 0) {
        smallest = leftChild;
      }

      if (rightChild < _heap.length && 
          _compare(_heap[rightChild], _heap[smallest]) < 0) {
        smallest = rightChild;
      }

      if (smallest == index) break;

      _swap(index, smallest);
      index = smallest;
    }
  }

  void _swap(int i, int j) {
    T temp = _heap[i];
    _heap[i] = _heap[j];
    _heap[j] = temp;
  }
}

// Main function to demonstrate graph algorithms
void main() {
  print('Graph Algorithms Implementation in Dart');
  print('=====================================');
  
  // Create an undirected graph
  var graph = Graph(6, isDirected: false);
  
  // Add edges
  graph.addEdge(0, 1);
  graph.addEdge(0, 2);
  graph.addEdge(1, 3);
  graph.addEdge(2, 4);
  graph.addEdge(3, 5);
  graph.addEdge(4, 5);
  
  print('Graph Structure:');
  graph.printGraph();
  
  print('\nBFS Traversal starting from vertex 0:');
  print(GraphAlgorithms.bfs(graph, 0));
  
  print('\nDFS Recursive starting from vertex 0:');
  print(GraphAlgorithms.dfsRecursive(graph, 0));
  
  print('\nDFS Iterative starting from vertex 0:');
  print(GraphAlgorithms.dfsIterative(graph, 0));
  
  print('\nIs graph connected: ${GraphAlgorithms.isConnected(graph)}');
  
  print('\nShortest path from 0 to 5:');
  print(GraphAlgorithms.shortestPathBFS(graph, 0, 5));
  
  // Create a weighted directed graph for Dijkstra
  var weightedGraph = Graph(5, isDirected: true);
  weightedGraph.addEdge(0, 1, weight: 4);
  weightedGraph.addEdge(0, 2, weight: 1);
  weightedGraph.addEdge(1, 2, weight: 2);
  weightedGraph.addEdge(1, 3, weight: 1);
  weightedGraph.addEdge(2, 3, weight: 5);
  weightedGraph.addEdge(3, 4, weight: 3);
  
  print('\nWeighted Graph:');
  weightedGraph.printGraph();
  
  print('\nDijkstra shortest distances from vertex 0:');
  var distances = GraphAlgorithms.dijkstra(weightedGraph, 0);
  distances.forEach((vertex, distance) {
    print('Distance to $vertex: $distance');
  });
  
  // Test cycle detection
  var cyclicGraph = Graph(3, isDirected: true);
  cyclicGraph.addEdge(0, 1);
  cyclicGraph.addEdge(1, 2);
  cyclicGraph.addEdge(2, 0); // Creates a cycle
  
  print('\nCycle detection:');
  print('Has cycle: ${GraphAlgorithms.hasCycle(cyclicGraph)}');
  
  // Test topological sort
  var dag = Graph(6, isDirected: true);
  dag.addEdge(5, 2);
  dag.addEdge(5, 0);
  dag.addEdge(4, 0);
  dag.addEdge(4, 1);
  dag.addEdge(2, 3);
  dag.addEdge(3, 1);
  
  print('\nTopological sort:');
  try {
    print(GraphAlgorithms.topologicalSort(dag));
  } catch (e) {
    print('Error: $e');
  }
}

// Fibonacci Sequence Implementation in Dart
// Multiple approaches: Recursive, Iterative, and Memoized

// 1. Recursive approach (simple but inefficient for large n)
int fibonacciRecursive(int n) {
  if (n <= 1) return n;
  return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

// 2. Iterative approach (efficient)
int fibonacciIterative(int n) {
  if (n <= 1) return n;
  
  int a = 0, b = 1;
  for (int i = 2; i <= n; i++) {
    int temp = a + b;
    a = b;
    b = temp;
  }
  return b;
}

// 3. Memoized approach (recursive with caching)
Map<int, int> _memo = {};
int fibonacciMemoized(int n) {
  if (n <= 1) return n;
  if (_memo.containsKey(n)) return _memo[n]!;
  
  _memo[n] = fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2);
  return _memo[n]!;
}

// 4. Generate Fibonacci sequence up to n terms
List<int> generateFibonacciSequence(int terms) {
  List<int> sequence = [];
  for (int i = 0; i < terms; i++) {
    sequence.add(fibonacciIterative(i));
  }
  return sequence;
}

// 5. Check if a number is Fibonacci
bool isFibonacci(int num) {
  if (num < 0) return false;
  if (num == 0 || num == 1) return true;
  
  int a = 0, b = 1;
  while (b < num) {
    int temp = a + b;
    a = b;
    b = temp;
  }
  return b == num;
}

// 6. Find nth Fibonacci using matrix exponentiation (advanced)
List<List<int>> matrixMultiply(List<List<int>> a, List<List<int>> b) {
  return [
    [a[0][0] * b[0][0] + a[0][1] * b[1][0], a[0][0] * b[0][1] + a[0][1] * b[1][1]],
    [a[1][0] * b[0][0] + a[1][1] * b[1][0], a[1][0] * b[0][1] + a[1][1] * b[1][1]]
  ];
}

List<List<int>> matrixPower(List<List<int>> matrix, int n) {
  if (n == 1) return matrix;
  if (n % 2 == 0) {
    List<List<int>> half = matrixPower(matrix, n ~/ 2);
    return matrixMultiply(half, half);
  }
  return matrixMultiply(matrix, matrixPower(matrix, n - 1));
}

int fibonacciMatrix(int n) {
  if (n <= 1) return n;
  
  List<List<int>> base = [[1, 1], [1, 0]];
  List<List<int>> result = matrixPower(base, n - 1);
  return result[0][0];
}

// Main function to demonstrate all approaches
void main() {
  print('Fibonacci Sequence Implementation');
  print('================================');
  
  int n = 10;
  print('Calculating Fibonacci($n):');
  
  // Compare different approaches
  print('Recursive: ${fibonacciRecursive(n)}');
  print('Iterative: ${fibonacciIterative(n)}');
  print('Memoized:  ${fibonacciMemoized(n)}');
  print('Matrix:    ${fibonacciMatrix(n)}');
  
  print('\nFirst 15 Fibonacci numbers:');
  print(generateFibonacciSequence(15));
  
  print('\nFibonacci check:');
  print('Is 13 a Fibonacci? ${isFibonacci(13)}');
  print('Is 14 a Fibonacci? ${isFibonacci(14)}');
  print('Is 21 a Fibonacci? ${isFibonacci(21)}');
  
  // Performance comparison for larger number
  print('\nPerformance test (n=35):');
  var stopwatch = Stopwatch();
  
  stopwatch.start();
  int result1 = fibonacciIterative(35);
  stopwatch.stop();
  print('Iterative: $result1 (${stopwatch.elapsedMicroseconds}μs)');
  
  stopwatch.reset();
  stopwatch.start();
  int result2 = fibonacciMemoized(35);
  stopwatch.stop();
  print('Memoized:  $result2 (${stopwatch.elapsedMicroseconds}μs)');
  
  stopwatch.reset();
  stopwatch.start();
  int result3 = fibonacciMatrix(35);
  stopwatch.stop();
  print('Matrix:    $result3 (${stopwatch.elapsedMicroseconds}μs)');
}

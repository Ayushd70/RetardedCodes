int fibonacciSearch(List arr, int x, int n) {
  int fibMMm2 = 0;
  int fibMMm1 = 1;
  int fibM = fibMMm2 + fibMMm1;

  while (fibM < n) {
    fibMMm2 = fibMMm1;
    fibMMm1 = fibM;
    fibM = fibMMm2 + fibMMm1;
  }

  int offset = -1;

  while (fibM > 1) {
    int i = ((offset + fibMMm2) < (n - 1)) ? (offset + fibMMm2) : (n - 1);

    if (arr[i] < x) {
      fibM = fibMMm1;
      fibMMm1 = fibMMm2;
      fibMMm2 = fibM - fibMMm1;
      offset = i;
    } else if (arr[i] > x) {
      fibM = fibMMm2;
      fibMMm1 = fibMMm1 - fibMMm2;
      fibMMm2 = fibM - fibMMm1;
    } else {
      return i;
    }
  }

  if (arr[offset + 1] == x) {
    return offset + 1;
  }
  return -1;
}

void main() {
  var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  var result;
  print(arr);
  var n = arr.length;
  var key = 4;
  result = fibonacciSearch(arr, key, n);

  print("Index of " + key.toString() + " is " + result.toString());
}

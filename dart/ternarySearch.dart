int ternarySearch(var l, var r, var key, var arr) {
  if (r >= 1) {
    //Find the mid1 and mid2
    var mid1 = (l + (r - l) / 3).toInt();
    var mid2 = (r - (r - 1) / 3).toInt();

    if (arr[mid1] == key) return mid1;

    if (arr[mid2] == key) return mid2;

    if (key < arr[mid1]) {
      return ternarySearch(l, mid1 - 1, key, arr);
    } else if (key > arr[mid2]) {
      return ternarySearch(mid2 + 1, r, key, arr);
    } else {
      return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
    }
  }

  return -1;
}

void main() {
  var l, r, p, key;

  var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  print(arr);

  l = 0;
  r = arr.length;
  key = 5;
  p = ternarySearch(l, r, key, arr);
  print("Index of " + key.toString() + " is " + p.toString());
}

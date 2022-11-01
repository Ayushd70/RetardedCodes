void main() {
  var items = [1, 2, 3, 4, 5];
  var firstFour = items.take(4);

  for (var n in firstFour) {
    print(n);
  }
}

void main() {
  var items = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  items.retainWhere((e) => e % 2 == 0);

  print(items);
}

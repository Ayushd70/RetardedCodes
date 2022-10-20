void main() {
  var list = [];
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  list.add(7);

  print(list);

  for (var i = 0; i < list.length / 2; i++) {
    var tempValue = list[i];
    list[i] = list[list.length - 1 - i];
    list[list.length - 1 - i] = tempValue;
  }

  print(list);
}

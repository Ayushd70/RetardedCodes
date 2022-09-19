main(List args) {
  List numbers = [];
  numbers.add(3);
  numbers.add(6);
  numbers.add(9);
  numbers.add(8);
  numbers.add(2);
  numbers.add(5);
  numbers.add(1);

  var i = 0;
  numbers.forEach((e) => print("position for ${i++} is ${e}"));
}

main() {
  // for loop
  for (var i = 0; i < 3; i++) {
    print(i);
  }

  // for-in for interable class
  var collection = [3, 4, 5];
  for (var x in collection) {
    print(x);
  }

  // closures capture the value of the index
  var callback = [];
  for (var i = 6; i < 8; i++) {
    callback.add(() => print(i));
  }
  callback.forEach((c) => c());
}

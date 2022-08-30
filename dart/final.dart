main() {
  // final variables are single-assignment:
  var foo = "hello";
  print(foo);

  try {
    foo = 'goodbye'; // runtime error; already assigned
  } catch (e) {
    print('error');
  }

  var pos = new Position(4);

  try {
    pos.x = 100; // runtime error
  } catch (e) {
    print('error');
  }
}

class Position {
  int x;
  int y;
  Position(this.x) : y = 0;
}

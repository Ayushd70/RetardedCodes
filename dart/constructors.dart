class Position {
  int x = 0;
  int y = 0;

  // simple constructor
  Position(this.x, this.y);

  // named constructor
  Position.atOrigin() {
    x = 0;
    y = 0;
  }

  // Factory constructors
  factory Position.fromMap(Map m) {
    return new Position(m['x'], m['y']);
  }

  String toString() => "[$x, $y]";
}

main() {
  print(new Position(30, 40));
  print(new Position.atOrigin());
  print(new Position.fromMap({'x': 4, 'y': 100}));
}

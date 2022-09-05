import 'dart:math';

class Position {
  final int x;
  final int y;
  final double rad;

  //initializer field
  Position(int x, int y)
      : this.x = x,
        this.y = y,
        rad = atan2(y, x);
}

main() {
  var p = new Position(2, 3);
  print('x: ${p.x} y: ${p.y}');
  print('rad: ${p.rad}');
}

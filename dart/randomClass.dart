import 'dart:math';

void main() {
  print("Using Random()");
  Random r1 = new Random();
  print(r1.nextInt(100));
  print(r1.nextBool());
  print(r1.nextDouble());

  print("\nUsing Random.secure() :");
  Random r2 = new Random.secure();
  print(r2.nextInt(100));
  print(r2.nextBool());
  print(r2.nextDouble());
}

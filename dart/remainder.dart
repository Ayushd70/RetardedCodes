import 'dart:io';

void main() {
  print("Enter the first number : ");
  int first = int.parse(stdin.readLineSync());

  print("Enter the second number : ");
  int second = int.parse(stdin.readLineSync());

  print("Remainder of $first/$second ${first.remainder(second)}");
}

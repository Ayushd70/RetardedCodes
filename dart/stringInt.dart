import 'dart:io';

void main() {
  print('Enter your age: ');
  var age = int.parse(stdin.readLineSync());

  print('You have entered: $age');
  print(
      '${age < 10 ? "Sorry, You are not allowed to enter this room !!" : "You can enter this room"}');
}

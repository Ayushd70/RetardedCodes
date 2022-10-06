import 'dart:io';

findFactorial(int no) {
  if (no == 1) {
    return 1;
  }
  return no * findFactorial(no - 1);
}

main() {
  print("Enter a number : ");
  String s = stdin.readLineSync();
  if (s != null) {
    var no = int.parse(s);
    print('Factorial of $no is ${findFactorial(no)}');
  }
}

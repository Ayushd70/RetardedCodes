import 'dart:io';

main() {
  stdout.writeln("Enter a string : ");
  var str = stdin.readLineSync();

  stdout.writeln("Uppercase conversion : " + str.toUpperCase());
  stdout.writeln("Lowercase conversion : " + str.toLowerCase());
}

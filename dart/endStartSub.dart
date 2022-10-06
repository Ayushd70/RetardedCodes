import 'dart:io';

void main() {
  String mainString;
  String subString;

  print("Enter a string : ");
  mainString = stdin.readLineSync();

  print("Enter the sub string : ");
  subString = stdin.readLineSync();

  if (mainString.startsWith(subString)) {
    print('"$mainString" starts with "$subString"');
  } else if (mainString.endsWith(subString)) {
    print('"$mainString" ends with "$subString"');
  } else {
    print('"$mainString" doesn\'t contain "$subString"');
  }
}

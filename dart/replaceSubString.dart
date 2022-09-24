import "dart:core";

void main() {
  final givenString = "abcdefghijklmnopqrstuvwxyz";
  final newString =
      givenString.replaceAllMapped(new RegExp(r'[aeiou]'), (match) {
    return '*';
  });
  print(newString);
}

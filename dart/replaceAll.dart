main() {
  var givenString = "Thi2s is3 a4 string with character5s an3 numbers90";
  print(givenString.replaceAll(RegExp(r'[0-9]'), '*'));
}

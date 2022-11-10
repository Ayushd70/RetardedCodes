void main() {
  String string_1 = "AA";
  String string_2 = "3E8";
  String string_3 = "EEE";

  print("string_1 ${int.parse(string_1, radix: 16)}");
  print("string_2 ${int.parse(string_2, radix: 16)}");
  print("string_3 ${int.parse(string_3, radix: 16)}");
}

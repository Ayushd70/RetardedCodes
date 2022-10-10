main(List<String> args) {
  String s = "User card number : 9989893839";
  print(s.splitMapJoin((new RegExp(r'[0-9]')),
      onMatch: (m) => '*', onNonMatch: (n) => n.toUpperCase()));
}

main() {
  var medals = Set();
  medals.add("gold");
  medals.add("silver");
  medals.add("bronze");

  // Hash set
  medals.add("gold");

  print('has gold? ${medals.contains("gold")}');
  print('has platinum? ${medals.contains("platinum")}');

  // Sets from iterables
  var meals = new Set.from(['breakfast', 'lunch', 'dinner']);

  print(medals.union(meals));
  print(medals.lookup("gold"));
  print(medals.lookup("platinum"));
  print(medals.difference(meals));
}

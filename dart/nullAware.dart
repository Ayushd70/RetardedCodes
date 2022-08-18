main() {
  // ?? operator returns the first expresion if it is not null

  var monday = 'work';
  var tuesday;
  var wed = tuesday ?? monday;
  print('next appointment: $wed');

  // ??= operator assigns a value if it is not null
  var next;
  next ??= wed;
  print('next appointment: $next');
}

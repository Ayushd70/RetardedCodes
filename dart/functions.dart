// A simple function definition
yell(str) => str.toUpperCase();

// Functions can have type annotations
List lines(String str) {
  return str.split('\n');
}

main() {
  var poemLines = lines(poem);
  print(yell(poemLines.first));
}

const poem = '''
The wren
Earns his living
Noiselessly.''';

import 'dart:math';

main(List<String> args) {
  final random = new Random();
  for (int i = 0; i < 10; i++) {
    print(random.nextInt(100));
  }
}

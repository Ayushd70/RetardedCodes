import 'dart:collection';

main() {
  //head or tail adding
  var q = Queue.from([300, 200, 100, 500]);

  // Queues implement Iterable
  print(q.takeWhile((i) => i > 100));

  // consuming a queue
  while (q.first > 100) {
    q.removeFirst();
  }
  print(q);
}

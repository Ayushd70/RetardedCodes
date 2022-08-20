class CodeError extends StateError {
  CodeError(String msg) : super(msg);
}

class Error {
  int err;
  Error(this.err);

  String compile() {
    if (err > 4) {
      throw new CodeError('your program failed to compile');
    }
    return 'compiled';
  }
}

main() {
  var e = new Error(7);

  try {
    e.compile();
  } on CodeError catch (_) {
    print('errorrrrrrrrr');
  }

  // null object throwing
  try {
    throw ('error');
  } catch (_) {
    print('caught an exception');
  }

  // exceptions halt executions
  e.compile();
  print('not reached');
}

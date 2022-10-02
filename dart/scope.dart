main(List<String> args) {
  fooOuter() {
    print("Hello from foo outer!");
  }

  fooInner() {
    print("Hello from foo inner!");
  }

  fooOuter();

  fooInner();
}

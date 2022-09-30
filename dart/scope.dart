main(List<string> args) {

  fooOuter() {

    print("Hello from foo outer !");

    fooInner() {

      print("Hello from foo !");

      fooOuter();

    }

  }

  fooOuter();

  fooInner();

}

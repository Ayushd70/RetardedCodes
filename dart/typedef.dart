typedef Greet(String name);

String SayHello(String name) {
  return "Hello $name";
}

String SayGoodBye(String name) {
  return "Good Bye $name !";
}

String SayHappyBirthday(String name) {
  return "Happy Birthday $name !";
}

main(List<String> args) {
  Greet greet;

  greet = SayHello;
  print(greet("Ayush"));

  greet = SayGoodBye;
  print(greet("Ayush"));

  greet = SayHappyBirthday;
  print(greet("Ayush"));
}

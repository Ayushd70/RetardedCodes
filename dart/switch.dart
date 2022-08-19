main() {
  // switch statement
  var food = 'pizza';
  switch (food) {
    case 'pasta':
      print('White Sauce is lob');
      break;
    case 'pizza':
      print('i love pizzaaaaaaaaa');
      break;
    default:
      print('gib fooodddddddd');
  }

  // fall through of case when they are empty
  food = 'italian';
  switch (food) {
    case 'italian':
    case 'indian':
      print('indian food is bae');
      break;
  }
}

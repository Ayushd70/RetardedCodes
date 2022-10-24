void main() {
  double double_1 = double.tryParse('123');
  double double_2 = double.tryParse('2.5');
  double double_3 = double.tryParse('.3');
  double double_4 = double.tryParse('+3.14');
  double double_5 = double.tryParse('+2.e3');
  double double_6 = double.tryParse('+234E+8');
  double double_7 = double.tryParse('hello');
  double double_8 = double.tryParse('1.23x');

  print("double_1 $double_1");
  print("double_2 $double_2");
  print("double_3 $double_3");
  print("double_4 $double_4");
  print("double_5 $double_5");
  print("double_6 $double_6");
  print("double_7 $double_7");
  print("double_8 $double_8");
}

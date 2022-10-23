void main() {
  var currentDate = new DateTime.now();

  print(currentDate);
  print("day :" + currentDate.day.toString());
  print("hour :" + currentDate.hour.toString());
  print("minute :" + currentDate.minute.toString());
  print("month :" + currentDate.month.toString());
  print("second :" + currentDate.second.toString());
  print("weekday :" + currentDate.weekday.toString());
  print("year :" + currentDate.year.toString());
}

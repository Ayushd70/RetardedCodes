# Program to display calendar of the given month and year

# import the calender module
import calendar

# Take the input of year and month
yy = int(input("Enter the year:"))
mm = int(input("Enter the month:"))

# Display the calender
print(calendar.month(yy, mm))
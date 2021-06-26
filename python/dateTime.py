# Python program showing how Python's built-in datetime module works

from datetime import datetime

dt = datetime.now() # Current date and time

# Date
day = dt.day # Current day
month = dt.month # Current month
year = dt.year # Current year

# Hour
hour = dt.hour # Current hour
minute = dt.minute # Current minute
second = dt.second # Current second
microsecond = dt.microsecond # Current microsecond

print(f"Current date: {day}/{month}/{year}")
print(f"Current hour: {hour}:{minute}:{second}")
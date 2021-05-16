# Program to convert Miles to Kilometers

# Taking miles input from the user
miles = float(input("Enter value in miles: "))

# conversion factor
convFac = 0.621371

# calculate kilometers
kilometers = miles / convFac
print('%0.2f miles is equal to %0.2f kilometers' %(miles, kilometers))

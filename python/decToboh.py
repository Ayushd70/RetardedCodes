# Python program to convert Decimal to Binary, Octal, Hexadecimal
# Take the input
dec = int(input("Enter the Decimal: "))

# A number with the prefix 0b is considered binary, 0o is considered octal and 0x as hexadecimal. For example:
# 60 = 0b11100 = 0o74 = 0x3c

print("The decimal value of", dec, "is:")
print(bin(dec), "in binary.")
print(oct(dec), "in octal.")
print(hex(dec), "in hexadecimal.")

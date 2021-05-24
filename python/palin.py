# Program to check if a string is palindrome or not

str = input("Enter the string: ")

# make it suitable for caseless comparison
str = str.casefold()

# reverse the string
rev_str = reversed(str)

# check if the string is equal to its reverse
if list(str) == list(rev_str):
    print("The string is a palindrome.")
else:
    print("The string is not a palindrome.")


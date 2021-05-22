# Python program who returns True if the string is all alphabetic characters

text = input("Enter your text: ")

if text.isalpha():
    print("The string contains only alphabetic characters !")
else:
    print("It seems that the string does not contain only alphabetic characters")
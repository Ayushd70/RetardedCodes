# Program to sort alphabetically the words form a string provided by the user

strng = input("Enter a string: ")

# breakdown the string into a list of words
words = [word.lower() for word in strng.split()]

# sort the list
words.sort()

# display the sorted words

print("The sorted words are:")
for word in words:
    print(word)

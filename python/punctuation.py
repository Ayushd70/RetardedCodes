# Python Program to remove punctuation from a string

# define punctuation
punctuations = """!()-[]{};:'"\,<>./?@#$%^&*_~"""

strng = input("Enter a string: ")

# remove punctuation from the string
no_punct = ""
for char in strng:
    if char not in punctuations:
        no_punct = no_punct + char

# display the unpunctuated string
print(no_punct)

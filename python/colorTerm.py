# Python Program to Print Colored Text to the Terminal

# Method 1 using termcolor
from termcolor import colored

print(colored('RetardedCodes', 'blue'))

# Method 2 using ANSI escape sequences
# print('\x1b[38;2;5;86;243m' + 'RetardedCodes' + '\x1b[0m')

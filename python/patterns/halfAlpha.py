# Program to print half pyramid using alphabets
# A
# B B
# C C C
# D D D D
# E E E E E

rows = int(input("Enter number of rows: "))

ascii_value = 65

for i in range(rows):
    for j in range(i + 1):
        alphabet = chr(ascii_value)
        print(alphabet, end=" ")

    ascii_value += 1
    print("\n")

# Program to print half pyramid a using numbers
# 1
# 1 2
# 1 2 3
# 1 2 3 4
# 1 2 3 4 5

rows = int(input("Enter number of rows: "))

for i in range(rows):
    for j in range(i + 1):
        print(j + 1, end=" ")
    print("\n")

# Inverted half pyramid using numbers
#  1 2 3 4 5
# 1 2 3 4
# 1 2 3
# 1 2
# 1

rows = int(input("Enter number of rows: "))

for i in range(rows, 0, -1):
    for j in range(1, i + 1):
        print(j, end=" ")

    print("\n")

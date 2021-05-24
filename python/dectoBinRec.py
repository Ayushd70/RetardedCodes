# Function to print binary number using recursion

dec = int(input("Enter the number:"))


def convertToBinary(n):
    if n > 1:
        convertToBinary(n // 2)
    print(n % 2, end="")


convertToBinary(dec)
print()

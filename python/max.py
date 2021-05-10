# Python Program to find maximum of two  numbers

# Store input numbers
num1 = input("Enter first number: ")
num2 = input("Enter second number: ")

# Compare two numbers
def maximum(num1, num2):

    if num1 >= num2:
        return num1
    else:
        return num2


# Display the sum
print("The maximum of two number is:", (maximum(num1, num2)))

# Python program to find the sum of natural using recursion

num = int(input("Enter the number:"))


def recur_sum(n):
    if n <= 1:
        return n
    else:
        return n + recur_sum(n - 1)


if num < 0:
    print("Enter a positive number")
else:
    print("The sum is", recur_sum(num))


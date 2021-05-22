# Python program that from a list of 10 numbers, saves the even numbers in one list and the odd numbers in another list
# This program uses list compression

list_numbers = range(11)

even_numbers = [even for even in list_numbers if even % 2 == 0]
odd_numbers = [odd for odd in list_numbers if odd % 2 != 0]


print(f"""
The even numbers in the list are : {even_numbers}
The odd numbers in the list are : {odd_numbers}
""")
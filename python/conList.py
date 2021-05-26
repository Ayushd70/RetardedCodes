# Python Program Concatenate Two Lists

# Method 1 using + operator
list_1 = [1, 'a']
list_2 = [3, 4, 5]

list_joined = list_1 + list_2
print(list_joined)

# Method 2 using * operator
# list_1 = [1, 'a']
# list_2 = range(2, 4)

# list_joined = [*list_1, *list_2]
# print(list_joined)

# Method 3 using unique values
# list_1 = [1, 'a']
# list_2 = [1, 2, 3]

# list_joined = list(set(list_1 + list_2))
# print(list_joined)

# Method 4 using extend()
# list_1 = [1, 'a']
# list_2 = [1, 2, 3]

# list_2.extend(list_1)
# print(list_2)

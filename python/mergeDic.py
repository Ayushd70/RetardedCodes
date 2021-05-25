# Python program to merge two dictionary

# Method 1
# Using copy() and update()
dict_1 = {1: 'a', 2: 'b'}
dict_2 = {2: 'c', 4: 'd'}

dict_3 = dict_2.copy()
dict_3.update(dict_1)

print(dict_3)

# Method 2
# Using operator ** (Works only on Python 3.5 and above)
# dict_1 = {1: 'a', 2: 'b'}
# dict_2 = {2: 'c', 4: 'd'}

# print({**dict_1, **dict_2})

# Method 3
# Using operator| (Works only on Python 3.9 and above)
# dict_1 = {1: 'a', 2: 'b'}
# dict_2 = {2: 'c', 4: 'd'}

# print(dict_1|dict_2)

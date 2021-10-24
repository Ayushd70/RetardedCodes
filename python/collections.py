# Program showing some examples of collections module

from collections import Counter

# Count how many times each number is repeated
numbers = [10, 25, 8, 1, 1, 2, 36, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2, 1]
print(Counter(numbers))

# Count how many times each letter is repeated
word = "Hello World !"
print(Counter(word))

# Counting how many times an element is repeated
animals = "cat dog cat dog fish monkey"
print(Counter(animals.split()))

# Some cool examples
c = Counter(animals.split())

print(c.most_common(1)) # First most repeated elements
print(c.most_common(2)) # First two most repeated elements
print(c.most_common()) # Elements ordered by repetitions
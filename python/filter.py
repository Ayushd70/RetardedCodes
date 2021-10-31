# Program showing some examples of the built-in function filter()

# We check if the number is multiple of 5, if it is, then we return True
def multiple(number):
    if number % 5 == 0:
        return True

numbers = [2, 5, 10, 20, 23, 25, 56, 94, 120]

print(list(filter(multiple, numbers)))

# Let's try the same example with a lambda function

print(list(filter(lambda number: number % 5 == 0, numbers)))

# Let's see a more advanced example, what we want is that from a group of people, filter those who are minors.

class Person:
    
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def __str__(self):
        return f"{self.name} is {self.age} years old"
    
# We create a list with several objects
persons = [
    Person("John", 20),
    Person("Carla", 14),
    Person("Charles", 12),
    Person("Kim", 34),
    Person("Samuel", 17)
]

# With the help of a lambda function, we will verify who is minor
minors = filter(lambda person: person.age < 18, persons)

# Let's print the results
for minor in minors:
    print(minor)
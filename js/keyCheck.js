// program to check if a key exists

const person = {
    id: 1,
    name: 'John',
    age: 23
}

// check if key exists
const hasKey = 'name' in person;

if(hasKey) {
    console.log('The key exists.');
}
else {
    console.log('The key does not exist.');
}

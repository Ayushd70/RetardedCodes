// program to count the number of keys/properties in an object

const student = { 
    name: 'Ayush',
    age: 22,
    hobbies: ['driving', 'games', 'coding'],
};

// count the key/value
const result = Object.keys(student).length;

console.log(result);

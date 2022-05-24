// program to merge property of two objects

// object 1
const person = {
    name: 'Ayush',
    age:22
}

// object 2
const student = {
    gender: 'male'
}

// merge two objects
const newObj = Object.assign(person, student);

console.log(newObj);

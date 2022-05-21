// program to remove a property from an object

// creating an object
const student = { 
    name: 'Ayush',
    age: 22,
    hobbies: ['driving', 'games', 'coding'],
    greet: function() {
        console.log('Hello everyone.');
    },
    score: {
        maths: 90,
        science: 80
    }
};

// deleting a property from an object
delete student.greet;
delete student['score'];

console.log(student);

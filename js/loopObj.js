// program to loop through an object using for...in loop

const student = { 
    name: 'Ayush',
    age: 22,
    hobbies: ['driving', 'games', 'coding'],
};

// using for...in
for (let key in student) { 
    let value;

    // get the value
    value = student[key];

    console.log(key + " - " +  value); 
} 

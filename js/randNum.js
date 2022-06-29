// program to generate a random number between two numbers

// minimum and maximum value
const min = parseInt(prompt("Enter a min value: "));
const max = parseInt(prompt("Enter a max value: "));

// random number generation
const num = Math.floor(Math.random() * (max - min + 1)) + min;

console.log('Random number between ${min} and ${max} is {num}');

// program to display current date and time

// get local machine date and time
const date = new Date();

// get the date as a string
const n = date.toDateString();

// get the time as a string
const time = date.toLocaleDateString();

// display date 
console.log('Date: ' + n);

// display the time
console.log('Time: ' + n);

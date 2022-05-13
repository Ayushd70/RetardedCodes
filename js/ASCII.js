// program to find the ASCII value of a character

// take input from the user
const string = prompt('Enter a character: ');

// convert into ASCII value
const result = string.codePointAt(0);

console.log(`The ASCII value is: ${result}`);

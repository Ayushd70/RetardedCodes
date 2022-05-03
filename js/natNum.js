// program to display the sum of natural numbers

// take input from the user
const number = parseInt(prompt('Enter a positive integer: '));

let sum = 0, i = 1;

// looping from i = 1 to number
while(i <= number) {
    sum += i;
    i++;
}

console.log('The sum of natural numbers:', sum);

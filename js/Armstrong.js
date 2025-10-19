// Check if a number is an Armstrong number
function isArmstrongNumber(num) {
  const digits = num.toString().split('');
  const power = digits.length;

  const sum = digits.reduce((acc, digit) => acc + Math.pow(+digit, power), 0);
  return sum === num;
}

// Example usage:
const number = parseInt(prompt('Enter a positive integer:'), 10);

if (isArmstrongNumber(number)) {
  console.log(`${number} is an Armstrong number.`);
} else {
  console.log(`${number} is not an Armstrong number.`);
}

// Generate Fibonacci Series up to n terms
function generateFibonacci(n) {
  if (n <= 0) return [];
  if (n === 1) return [0];

  const series = [0, 1];
  for (let i = 2; i < n; i++) {
    series.push(series[i - 1] + series[i - 2]);
  }
  return series;
}

// Example usage:
const number = parseInt(prompt('Enter the number of terms:'), 10);
console.log('Fibonacci Series:', generateFibonacci(number));

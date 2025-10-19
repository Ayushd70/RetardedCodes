// Optimized Bubble Sort
function bubbleSort(arr) {
  const len = arr.length;
  let swapped;

  for (let i = 0; i < len - 1; i++) {
    swapped = false;
    for (let j = 0; j < len - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]]; // ES6 swap
        swapped = true;
      }
    }
    // If no two elements were swapped, array is already sorted
    if (!swapped) break;
  }

  return arr;
}

console.log(bubbleSort([3, 0, 2, 5, -1, 4, 1]));

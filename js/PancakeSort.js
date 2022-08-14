// Pancake Sort

function pancake_sort(arr) {
  for (var i = arr.length - 1; i >= 1; i--) {
    var max_idx = 0;
    var max = arr[0];
    for (var j = 1; j <= i; j++) {
      if (arr[j] > max) {
        max = arr[j];
        max_idx = j;
      }
    }

    if (max_idx == i) continue;

    var new_slice;

    if (max_idx > 0) {
      new_slice = arr.slice(0, max_idx + 1).reverse();
      for (j = 0; j <= max_idx; j++) arr[j] = new_slice[j];
    }

    new_slice = arr.slice(0, i + 1).reverse();
    for (j = 0; j <= i; j++) arr[j] = new_slice[j];
  }
  return arr;
}

var arra = [3, 0, 2, 5, -1, 4, 1];
console.log("Original Array Elements");
console.log(arra);
console.log("Sorted Array Elements");
console.log(pancake_sort(arra, 0, 5));

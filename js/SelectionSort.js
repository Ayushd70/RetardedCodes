"use strict";
// Selection sort with O(n^2) time complexity

function Selection_Sort(arr, compare_Function) {
  function compare(a, b) {
    return a - b;
  }
  let min = 0;
  let index = 0;
  let temp = 0;

  compare_Function = compare_Function || compare;

  for (let i = 0; i < arr.length; i += 1) {
    index = i;
    min = arr[i];

    for (let j = i + 1; j < arr.length; j += 1) {
      if (compare_Function(min, arr[j]) > 0) {
        min = arr[j];
        index = j;
      }
    }

    temp = arr[i];
    arr[i] = min;
    arr[index] = temp;
  }

  return arr;
}

console.log(
  Selection_Sort([3, 0, 2, 5, -1, 4, 1], function (a, b) {
    return a - b;
  })
);
console.log(
  Selection_Sort([3, 0, 2, 5, -1, 4, 1], function (a, b) {
    return b - a;
  })
);

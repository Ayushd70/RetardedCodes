// Quick Sort

function quick_sort(orgiArray) {
  if (orgiArray.length <= 1) {
    return orgiArray;
  } else {
    var left = [];
    var right = [];
    var newArray = [];
    var pivot = orgiArray.pop();
    var length = orgiArray.length;

    for (var i = 0; i < length; i++) {
      if (orgiArray[i] <= pivot) {
        left.push(orgiArray[i]);
      } else {
        right.push(orgiArray[i]);
      }
    }

    return newArray.concat(quick_sort(left), pivot, quick_sort(right));
  }
}

var Array = [3, 0, 2, 5, -1, 4, 1];
console.log("Original array: " + Array);
var sortedArray = quick_sort(Array);
console.log("Sorted array: " + sortedArray);

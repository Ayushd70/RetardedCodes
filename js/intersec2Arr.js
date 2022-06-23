// program to perform intersection between two arrays
// intersection contains elements of array1 that are also in array2

function performIntersection(arr1, arr2) {
    
    const setA = new Set(arr1);
    const setB = new Set(arr2);

    let intersectionResult = [];

    for(let i of setB) {
        if(setA.has(i)) {
            intersectionResult.push(i);
        }
    }
    
    return intersectionResult;
}

const array1 = [1, 2, 3, 4, 5];
const array2 = [1, 3, 5];

const result = performIntersection(array1, array2);
console.log(result);

// Performing Intersection Using filter() Method

// function performIntersection(array1, array2) {
    
//     const intersectionResult = arr1.filter(x => arr2.indexOf(x) !== -1);
//     return intersectionResult;
// }

// const array1 = [1, 2, 3, 4, 5];
// const array2 = [1, 3, 5];

// const result = performIntersection(array1, array2);
// console.log(result);
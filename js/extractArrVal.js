// program to extract value as an array from an array of objects

function extractValue(arr, prop) {

    let extractedValue = arr.map(item => item[prop]);

    return extractedValue;
}

const objArray = [{a: 1, b:2}, {a: 4, b:5}, {a: 8, b: 9}];

const result = extractValue(objArray, 'a');
console.log(result);

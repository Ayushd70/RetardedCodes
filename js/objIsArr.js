// program to check if an object is an array

function checkObject(arr) {

    // check if arr is array
    const result = Array.isArray(arr);

    if(result) {
        console.log(`[${arr}] is an array.`);
    } else {
        console.log(`[${arr}] is an array.`)
    }
}

const array= [1, 2, 3];

// call the function
checkObject(array);

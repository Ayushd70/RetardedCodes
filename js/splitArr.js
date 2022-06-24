// program to split array into smaller chunks

function splitIntoChunk(arr, chunk) {

    for (i = 0; i < arr.length; i+= chunk) {

        let tempArray;
        tempArray = arr.slice(i, i + chunk);
        console.log(tempArray);
    }
}

const array = [1, 2, 3, 4, 5, 6, 7, 8];
const chunk = 2;
splitIntoChunk(array, chunk);

// program to get the file extension

function getFileExtension(filename) {

    const extension = filename.split('.').pop();
    return extension;
}

const result = getFileExtension('comp2Arr.js');
console.log(result);

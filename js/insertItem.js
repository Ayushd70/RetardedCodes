// program to insert an item at a speific index into an array

function insertElement() {
    let array = [1,2,3,4,5];

    // index to add to
    let index = 3;

    // element to be removed
    let element = 8;

    array.splice(index, 0, element);
    console.log(array);
}

insertElement();

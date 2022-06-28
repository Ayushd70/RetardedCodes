// program to illustrate different set operations

// perform union operation
function union(a, b) {
    let unionSet = new Set(a);
    for (let i of b) {
        unionSet.add(i);
    }
    return unionSet
}

// two sets of fruits
const setA = new Set(['apple', 'mango', 'orange']);
const setB = new Set(['grapes', 'apple', 'banana']);

const result1 = union(setA, setB);

console.log(result1);

// perform intersection operation
function intersection(setC, setD) {
    let intersectionSet = new Set();

    for (let i of setD) {
        if (setC.has(i)) {
            intersectionSet.add(i);
        }
    }
    return intersectionSet;
}

// two sets of fruits
const setC = new Set(['apple', 'mango', 'orange']);
const setD = new Set(['grapes', 'apple', 'banana']);

const result2 = intersection(setC, setD);

console.log(result2);

// perform difference operation
function difference(setE, setF) {
    let differenceSet = new Set(setE)
    for (let i of setF) {
        differenceSet.delete(i)
    }
    return differenceSet
}

// two sets of fruits
const setE = new Set(['apple', 'mango', 'orange']);
const setF = new Set(['grapes', 'apple', 'banana']);

const result3 = difference(setE, setF);

console.log(result3);

// perform subset operation
// true if all elements of set b is in set a
function subset(setG, setH) {
    for (let i of setH) {
        if (!setG.has(i)) {
            return false
        }
    }
    return true
}

// two sets of fruits
const setG = new Set(['apple', 'mango', 'orange']);
const setH = new Set(['apple', 'orange']);

const result4 = subset(setG, setH);

console.log(result4);
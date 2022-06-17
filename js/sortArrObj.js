// program to sort array by property name

function compareName(a, b) {

    // sorting based on name
    const name1 = a.name.toUpperCase();
    const name2 = b.name.toUpperCase();

    let comparison = 0;

    if(name1 > name2) {
        comparison = 1;
    } else if(name1 < name2) {
        comparison = -1;
    }
    return comparison;
}

const students = [{name: 'Ayush', age:22}, {name: 'Dubey', age:22}, {name: 'Jack', age:25}];

console.log(students.sort(compareName));

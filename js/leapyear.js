// program to check leap year

function checkLeapYear(year) {
    // checking for the number to be leap year
    if((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
        console.log(year + ' is a leap year');
    } else {
        console.log(year + ' is not a leap year');
    }
}

// take input
const year = prompt('Enter a year to check:');
checkLeapYear(year);

// program to compare two value of dates and times

// create two dates
const dt1 = new Date();
const dt2 = new Date();

// comparisons
const compare1 = d1 < dt2;
console.log(compare1);

const compare2 = d1 > d2;
console.log(compare2);

const compare3 = d1 <= d2;
console.log(compare3);

const compare4 = d1 >= d2;
console.log(compare4);

const compare5 = d1.getTime() === d2.getTime();
console.log(compare5);

const compare6 = d1.getTime() !== d2.getTime();
console.log(compare6);

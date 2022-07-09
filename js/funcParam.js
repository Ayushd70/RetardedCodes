// program to pass a function as a parameter

function greet() {
  return "Hello";
}

function name(user, func) {
  const message = func();

  console.log(`${message} ${user}`);
}

name("Ayush", greet);
name("John", greet);
name("Alex", greet);

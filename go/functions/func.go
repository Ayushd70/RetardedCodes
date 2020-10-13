package main

import "fmt"

// function that takes int and returns there sum
func plus(a int, b int) int {

	//go need return statement as it won't automatically return the value of the last expressiom
	return a + b
}

//Multiple parameters if the same type may omit he type name for like typed parameters
func plusPlus(a, b, c int) int {
	return a + b + c
}

func main() {

	//calling the func with the arg value
	res := plus(1, 2)
	fmt.Println("1+2 =", res)

	res = plusPlus(1, 2, 3)
	fmt.Println("1+2+3 =", res)
}

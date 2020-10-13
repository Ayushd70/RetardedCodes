package main

import "fmt"

//this shows the function returns 2 ints
func vals() (int, int) {
	return 3, 7
}

func main() {

	// 2 diff return values from the call with mutliple assignment
	a, b := vals()
	fmt.Println(a)
	fmt.Println(b)

	_, c := vals()
	fmt.Println(c)
}

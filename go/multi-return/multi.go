package main

import "fmt"

//this shows the function returns 2 ints
func Vals() (int, int) {
	return 3, 7
}

func main() {

	// 2 diff return values from the call with mutliple assignment
	a, b := Vals()
	fmt.Println(a)
	fmt.Println(b)

	_, c := Vals()
	fmt.Println(c)
}

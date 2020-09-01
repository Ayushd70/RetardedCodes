// GO program to add 2 two number

package main

import "fmt"

func main() {
	fmt.Println("Enter two numbers to be added")
	var x, y int
	fmt.Scanln(&x)
	fmt.Scanln(&y)
	var s int
	s = x + y
	fmt.Println("The sum of the two digits is", s)
}

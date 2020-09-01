// GO program to substract two digits
package main

import "fmt"

func main() {
	fmt.Println("Enter the two numbers to be subtracted")
	var x, y int
	fmt.Scanln(&x)
	fmt.Scanln(&y)
	var s int
	s = x - y
	fmt.Println("The substraction of the two digits is", s)
}

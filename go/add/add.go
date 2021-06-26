// GO program to add 2 two number

package main

import "fmt"

func Sum(x, y int ) int {
	return (x + y)
}

func main () {
	fmt.Println("Enter two numbers to be added")
	var x,y int
	fmt.Scanln(&x)
	fmt.Scanln(&y)
	fmt.Printf("Sum of %d and %d = %d", x, y, Sum(x,y))
}

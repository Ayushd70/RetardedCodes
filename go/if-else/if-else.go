// A program to check if a number is Odd/Even
package main

import "fmt"

func OddEven(x int) string {
	if x%2 == 0 {
		return ("the number is even number")
	} else {
		return ("the number is a odd number")
	}
}

func main() {
	var x int
	fmt.Println("Enter to check if a number is odd or even")
	fmt.Scanln(&x)
	fmt.Println(OddEven(x))
}

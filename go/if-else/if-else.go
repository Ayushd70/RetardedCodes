// A program to check if a number is Odd/Even
package main

import "fmt"

func main() {
	var x int
	fmt.Println("Enter to check if a number is odd or even")
	fmt.Scanln(&x)
	if x%2 == 0 {
		fmt.Println("the number  is even number", x)
	} else {
		fmt.Println("the number is a odd number", x)
	}
}

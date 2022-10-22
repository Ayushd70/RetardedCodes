package main

import "fmt"

// call the function until it reaches the base case of fact(0)
func Fact(n int) int {
	if n == 0 {
		return 1
	}
	return n * Fact(n-1)
}

func main() {
	fmt.Println(Fact(7))
}

package main

import "fmt"

func main() {

	// Basic loop
	i := 1
	for i <= 3 {
		fmt.Println(i)
		i++
	}

	// Conditional loop
	for j := 4; j <= 9; j++ {
		fmt.Println(j)
	}

	// Infinite loop
	for {
		fmt.Println("to continue looping comment the break  and continue statement ")
		break
	}

	// Continue Iteration of loop
	for n := 0; n <= 5; n++ {
		if n%2 == 0 {
			continue
		}
		fmt.Println(n)
	}

}

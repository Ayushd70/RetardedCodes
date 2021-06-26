package main

import "fmt"

func BasicLoop(i int) int {
	for i <= 3 {
		fmt.Println(i)
		i++
	}

	return i
}

func ConditionalLoop(j int) int {
	for ;j <= 9; j++ {
		fmt.Println(j)
	}
	return j
}

func main() {

	fmt.Println("Basic loop")
	// Basic loop
	i := 1
	BasicLoop(i)


	fmt.Println("Conditional loop")
	j := 4
	// Conditional loop
	ConditionalLoop(j)

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

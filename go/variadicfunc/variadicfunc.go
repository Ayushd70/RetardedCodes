package main

import "fmt"

// takes a slice/array of ints as arg
func Sum(nums ...int) {
	fmt.Print(nums, " ")
	total := 0
	for _, num := range nums {
		total += num
	}
	fmt.Println(total)
}

func main() {
	//Call the variadic functions
	Sum(1, 2)
	Sum(1, 2, 3)

	// apply mutiple args in a slice can be applied to a variadic func using "func (slice...)"
	nums := []int{1, 2, 3, 4}
	Sum(nums...)
}

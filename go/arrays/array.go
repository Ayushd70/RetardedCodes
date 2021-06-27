package main

import "fmt"

func Array(numbers []int) []int {
	var arr []int
	arr = append(arr, numbers...)
	return arr
}

func main () {

	//Array of 5 elements
	var a [5]int
	fmt.Println("array", a)

	//Setting a value to the 5th index in an array
	a[4] = 5
	fmt.Println("Array:", a)
	fmt.Println("value", a[4])

	//Length of an array
	fmt.Println("len:", len(a))

	//Declaring an array in a single line
	b := [5]int{1,2,3,4,5}
	fmt.Println("declare:", b)

	//2-D Array
	var twoD [4][5]int
	for i := 0; i<4; i++ {
		for j := 0; j<5; j++ {
			twoD[i][j] = i+j
		}
	}
	fmt.Println("2d Array:", twoD)

}
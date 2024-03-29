package main

import "fmt"

// This function returns another function
func IntSeq() func() int {
	i := 0
	return func() int {
		i++
		return i
	}
}

func main() {

	//call intSeq assigning the value of  nextInt
	nextInt := IntSeq()

	//effect of closure
	fmt.Println(nextInt())
	fmt.Println(nextInt())
	fmt.Println(nextInt())

	//confirm tgat the state is unique to that particular function
	newInts := IntSeq()
	fmt.Println(newInts())
}

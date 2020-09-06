package main

import "fmt"

func main() {
	//make a slice of strings of length 5
	s := make([]string, 5)
	fmt.Println("slice:", 5)

	//get the slice value from the index
	s[0] = "a"
	s[1] = "b"
	s[2] = "c"
	fmt.Println("slice is:", s)
	fmt.Println("value", s[2])

	//Length of the slice
	fmt.Println("len:", len(s))

	//append a value into a slice
	s = append(s, "d")
	s = append(s, "e", "f")
	fmt.Println("append:", s)

	//copy a slice into a slice of same length
	var c = make([]string, len(s))
	copy(c, s)
	fmt.Println("copy:", c)

	//Slices support a “slice” operator with the syntax slice[low:high]
	l := s[2:5]
	fmt.Println("sl1:", l)

	//Slices Gotcha
	l = s[:5] //slices upto 5 but excluding 5
	fmt.Println("Slice upto 5:", l)

	l = s[2:] //Slice from 2 and including 2
	fmt.Println("Slice from 2", l)

	//Declaring and initialise a slice in a single line
	t := []string{"g", "h", "i"}
	fmt.Println("slice in a line", t)

	//2D slice
	twoD := make([][]int, 5)
	for i := 0; i < 5; i++ {
		innerlen := i + 1
		twoD[i] = make([]int, innerlen)
		for j := 0; j < innerlen; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d :", twoD)
}
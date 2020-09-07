package main

import "fmt"

func main() {
	//Empty Map
	m := make(map[string]int)

	//Set value
	m["k1"] = 2
	m["k2"] = 3

	fmt.Println("map:", m)

	//Return the number of keys/value pairs
	fmt.Println("len", len(m))

	//Deleting a key/value pair from a map
	delete(m, "k2")
	fmt.Println("map:", m)

	//declaring a map in a single line
	n := map[string]int{"Hi": 1, "Hello": 2}
	fmt.Println("map:", n)
}

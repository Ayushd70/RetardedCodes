package main

import "fmt"

func main() {
	//Range to sum the numbers in a slice
	nums := []int{1, 2, 3, 4, 5}
	sum := 0
	for _, num := range nums {
		sum += num
	}
	fmt.Println("sum:", sum)

	//Range to find the index
	for i, num := range nums {
		if num == 4 {
			fmt.Println("index:", i)
		}
	}

	//Range to iterate over key/value pairs
	kvs := map[string]string{"a": "ayush", "d": "dubey"}
	for k, v := range kvs {
		fmt.Printf("%s -> %s\n", k, v)
	}

	//Range to iterate over keys of a map
	for k := range kvs {
		fmt.Println("keys:", k)
	}

	//Unicode
	for i, c := range "go" {
		fmt.Println(i, c)
	}
}

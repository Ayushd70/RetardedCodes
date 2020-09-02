package main

import (
	"fmt"
	"math"
)

const s string = "constant"

func main() {
	fmt.Println(s)

	// Constant can appear anywhere a var statement can
	const n = 10000000

	// Constant expressions perform aritthmetic arbitary percision
	const d = 3e20 / n
	fmt.Println(d)

	// Explicit coversion
	fmt.Println(int64(d))

	// A  number can be given a type by using it in a context which requires one
	fmt.Println(math.Sin(n))
}

package main

import (
	"fmt"
	"math"
)

const s string = "constant"

func ExplicitConv(n float64) int64 {
	return int64(n)
}

func TypeUsingContext(n int) float64 {
	return math.Sin(float64(n))
}

func main() {
	fmt.Println(s)

	// Constant can appear anywhere a var statement can
	const n = 10000000

	// Constant expressions perform aritthmetic arbitary percision
	const d = 3e20 / n
	fmt.Println(d)

	// Explicit coversion
	fmt.Println(ExplicitConv(d))

	// A  number can be given a type by using it in a context which requires one
	fmt.Println(TypeUsingContext(n))
}

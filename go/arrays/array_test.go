package main

import (
	"math/rand"
	"testing"
)

func TestArray(t *testing.T) {
	t.Run("Get Array", func(t *testing.T) {
		numbers := []int{1,2,3,4,5}

		got := len(Array(numbers))
		want := 5

		if got != want {
			t.Errorf("Got %v, want %v", got, want)
		}	
	})

	t.Run("Return Huge Array", func(t *testing.T) {
		var numbers []int
	
		for i:=0; i<1000000; i++{
			numbers = append(numbers, rand.Intn(1000000000))
		}
		
		got := len(Array(numbers))
		want := 1000000

		if got != want {
			t.Errorf("Got %v, want %v", got, want)
		}
	})
}
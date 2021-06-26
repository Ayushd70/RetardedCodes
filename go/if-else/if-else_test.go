package main

import "testing"

func TestOddEven(t *testing.T) {
	t.Run("Odd", func(t *testing.T) {
		want := "the number is a odd number"
		got := OddEven(3)

		if got != want {
			t.Errorf("got %v, want %v", got, want)
		}
	})

	t.Run("Odd", func(t *testing.T) {
		want := "the number is even number"
		got := OddEven(6)

		if got != want {
			t.Errorf("got %v, want %v", got, want)
		}
	})
}
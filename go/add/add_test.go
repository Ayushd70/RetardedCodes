package main

import (
	"testing"
)

func TestSum(t * testing.T) {
	t.Run("Normal Sum", func(t *testing.T) {
		x,y := 3,2
		want := 5
		got := Sum(x,y)

		if got != want {
			t.Errorf("Got %d, want %d", got, want)
		}
	})
}
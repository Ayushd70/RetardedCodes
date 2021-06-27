package main

import "testing"

func TestPlus(t *testing.T) {
	t.Run("Test plus function", func(t *testing.T) {
		want := 3
		got := plus(1,2)

		if got != want {
			t.Errorf("Got %d, want %d", got, want)
		}
	})
}

func TestPlusPlus(t *testing.T) {
	t.Run("Test plus plus function", func(t *testing.T) {
		want := 3
		got := plusPlus(1,1,1)

		if got != want {
			t.Errorf("Got %d, want %d", got, want)
		}
	})
}


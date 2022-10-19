package main

import "testing"

func TestIntSeq(t *testing.T) {
	t.Run("Closure returns 1", func(t *testing.T) {

		got := IntSeq()
		want := 1

		if got != want {
			t.Errorf("Got %v, Want %v", got, want)
		}
	})

	t.Run("Closure returns 3 if ran sequentially", func(t *testing.T) {
		got := IntSeq()
		got()
		got()
		got()

		want := 3

		if got != want {
			t.Errorf("Got %v, Want %v", got, want)
		}
	})

	t.Run("Closure returns a unique value if a new instance is created", func(t *testing.T) {
		got := IntSeq()
		got()
		got()
		got()

		want := 3

		newGot := IntSeq()

		newWant := 1

		if got != want {
			t.Errorf("Got %v, Want %v", got, want)
		}

		if newGot != newWant {
			t.Errorf("NewGot %v, NewWant %v", newGot, newWant)
		}
	})
}

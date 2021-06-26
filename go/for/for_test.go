package main

import "testing"

func TestFor(t *testing.T) {
	t.Run("Basic Loop", func (t *testing.T) {
		want := 4
		got := BasicLoop(0)

		if got != want {
			t.Errorf("Got %d, want %d", got, want)
		}
	})

	t.Run("Conditional Loop", func (t *testing.T) {
		want := 10
		got := ConditionalLoop(5)

		if got != want {
			t.Errorf("Got %d, want %d", got, want)
		}
	})
}
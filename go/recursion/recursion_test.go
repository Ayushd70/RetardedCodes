package main

import "testing"

func TestFact(t *testing.T) {
  t.Run("Factorial of 7 is 5040", () {
    got := Fact(7)
    want := 5040

    if got != want {
      fmt.Errorf("Got %v, Want %v", got, want)
    }
  })

  t.Run("Factorial of 5 is 120", () {
    got := Fact(5)
    want := 120

    if got != want {
      fmt.Errorf("Got %v, Want %v", got, want)
    }
  })

  t.Run("Factorial of 2 is 2", () {
    got := Fact(2)
    want := 2

    if got != want {
      fmt.Errorf("Got %v, Want %v", got, want)
    }
  })
}

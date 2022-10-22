package main

import "testing"

func TestSum(t *testing.T) {
 t.Run("Sum of [1,2,3] is 6", () {
   input := []int{1,2,3}

   got := Sum(input)
   want := 6

   if got != want {
     fmt.Errorf("Got %v, Want %v", got, want)
   }
 })
}

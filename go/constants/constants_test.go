package main

import (
	"math"
	"reflect"
	"testing"
)

func TestExplicitConv(t *testing.T) {
	t.Run("Explicit Conversion", func(t *testing.T) {
		n := 3e13
		want := int64(30000000000000)
		got := ExplicitConv(n)

		if !reflect.DeepEqual(got, want) {
			t.Errorf("got %v, want %v", got, want)
		}
	})
}

func TestTypeUsingContext(t *testing.T) {
	t.Run("Explicit Conversion", func(t *testing.T) {
		n := 10000000
		want := math.Sin(float64(n))
		got := TypeUsingContext(n)

		if !reflect.DeepEqual(got, want) {
			t.Errorf("got %v, want %v", got, want)
		}
	})
}

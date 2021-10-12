package main

import "testing"

func TestVals(t *testing.T) {
	tests := []struct {
		name  string
		want  int
		want1 int
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got, got1 := Vals()
			if got != tt.want {
				t.Errorf("Vals() got = %v, want %v", got, tt.want)
			}
			if got1 != tt.want1 {
				t.Errorf("Vals() got1 = %v, want %v", got1, tt.want1)
			}
		})
	}
}

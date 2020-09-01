// GO code to test hello.go
// to test run, "go run hello.go" first then, run "go test".
package main

import "testing"

func TestHello(t *testing.T) {
    got := Hello()
    want := "Hello, world"

    if got != want {
        t.Errorf("got %q want %q", got, want)
    }
}

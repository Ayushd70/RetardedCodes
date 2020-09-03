package main

import (
	"fmt"
	"time"
)

func main() {

	// Basic switch case
	i := 1
	fmt.Print("Welcome ", i, "  ")
	switch i {
	case 1:
		fmt.Println("Dude")
	case 2:
		fmt.Println("Bruh")
	}

	// Separate multiple expression by a comma ","
	switch time.Now().Weekday() {
	case time.Saturday, time.Sunday:
		fmt.Println("It's  the weekend")
	default:
		fmt.Println("It's a weekday")
	}

	// Switch as If-Else alt
	t := time.Now()
	switch {
	case t.Hour() < 12:
		fmt.Println("Good Morning")
	default:
		fmt.Println("Good Afternoon")
	}

	// Type Switch  compares types instead of values
	whatAmI := func(i interface{}) {
		switch t := i.(type) {
		case bool:
			fmt.Println("I am a bool")
		case int:
			fmt.Println("I am an int")
		default:
			fmt.Println("IDK What type I am?", t)
		}
	}
	whatAmI(true)
	whatAmI(1)
	whatAmI("yes")

}

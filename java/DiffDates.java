/*
Java program to find the difference between two dates in years, days, hours, minutes and seconds.
Take start date and end date from the user and print the difference between these two dates in terms of years, days, hours, minutes and seconds.

eg:
Enter start date in dd-MM-yyyy/HH:mm:ss format :
01-01-2001/01:01:01
Enter end date in dd-MM-yyyy/HH:mm:ss format :
07-07-2007/07:07:07
Difference is —>
6 years, 188 days, 6 hours, 6 minutes, 6 seconds
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiffDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start date in dd-MM-yyyy/HH:mm:ss format :");

        String s1 = sc.next();

        System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");

        String s2 = sc.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");

        try {
            Date startDate = formatter.parse(s1);

            Date endDate = formatter.parse(s2);

            long diffInMilliSec = endDate.getTime() - startDate.getTime();

            long seconds = (diffInMilliSec / 1000) % 60;

            long minutes = (diffInMilliSec / (1000 * 60)) % 60;

            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;

            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;

            long years = (diffInMilliSec / (1000L * 60 * 60 * 24 * 365));

            System.out.println("Difference is ---> ");

            System.out.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
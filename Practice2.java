package TestingWithMethodReference.DateAndTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDateTime;
public class Practice2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        DayOfWeek dayOfWeek = today.getDayOfWeek(); // it returned the enum
        System.out.println(dayOfWeek);
        System.out.printf("year is %d,month is%d and day is %d",year,month,day);
        System.out.println();
        System.out.println("Task 2 start here..........................");
//        Task 2
        LocalDate date2 = LocalDate.of(1947,8,15);
        DayOfWeek dayOfWeek1 = date2.getDayOfWeek();
        System.out.println(dayOfWeek1);
        int dayOfYear = date2.getDayOfYear();
        System.out.println(dayOfYear);

        System.out.println("Task2 is starts here................................");
        LocalTime currTime = LocalTime.now();
        LocalTime plus90 = currTime.plusMinutes(90);
        System.out.printf("Original Time: %s and after adding 90 minutes: %s\n",currTime,plus90);

        System.out.println("Leve2...........................................");
        System.out.println();

        System.out.println("Given a date of birth, calculate whether the person is 18 years old or above.");
        LocalDate dob = LocalDate.of(2008, 3, 10);
        LocalDate currDate = LocalDate.now();
        if(Period.between(dob,currDate).getYears()>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        System.out.println("Write a program to check whether a given date is a leap year.");
        LocalDate date = LocalDate.of(2024, 1, 1);
        System.out.println(date.getYear()%4==0?"Leap Year":"Not a Leap Year");

        System.out.println("Given two dates, print which one is earlier.");
        LocalDate d1 = LocalDate.of(2025, 1, 1);
        LocalDate d2 = LocalDate.of(2024, 12, 31);

        if(d1.isBefore(d2)){
            System.out.printf("Earlier date is: %s\n",d1);
        }
        else{
            System.out.printf("Earlier date is: %s\n",d2);
        }

//       Level3
        /*
        An order was placed at:
        LocalDateTime orderTime = LocalDateTime.of(2025, 12, 26, 10, 30);
        Delivery takes 3 days and 5 hours.
        Write code to calculate and print delivery time.
         */
        LocalDateTime orderTime = LocalDateTime.of(2025, 12, 26, 10, 30);
        System.out.printf("Your delivery date is: %s\n",orderTime.plusDays(3).plusHours(5));

        /*
        Write a program to:
        Get current LocalDateTime
        Extract and print only date
        Extract and print only time
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.printf("Local date is %s and Local Time is %s\n",localDate,localTime);

        /*
        Write a program to check whether a given LocalDateTime is in the past or future.
         */
        LocalDateTime given = LocalDateTime.of(2020,12,12,05,30,30);
        System.out.println(localDateTime.isAfter(given)?"Past":"Future");
    }
}

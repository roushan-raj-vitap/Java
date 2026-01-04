package TestingWithMethodReference.DateAndTimeAPI;

import java.time.*;

public class Practice4 {
    public static void main(String[] args) {
        /*
        Write a program to:
        Get current Instant
        Wait for a loop to execute
        Calculate and print execution time in:
        milliseconds
        seconds
         */
        Instant current = Instant.now();
        for (int i=0;i<10000000;i++){

        }
        Duration diff = Duration.between(current,Instant.now());
        System.out.println(diff.toMillis());
        System.out.println(diff.toNanos());
        /*
        Creating Duration
        Create the following Duration objects and print them:
        2 hours
        45 minutes
        120 seconds
         */
        Duration duration = Duration.ofHours(2)
                .plusMinutes(45)
                .plusSeconds(120);
        System.out.println(duration);
        /*
        Write a program to calculate age in years given:
        LocalDate dob = LocalDate.of(2003, 7, 10);
         */
        LocalDate dob = LocalDate.of(2003, 7, 10);
        Period age = Period.between(dob,LocalDate.now());
        System.out.println(age.getYears());
        /*
        Duration Arithmetic
        Write code to:
        Create a Duration of 10 minutes
        Add it to current Instant
        Print original and updated time
         */
        Duration duration1 = Duration.ofMinutes(10);
        Instant after = current.plus(duration1);
        System.out.printf("Original instant time is %s and after adding 10 min is %s\n",current,after);
        /*
        Write a program to:
        Create a Period of 1 year 6 months
        Add it to today’s date
        Print result
         */
        Period period = Period.ofYears(1)
                .plusMonths(6);
        LocalDate today = LocalDate.now();
        LocalDate afterDate = today.plus(period);
        System.out.printf("today date is %s and after adding 1 year an6 months %s\n",today,afterDate);
        /*
        Given:
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end   = start.plusHours(5);
        Calculate difference using Duration
        Print difference in hours
         */
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(5);
        Duration diffDateTime = Duration.between(start,end);
        System.out.println("difference in hours"+diffDateTime.toHours());

        /*
        Subscription Validity
        A subscription starts on:
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        Subscription duration = 1 year 3 months
        Write code to calculate expiry date.
         */
        LocalDate startDate = LocalDate.of(2024,1,1);
        Period validity = Period.ofYears(1).plusMonths(3);
        LocalDate endDate = startDate.plus(validity);
        System.out.println("Expiry date is "+endDate);
        /*
        Q8️Token Expiry (Security-Style)
        Write code to:
        Generate issuedAt using Instant
        Set token expiry after 20 minutes
        Check whether token is expired
         */
        Instant issuedAt = Instant.now();
        Duration duration2 = Duration.ofMinutes(20);
        Instant expiry = issuedAt.plus(duration2);
        System.out.println(Duration.between(issuedAt,expiry).toMinutes()>0?"token is not expired":"expired");
        /*
        Office working hours = 8 hours
        Write code to:
        Record start time using LocalTime
        Calculate end time using Duration
         */
        LocalTime localTime = LocalTime.now();
        Duration duration3 = Duration.ofHours(8);
        LocalTime endTime = localTime.plus(duration3);
        System.out.println("End time of Office worker is "+endTime);
        /*
        Choose the Correct Class
        For each case, write code using the correct class:
        a) Measuring API response time
        b) Calculating a person’s experience (years & months)
        c) Checking whether 30 minutes have passed since login
         */
        
    }
}

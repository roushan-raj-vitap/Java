package TestingWithMethodReference.DateAndTimeAPI;
import java.time.*;
public class Practice3 {
    public static void main(String[] args) {
        /*
        1. Write a Java program to: Print the current Instant
        Print: Epoch seconds Epoch milliseconds
         */
        Instant current = Instant.now();
        long epocSec = current.getEpochSecond();
        long epocMilli = current.toEpochMilli();
        System.out.println(current);
        System.out.println(epocSec);
        System.out.println(epocMilli);
        /*
        Create an Instant using: Epoch seconds = 0
        Epoch milliseconds = 0 Print both.
         */
        Instant custom1 = Instant.ofEpochSecond(0);
        Instant custom2 = Instant.ofEpochMilli(0);
        System.out.printf("Instant from EpocSecond %s and Instant from EpocMilli %s",custom1,custom2);
        /*
        Write code to: Create current Instant
        Add 30 seconds
        Subtract 2 minutes
        Print all values (Show immutability clearly)
         */
        Instant plus30Sec = current.plusSeconds(30);
        Instant Minus2Minutes = current.minusSeconds(2*60);
        System.out.println(plus30Sec);
        System.out.println(Minus2Minutes);
        /*
        Convert the current Instant to:
        LocalDateTime in Asia/Kolkata
        LocalDateTime in America/New_York
         */
        LocalDateTime AsiaDateTime = LocalDateTime.ofInstant(current,ZoneId.of("Asia/Kolkata"));
        System.out.printf("Asia kolkata date time zone %s\n",AsiaDateTime);
        LocalDateTime AmericaDateTime = LocalDateTime.ofInstant(current,ZoneId.of("America/New_York"));
        System.out.printf("Asia kolkata date time zone %s\n",AmericaDateTime);
        /*
        Given two Instant objects, write code to: Check which one occurred earlier
         */
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.parse("2023-05-30T10:15:30.00Z");
        System.out.printf("%s occured first\n",instant1.isBefore(instant2)?instant1:instant2);

        /*
        Write a program to check whether a given Instant is:
        In the past
        Or in the future
         */
        System.out.println(instant2.isBefore(current)?"Past":"In future");
        /*
        You are implementing token expiration logic. Write code to:
        Generate issuedAt as current Instant Set expiry after 15 minutes
        Check whether token is expired
         */
        Instant issuedAt = Instant.now();
        Instant expiration  = issuedAt.plusSeconds(60*15);
        System.out.println(expiration.isAfter(issuedAt.plusSeconds(60*15))?"Token expired":"Token is not expired");
        /*
        Write a program to: Measure execution time of a loop using Instant (Hint: Duration.between())
         */
        Instant start = Instant.now();
        for(long i=0;i<1000000000;i++){

        }
        Duration duration = Duration.between(start,Instant.now());
        System.out.println(duration.getNano());
        /*
        Convert the following to Instant:
        LocalDateTime ldt = LocalDateTime.of(2025, 12, 26, 10, 30);
        ZoneId zone = ZoneId.of("Asia/Kolkata");
         */
        LocalDateTime ldt = LocalDateTime.of(2025, 12, 26, 10, 30);
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        Instant converted = ldt.atZone(zone).toInstant();
        System.out.println(converted);
        /*
        Write a program to demonstrate:
        Why Instant is better than LocalDateTime for logging in distributed systems
        (Print both and explain in comments)
         */
        /*
        Instant is better than LocalDateTime because Instant represent a specific point in time in UTC
        that is common to every region
         */
        Instant instant = Instant.now();
        //now this instant can be converted to any region like
        LocalDateTime kolkataTime = LocalDateTime.ofInstant(instant,ZoneId.of("Asia/kolkata"));
        LocalDateTime americaTime = LocalDateTime.ofInstant(instant,ZoneId.of("America/New_York"));
        
    }
}

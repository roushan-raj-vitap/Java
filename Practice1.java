package TestingWithMethodReference.DateAndTimeAPI;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
public class Practice1 {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(2012,02,15);
        System.out.println(l1);
        String str = "2010-12-03";
        LocalDate l2 = LocalDate.parse(str);
        System.out.println(l2);
        String string = "12/03/2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate l3 = LocalDate.parse(string,formatter);
        System.out.println(l3);
//      DateTimeParseException will get generated if we try to parse datetime and enable to parse it
//      We can Create Date object from instant
        LocalTime localTime1 = LocalTime.of(9,5);
        System.out.println(localTime1);
        LocalDateTime localDateTime = LocalDateTime.of(l1,localTime1);
        System.out.println(localDateTime);
    }
}
package support;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class TimeFormat {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("System time: " + formattedDateTime);
        boolean isMonday = false;
        boolean isTuesday = false;
        boolean isWednesday = false;
        boolean isThursday = false;
        boolean isFriday = false;
        boolean isSaturday = false;
        boolean isSunday = false;
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            isSaturday = true;
        }
        if (isSaturday == true) {
            System.out.println("Today is Saturday.");
        }else {
            System.out.println("Today is not Saturday.");
        }
        System.out.print("Today is: " + TestContext.getDayOfWeek());
        System.out.println();
    }


}

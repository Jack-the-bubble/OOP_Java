import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClient implements TimeClient, Cloneable {
    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }

    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean equals(Object obj){
        if (obj instanceof SimpleTimeClient) {
            SimpleTimeClient object = (SimpleTimeClient)obj;
            return Objects.equals(dateAndTime, object.dateAndTime);
        }
        else return false;
    }

    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: "+myTimeClient.toString());
        System.out.println("Time in California: "+myTimeClient.getZonedDateTime("Blah blah").toString() );
        try {
            TimeClient newTimeClient = (SimpleTimeClient)myTimeClient.clone();
            System.out.println("myTime: "+myTimeClient.getLocalDateTime());
            System.out.println("newTime: "+newTimeClient.getLocalDateTime());
            System.out.println(newTimeClient.equals(myTimeClient));

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}

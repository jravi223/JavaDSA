import java.util.Date;
import java.text.SimpleDateFormat;

public class first_avg {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Current Time is : " + date);

        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        System.out.println("Current Time Format is : " + formatTime.format(date));

        // String time = formatTime.format(date);

        // System.out.println("Current Time in correct format is: " + time);

    }
}
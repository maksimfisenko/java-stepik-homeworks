package homework14;

public class Time {
    public static void showTime() {
        HOURS:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTES:
            for (int minute = 0; minute <= 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break HOURS;
                }
                SECONDS:
                for (int second = 0; second <= 60; second++) {
                    if (second * hour > minute) {
                        continue SECONDS;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}

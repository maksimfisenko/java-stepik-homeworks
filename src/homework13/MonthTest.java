package homework13;

public class MonthTest {
    public void showNumOfDays(Month month) {
        switch (month.serialNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
        }
    }
    public static void main(String[] args) {
        MonthTest test = new MonthTest();
        Month month = new Month(6);
        test.showNumOfDays(month);
    }
}

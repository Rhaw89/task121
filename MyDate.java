package Task121;
import Task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        date1.setMonth(1);
        date1.setDay(1);
        date1.setYear(1978);

        DateTask date2 = new DateTask();
        date2.setMonth(9);
        date2.setDay(21);
        date2.setYear(1984);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        // display leapyears
        date2.printLeapYears();
    }
}
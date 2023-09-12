import java.util.Scanner;

// convert given integer to years , months and days

public class ProblemTwo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        
        int year;
        int month;
        int day;

        year = days / 365;
        month = (days - (year * 365)) / 30;
        day = days - (year * 365) - (month * 30);

        System.out.println(year + " Year(s)");
        System.out.println(month + " Month(s)");
        System.out.println(day + " Day(s)");
    }
}

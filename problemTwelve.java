import java.util.Scanner;

////takes hours and minutes and returns total minutes

public class problemTwelve {
    public static void main(String[] args)
    {
       int timeInMinutes = 0;
       Scanner input = new Scanner(System.in);

       System.out.print("Input the Hours :");
       int hour = input.nextInt();

       System.out.print("Input the Minutes :");
       int min = input.nextInt();

       timeInMinutes = (hour * 60) + min;

       System.out.println(timeInMinutes);
    }
}

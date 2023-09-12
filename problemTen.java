import java.util.Scanner;

// kilometer per hour to miles per hour

public class problemTen {
     public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Input kilometers per hour: ");
       double speed = input.nextDouble();

       double miles = speed * 0.6213712;

       System.out.println(miles + " miles per hour");
    }
}

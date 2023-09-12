import java.util.Scanner;

//find quotient and remainder
public class problemThirteen {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       System.out.print("Input numerator :");
       int numerator = input.nextInt();

       System.out.print("Input denominator :");
       int denominator = input.nextInt();

       int quotient = numerator / denominator;
       int remainder = numerator % denominator;

       System.out.println("quotient = " + quotient);
       System.out.println("remainder = " + remainder);
    }
}

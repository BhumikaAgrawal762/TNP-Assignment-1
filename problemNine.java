import java.util.Scanner;

// Convert centigrade to Fahrenheit

public class problemNine {
     public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Input temperature in Centigrade :");
       double cTemp = input.nextDouble();

       double fTemp = (9 * cTemp + (32 * 5)) / 5;

       System.out.println("Temperature in Fahrenheit is: " + fTemp);
    }
}

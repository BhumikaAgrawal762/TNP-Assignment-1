import java.util.Scanner;

// Integer are multiplied or not

public class problemFour {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       System.out.print("Input the first number: "); 
       int fNo = input.nextInt();

       System.out.print("Input the second number: "); 
       int sNo = input.nextInt();
       
       if(sNo % fNo == 0)
           System.out.println("Multiplied!");
       else
           System.out.print("Not Multiplied!");
    }
}

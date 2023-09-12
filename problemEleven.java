import java.util.Scanner;

// print true if 30

public class problemEleven {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       System.out.print("Input the first Number :");
       int fNo = input.nextInt();

       System.out.print("Input the second Number :");
       int sNo = input.nextInt();

        if((fNo == 30) || (sNo == 30) || (fNo + sNo == 30))
           System.out.println("True");
        else
           System.out.println("False");
    }
}

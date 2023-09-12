import java.util.Scanner;

//read 5 number and sum of all odd values

public class problemEight {
    public static void main(String[] args)
    {
        int total = 0 ;

       Scanner input = new Scanner(System.in);
       
       int[] noArray = new int[5];

        for(int i = 0 ; i < noArray.length ; i++)
        {
            System.out.print("Input the next number: ");
            noArray[i] = input.nextInt();
        }

        for(int num : noArray)
        {
            if(num % 2 == 1)
            {
            total += num; 
            } 
        }


        System.out.println("Sum of Odd values: " + total);
}
}

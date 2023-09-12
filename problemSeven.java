import java.util.Scanner;

//count the no of positive no and print it's average

public class problemSeven {
    public static void main(String[] args)
    {
        int total = 0 ;
        int positiveNo = 0;

       Scanner input = new Scanner(System.in);
       
       int[] noArray = new int[5];

        for(int i = 0 ; i < noArray.length ; i++)
        {
            System.out.print("Input the next number: ");
            noArray[i] = input.nextInt();
        }

        for(int num : noArray)
        {
            if(num >= 0)
            {
            total += num; 
            positiveNo++; 
            } 
        }

        float average = total / positiveNo;

        System.out.println("Number of positive numbers: " + positiveNo);
        System.out.println("Average value of the said positive numbers: " + average);
        
}
}

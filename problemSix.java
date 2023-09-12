import java.util.Scanner;

// count the number of positive and negative number

public class problemSix {
    public static void main(String[] args)
    {
        int positiveNo = 0;
        int negativeNo = 0;

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
                positiveNo++;
            else
                negativeNo++;
        }

        System.out.println("Number of positive numbers: " + positiveNo);
        System.out.println("Number of negative numbers: " + negativeNo);
        
}
}
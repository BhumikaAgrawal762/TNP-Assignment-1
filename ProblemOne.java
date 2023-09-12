import java.util.Scanner;

 // Program to convert a given integer to hours , minutes and seconds

public class ProblemOne {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int second = input.nextInt();
        int hour;
        int minutes;
        int sec;

        hour = second/3600; 
	
	    minutes = (second -(3600*hour))/60;
	
	    sec = second -(3600*hour)-(minutes*60);

        System.out.println("H:M:S - " + hour + ":" + minutes + ":"+ sec);
    }
}

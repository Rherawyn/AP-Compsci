import java.util.Scanner;

public class Convert_Time {

    
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds");
        
        Scanner in = new Scanner(System.in);
        
        int S = in.nextInt();    
        int h = (int) S/3600;
        int m = (int) S%3600/60;
        int s = (int) S%3600%60;
        
        System.out.printf("%,d seconds = %,d hours, %d minutes, and %d seconds.", S, h, m, s);
    }
}
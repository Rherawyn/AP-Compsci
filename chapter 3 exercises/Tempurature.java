import java.util.Scanner;

public class Tempurature {

    
    public static void main(String[] args) {
        System.out.println("Enter a tempurature in Celsius");
        
        Scanner in = new Scanner(System.in);
        
        double C = in.nextDouble();
        
        double F = C * (9.0/5.0) + 32;
        
        System.out.printf("%.1f = %.1f F", C , F);
    }
}
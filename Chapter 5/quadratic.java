import java.util.Scanner;

class quadratic {
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input for a");
        double a = in.nextDouble();
        System.out.println(" = " + a);
        System.out.print("Input for b");
        double b = in.nextDouble();
        System.out.println(" = " + b);
        System.out.print("Input for c");
        double c = in.nextDouble();
        System.out.println(" = " + c);
        
        double x = ((0-b) + (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        
        System.out.print("x = " + x);
    }
}
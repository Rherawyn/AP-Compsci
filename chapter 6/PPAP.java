import java.util.Scanner;

public class PPAP {
    
    public static void main (String args[]) {
        System.out.print(ppap("I have a pen, I have a apple"));
        
    }
    
    public static String ppap(String str) {
        String A = "";
        String B = "";
        for(int i = 0; i < 50 ; i++) {
            if(str. substring(i,i+11).equals(", I have a ")) {
                B = str.substring(i+ 11, i + 12).toUpperCase() + str.substring(i+12);
                A = str.substring(9, i);
                break;
            }
            
        }
        return("Uh! " + B + " " + A);
    }
}
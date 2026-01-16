import java.util.Scanner;

public class FractionQuiz {
    
    public static boolean playing = true;
    public static int wins = 0;
    public static int games = 0;
    public static int round = 0;
    
    public static void main(String[] args) {
        int num1 = 1;
        int den1 = 1;
        int num2 = 1;
        int den2 = 1;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck! \n");
        
        while(true) {
            randomize(num1, 0);
            randomize(den1, 0);
            randomize(num2, 0);
            randomize(den2, 0);
            randomize(round, 4);
            Fraction f1 = new Fraction(num1,den1);
            Fraction f2 = new Fraction(num2,den2);
            
            questionType(f1, f2);
            
            System.out.print(f1 + " round " + f2 + " =");
            
            String answer = in.nextLine();
            if(answer == "quit") {
                break;
            }
            String answers[] = answer.split("/");
            int n = Integer.parseInt(answers[0]);
            int d = Integer.parseInt(answers[1]);
            Fraction finalAnswer = new Fraction(n,d);
            
            System.out.println(n + " / " + d);
            
            if(finalAnswer == returnAnswer(num1,den1,num2,den2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong, the answer was " + returnAnswer(num1,den1,num2,den2));
            }
            
            
        }
    }
    
    public static int randomize(int input, int max) {
        return(int)((Math.random()*10) % max);
    }
    
    public static void questionType(Fraction f1, Fraction f2) {
        if(round == 1) {
            System.out.print(f1 + " + " + f2 + "= ");
        } else if(round == 2) {
            System.out.print(f1 + " - " + f2 + "= ");
        } else if(round == 2) {
            System.out.print(f1 + " * " + f2 + "= ");
        } else if(round == 3) {
            System.out.print(f1 + " / " + f2 + "= ");
        }
    }
    
    public static Fraction returnAnswer(int num1,int den1,int num2,int den2) {
        if(round == 1) {
            return new Fraction(((num1 * den2) + (num2 * den1)),(den1 * den2));
        } else if(round == 2) {
            return new Fraction(((num1 * den2) - (num2 * den1)),(den1 * den2));
        } else if(round == 2) {
            return new Fraction((num1 * num2), (den1 * den2));
        } else if(round == 3) {
            return new Fraction((num1 * den2), (den1 * num2));
        }
        return new Fraction(0,0);
    }
}







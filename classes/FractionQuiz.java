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
            num1 = randomize(10);
            den1 = randomize(10);
            num2 = randomize(10);
            den2 = randomize(10);
            Fraction f1 = new Fraction(num1,den1);
            Fraction f2 = new Fraction(num2,den2);
            round = randomize(4);
            
            questionType(f1, f2);
            
            String answer = in.nextLine();
            if(answer.contains("quit")) {
                Fraction score = new Fraction(wins,games);
                System.out.println("");
                System.out.println("Your won " + score + " games, for a score of " + (int)(score.toDecimal()*100) + " percent!");
                break;
            }
            String answers[] = answer.split("/");
            int n = Integer.parseInt(answers[0]);
            int d = Integer.parseInt(answers[1]);
            Fraction finalAnswer = new Fraction(n,d);
            finalAnswer.reduce();
            
            System.out.println(n + "/" + d);
            
            if(returnAnswer(num1,den1,num2,den2).getNum() == finalAnswer.getNum() && returnAnswer(num1,den1,num2,den2).getDenom() == finalAnswer.getDenom()) {
                System.out.println("Correct!");
                wins++;
            } else {
                System.out.println("Wrong, the answer was " + returnAnswer(num1,den1,num2,den2));
            }
            games++;
            
            
        }
    }
    
    public static int randomize(int max) {
        return(int)((Math.random()*max) + 1);
    }
    
    public static void questionType(Fraction f1, Fraction f2) {
        if(round == 1) {
            System.out.print(f1 + " + " + f2 + "= ");
        } else if(round == 2) {
            System.out.print(f1 + " - " + f2 + "= ");
        } else if(round == 3) {
            System.out.print(f1 + " * " + f2 + "= ");
        } else if(round == 4) {
            System.out.print(f1 + " / " + f2 + "= ");
        }
    }
    
    public static Fraction returnAnswer(int num1,int den1,int num2,int den2) {
        if(round == 1) {
            Fraction tempAns = new Fraction(((num1 * den2) + (num2 * den1)),(den1 * den2));
            tempAns.reduce();
            return tempAns;
        } else if(round == 2) {
            Fraction tempAns = new Fraction(((num1 * den2) - (num2 * den1)),(den1 * den2));
            tempAns.reduce();
            return tempAns;
        } else if(round == 4) {
            Fraction tempAns = new Fraction((num1 * num2), (den1 * den2));
            tempAns.reduce();
            return tempAns;
        } else if(round == 5) {
            Fraction tempAns = new Fraction((num1 * den2), (den1 * num2));
            tempAns.reduce();
            return tempAns;
        }
        return new Fraction(0,0);
    }
}







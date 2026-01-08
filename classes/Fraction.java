

public class Fraction {
    
    //instance variables
    private int numerator;
    private int denomator;
    
    //constructore(s)
    public Fraction() {
        this.numerator = 0;
        this.denomator = 1;
    }
    
    public Fraction(int num, int den) {
        numerator = num;
        if (den != 0) {
            denomator = den;
        } else {
            this.denomator = 1;
            System.out.println("EROROR: DENOMOMATOR CANT BE 000000 IDITI >:((((((((");
        }
    }
    
    public Fraction(String str) {
        String[] numbers = str.split("/");
        int n = Integer.parseInt(numbers[0]);
        int d = Integer.parseInt(numbers[1]);
        this.numerator = n;
        if (d != 0) {
            denomator = d;
        } else {
            this.denomator = 1;
            System.out.println("EROROR: DENOMOMATOR CANT BE 000000 IDITI >:((((((((");
        }
    }
    
    public Fraction (Fraction f) {
        this.numerator = f.numerator;
        this.denomator = f.denomator;
    }
    
    //behaviour
    
    public String toString() {
        return numerator + "/" + denomator;
    }
    
    public int getNum() {
        return numerator;
    }
    
    public int getDenom() {
        return denomator;
    }
    
    public double toDecimal() {
        return (double) numerator/denomator;
    }
    
    //mutator methods
    
    public void reduce() {
        
    }
    
    public void setNum(int num) {
        numerator = num;
    }
    
    public void setDenom(int num) {
        denomator = num;
    }
    
}
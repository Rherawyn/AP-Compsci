

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
    
    public Fraction findPrime(Fraction f) {
        return f;
    }
    
    public int REDUCE(int l, int s) {
        if(l == s) {
            return l;
        } else {
            if (l > s) {
                l =- s;
                return REDUCE(l,s);
            } else if (s > l) {
                s =- l;
                return REDUCE(l,s);
            }
        }
        return 0;
    }
    
    public void reduce() {
        int gcf = GCF(getNum(), getDenom());
        setNum(getNum()/gcf);
        setDenom(getDenom()/gcf);
    }
    
    private static int GCF(int a, int b) {
        if(a == b) return a;
        int c = Math.max(a,b);
        c = c - Math.min(a,b);
        
        return GCF(c,Math.min(a,b));
    }
    
    public void setNum(int num) {
        numerator = num;
    }
    
    public void setDenom(int num) {
        denomator = num;
    }
    
    //class methods
    public static Fraction multiply (Fraction a, Fraction b) {
        if(b.numerator == 0) {
            System.out.println("die");
            return null;
        }
        
        int newNum = a.getNum() * b.getDenom();
        int newDen = a.getDenom() * b.getNum();
        Fraction c = new Fraction(newNum, newDen);
        c.reduce();
        return c;
    }
    
    public static Fraction add (Fraction a, Fraction b) {
        int newNum = (a.getNum() * b.getDenom()) + (b.getNum() * a.getDenom());
        int newDen =  a.getDenom() * b.getDenom();
        Fraction c = new Fraction(newNum, newDen);
        c.reduce();
        return c;
    }
    
    public static Fraction subtract (Fraction a, Fraction b) {
        int newNum = (a.getNum() * b.getDenom()) - (b.getNum() * a.getDenom());
        int newDen =  a.getDenom() * b.getDenom();
        Fraction c = new Fraction(newNum, newDen);
        c.reduce();
        return c;
    }
    
}
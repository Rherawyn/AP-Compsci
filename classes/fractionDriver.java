public class fractionDriver {
    
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction(6,8);
        Fraction c = new Fraction("6/7");
        Fraction d = new Fraction(c);
        Fraction MILU = new Fraction(355,113);
        
        
        b.reduce();
        
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        System.out.println("b as a decimal is " + b.toDecimal());
    }
}
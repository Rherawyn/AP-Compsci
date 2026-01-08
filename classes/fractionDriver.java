public class fractionDriver {
    
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction(1,2);
        Fraction c = new Fraction("6/7");
        Fraction d = new Fraction(c);
    
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        System.out.println("b as a decimal is " + b.toDecimal());
    }
}
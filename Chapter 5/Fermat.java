class Fermat {
 
    public static void main(String[] args) {
        int a = (int) (Math.random() * 2);
        int b = (int) (Math.random() * 2);
        int c = (int) (Math.random() * 2);
        int n = (int) (Math.random() * 2);
        
        System.out.println("a = " + a + ", b = " + b + 
        ", c = " + c + ", and n = " + n + ", so");
        System.out.println("a^n + b^n sould equal c^n");
        System.out.println("Let's see");
        System.out.println(Math.pow(a,n) + " + " + Math.pow(b,n)
        + " = " + (Math.pow(a,n) + Math.pow(b,n)));
        if(Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n) && n > 2) {
            System.out.print("wowzers, big dum dum fermet");
        } else {
            System.out.print("whoopsie, big idiot time");
        }
    }
    
}
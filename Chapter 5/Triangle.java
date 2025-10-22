

class Triangle {
    
    public static void main(String[] args) {
        double a = Math.random()*10;
        double b = Math.random()*10;
        double c = Math.random()*10;
        
        System.out.println("a is " + a + ", b is " + b + ", and c is " + c);
        
        if(canForm(a,b,c)){
            System.out.print("yay, we can form a triangle");
        } else {
            System.out.print("oh darnies, no trangle today :(((((");
        }
    }
    
    public static boolean canForm(double x, double y, double z) {
        if(x+y <= z){
            return true;
        } else if (x+z <= y) {
            return true;
        } else if (y+z <= x) {
            return true;
        } else {
            return false;
        }
    }
}
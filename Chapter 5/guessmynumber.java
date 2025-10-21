import java.util.Scanner;

class guessmynumber {
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num = (int) (Math.random()*101);
        System.out.println("Guess my nubers numy");
        int ans = in.nextInt();
        if(ans - num > 0) {
            System.out.println("Too Hight!!!!!!!!!");
        } else if(ans - num < 0) {
            System.out.println("Too Lowswswoowowa!!!!!!!!!");
        }else if(ans - num == 0) {
            System.out.println("Yipeee");
        }
        System.out.print("It was " + num);
    }
}
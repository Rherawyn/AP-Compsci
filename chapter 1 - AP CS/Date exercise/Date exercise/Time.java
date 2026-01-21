public class Time {
    public static void main(String[] args) {
        int second = 5;
        int minute = 40;
        int hour = 14;
        
        System.out.println("The current number of seconds since midnight is: " + (hour*60*60 + minute*60 + second));
    }
}
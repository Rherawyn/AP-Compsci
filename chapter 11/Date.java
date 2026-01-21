

public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date() {
        year = 2008;
        month = 06;
        day = 25;
    }
    
    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    
    public static void main(String[] args) {
        Date birthday = new Date();
        Date birthday2 = new Date(2008,06,25);
        System.out.println(birthday);
        System.out.println(birthday2);
        
    }
    
    public String toString() {
        return "My birthday is: " + day + ", " + month + ", " + year + ".";
    }
    
}
public class printDate{
    public static void main(String[] args) {
        printAmerican("Tuesday", "Septempber", 16, 2025);
        printEuropean("Tuesday", "Septempber", 16, 2025);
    }

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);    
    }
    
    public static void printEuropean(String day, String month, int date, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);    
    }

}
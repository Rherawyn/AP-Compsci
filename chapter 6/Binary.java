

class Binary {
    
    public static void main (String[] args) {
        int number = 6;
        System.out.print(convertToBinary(number));
        
    }
    
    public static String convertToBinary (int num) {
        String newnum = "";
        String idiot = "";
        for(int i = 0; num != 0; i++) {
            newnum += String.valueOf(num%2);
            num /= 2;
        }
        
        for(int i = 0; i < newnum.length(); i++) {
            idiot += newnum.substring(newnum.length()-1-i,newnum.length()-i);
        }
        
        return idiot;
    }
}
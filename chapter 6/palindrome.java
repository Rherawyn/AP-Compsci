class palindrome {
    
    public static void main(String[] args) {
        String input = "Amy, must I jujitsu my ma?";
        System.out.println("Is " + input + " a palindrome?");
        if(isPalindrome(input)) {
            System.out.println("yipee, its a palindrom!");
        } else {
            System.out.println("Zang, its not a palindrome :((((");
        }
    }
    
    public static boolean isPalindrome(String str) {
        String nonLetters = ",.:;()[]{}!@#$%^&* ?";
        String pal = "";
        
        for(int i = str.length(); i > 0; i--) {
            if (nonLetters.contains(str.substring(i-1,i))) {
            } else {
                pal += str.substring(i-1,i).toLowerCase();
            }
        }
        str = "";
        for(int i = pal.length(); i > 0; i--) {
                str += pal.substring(i-1,i);
        }
        if(pal.equals(str.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
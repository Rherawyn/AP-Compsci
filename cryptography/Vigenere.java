class Vigenere {
    
    public static void main (String[] args) {
        System.out.println(encode("ATTACK AT DAWN", "lemon"));
        System.out.println(decode(encode("ATTACK AT DAWN", "lemon"), "lemon"));
    }
    
    public static String encode(String plainText, String keyword) {
       String output = "";
       int nonLs = 0;
       for(int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
            char originalChar = plainText.charAt(i);
            
            int key = (int) Character.toLowerCase(keyword.charAt((i-nonLs)%keyword.length()))-97;
            
            char newChar = (char) ( ( (originalChar - 65) + key) % 26 + 65);
            output += newChar;
            } else {
                output += plainText.charAt(i);
                nonLs++;
            }
        }
        return output;
    }
    
    public static String decode(String cipherText, String keyword) {
        String output = "";
       for(int i = 0; i < cipherText.length(); i++) {
            if (Character.isLetter(cipherText.charAt(i))) {
            char originalChar = cipherText.charAt(i);
            
            int key = (int) Character.toLowerCase(keyword.charAt(i%keyword.length()))-97;
            
            char newChar = (char) ( ( (originalChar - 65) + 26- key) % 26 + 65);
            output += newChar;
            } else {
                output += cipherText.charAt(i);
            }
        }
        return output;
    }
    
}
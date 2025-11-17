class ceaser {
    
    public static void main (String[] args) {
        System.out.println(encode("OH MY GOD WE AR ALL GONNA DIE TOWN!!!!!?!?!?!??!K", 2));
    }
    
    public static String encode(String plainText, int key) {
        String output = "";
        
        for(int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
            char originalChar = plainText.charAt(i);
            char newChar = (char) ( ( (originalChar - 65) + key) % 26 + 65);
            output += newChar;
            } else {
                output += plainText.charAt(i);
            }
        }

        return output;
    }
    
    public static String decode(String cipherText, int key) {
        
        return "g";
    }
}
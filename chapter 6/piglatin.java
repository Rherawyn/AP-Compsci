

class piglatin {
    
    public static void main (String[] args) {
        String input = "I love starcraft";
        System.out.print(pigLatin(input));
    }
    
    public static String pigLatin (String msg) {
            String answer = "";
            String[] splited = msg.split(" ");
            for(String n : splited) {
                if(n.length() > 2) {
                    answer += n.substring(1) + n.substring(0,1) + "ay ";
                } else {
                    answer += n + " ";
                }
            }
            return answer;
    }
}
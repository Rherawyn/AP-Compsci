
public class Tile {
    private char letter;
    private int value;
    
    public  Tile(char l, int v) {
        letter = l;
        value = v;
    }
    
    public static void main(String[] args) {
        Tile tile = new Tile('z', 10);
        printTile(tile);
    }
    
    public static void printTile(Tile t) {
        System.out.println(t);
    }
    
    public String toString() {
        return "Tile: " + letter + ", worth: " + value + " pts.";
    }
    
    public char getLetter() {
        return letter;
    }
    
    public void setLetter(char l) {
        letter = l;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int v) {
        value = v;
    }
    
    
    
    
    
}
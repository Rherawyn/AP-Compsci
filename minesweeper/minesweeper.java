import java.util.Scanner;

class minesweeper {
    static int[][] mineField;
    static boolean[][] revealed;
    
    final static int BOMB = 1;
    final static int EMPTY = 0;
    final static int EASY = 10;
    final static int MED = 20;
    final static int HARD = 40;
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int difficulty = in.nextInt();
        mineField = new int[difficulty][difficulty];
        revealed = new boolean [difficulty][difficulty];
        answerKey(difficulty);
        for(int r = 0; r < mineField.length; r++) {
            for(int c = 0; c < mineField[0].length; c++) {
                System.out.print(mineField[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int r = 0; r < revealed.length; r++) {
            for(int c = 0; c < revealed[0].length; c++) {
                revealed[r][c] = false;
                System.out.print("? ");
            }
            System.out.println();
        }
        
        board();
    }
    
    public static void board() {
        int i = 0;
        int x = 0;
        int y = 0;
        Scanner in = new Scanner(System.in);
        while(i == 0) {
        String input = in.nextLine();
        System.out.println("\f");
        }
    }
    
    public static void answerKey(int difficulty) {
        int x = 0;
        int y = 0;
        
        for(int r = 0; r < mineField.length; r++) {
            for(int c = 0; c < mineField[0].length; c++) {
                mineField[r][c] = 0;
            }
        }
        
        for(int i = 0; i < (int) (difficulty*difficulty*0.30); i++) {
            x = (int) (Math.random() * difficulty);
            y = (int) (Math.random() * difficulty);
            while(mineField[x][y] == BOMB) {
                x = (int) (Math.random() * difficulty);
                y = (int) (Math.random() * difficulty);
            }
            mineField[x][y] = BOMB;
        }
    }
}
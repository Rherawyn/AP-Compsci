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
        int input = in.nextInt();
        System.out.println("\f");
        y = input%10 -1;
        x = (int) input/10 -1;
        while(revealed[y][x] == true) {
            System.out.println("bad input");
            input = in.nextInt();
            y = input%10 - 1;
            x = (int) input/10 - 1;
        }
        if(mineField[x][y] == 1) {
            System.out.print("\f");
            System.out.print("YOU LOSE");
        } else {
            sploosh(x,y);
        }
            
        int value = 0;
        for(int r = 0; r < revealed.length; r++) {
            for(int c = 0; c < revealed[0].length; c++) {
                if(revealed[r][c] == true) {
                    if(mineField[r][c] == 0) {
                        for(int r2 = r-1; r2 < r+2; r2++) {
                            for(int c2 = c-1; c2 < c+2; c2++) {
                                value += mineField[r2][c2];
                            }
                        }
                        System.out.print(value + " ");
                    } else {
                        System.out.print("B ");
                    }
                } else {
                    System.out.print("? ");
                }
            }
            System.out.println();
        }
    }
    
    //for AOE clears
    public static void sploosh (int r, int c) {
        if(r < mineField.length && r > 0 && c < mineField[0].length && c > 0 && mineField[r][c] == 0) {
            revealed[r][c] = true;
            sploosh(r, c-1);
            sploosh(r, c+1);
            sploosh(r-1, c);
            sploosh(r+1, c);
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
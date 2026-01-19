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
        String input = in.nextLine();
        System.out.println("\f");
        String[] inputs = input.split(",");
        x = Integer.parseInt(inputs[0])-1;
        y = Integer.parseInt(inputs[1])-1;
        while(revealed[y][x] == true) {
            input = in.nextLine();
            System.out.println("\f");
            inputs = input.split(",");
            x = Integer.parseInt(inputs[0])-1;
            y = Integer.parseInt(inputs[1])-1;
        }
            
        if(mineField[x][y] == BOMB) {
            System.out.print("\f");
            System.out.print("YOU LOSE");
        } else {
            if(countSurrounding(x,y) != 0) {
                revealed[x][y] = true;
            } else sploosh(x,y);
        }
        
        int value = 0;
        for(int r = 0; r < revealed.length; r++) {
            for(int c = 0; c < revealed[0].length; c++) {
                if(revealed[r][c] == true) {
                    if(mineField[r][c] == 0) {
                        for(int r2 = x-1; r2 < x+1; r2++) {
                            for(int c2 = y-1; c2 < y+1; c2++) {
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
        if(r < mineField.length && r > 0 && c < mineField[0].length && c > 0 && mineField[r][c] == 0 && !revealed[r][c]) {
            revealed[r][c] = true;
            if (countSurrounding(r, c-1) == 0) sploosh(r, c-1);
            if (countSurrounding(r, c+1) == 0) sploosh(r, c+1);
            if (countSurrounding(r-1, c) == 0) sploosh(r-1, c);
            if (countSurrounding(r+1, c) == 0) sploosh(r+1, c);
        }
    }
    
    public static int countSurrounding(int x, int y) {
        int value = 0;
        for(int r2 = x-1; r2 < x+1; r2++) {
                for(int c2 = y-1; c2 < y+1; c2++) {
                value += mineField[r2][c2];
            }
        }
        return value;
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
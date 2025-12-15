class minesweeper {
    static int[][] mineField;
    static boolean[][] revealed;
    
    final static int BOMB = 1;
    final static int EMPTY = 0;
    final static int EASY = 10;
    final static int MED = 20;
    final static int HARD = 40;
    
    
    public static void main(String[] args) {
        mineField = new int[10][10];
        revealed = new boolean [10][10];
        answerKey(EASY);
        for(int r = 0; r < mineField.length; r++) {
            for(int c = 0; c < mineField[0].length; c++) {
                System.out.print(mineField[r][c] + " ");
            }
            System.out.println();
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
        
        for(int i = 0; i < difficulty; i++) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            while(mineField[x][y] == BOMB) {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
            }
            mineField[x][y] = BOMB;
        }
    }
}
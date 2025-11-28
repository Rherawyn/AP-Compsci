import java.util.Scanner;

public class tictactoe {
    
    public static void main (String[] args) {
        boolean player = true;
        boolean win = false;
        int x = 0;
        int y = 0;
        
        Scanner in = new Scanner(System.in);
        char board[][] = new char[3][3];
        for(int row = 0; row < board.length; row ++) {
            for(int col = 0; col < board[0].length; col ++) {
                board[row][col] = ' ';
            }
        }
        
        while(win == false) {
            grid(board);
            if(player) {
            System.out.println("X's turn, input coords \"x,y\"");
            } else {
            System.out.println("O's turn, input coords");
            }
            
            String input =in.nextLine();
            while(input.length() != 3 || input.charAt(1) != ',' || !Character.isDigit(0) || Character.isDigit(2)) {
                System.out.println("invalid input! try again idot");
                input =in.nextLine();
            }
            
            x = Integer.parseInt(input.substring(2)) -1;
            y = Integer.parseInt(input.substring(0,1)) -1;
            while(x > 2 || x < 0 || y > 2 || y < 0 || board[x][y] != ' ') {
                System.out.println("invalid move! try again idot");
                input =in.nextLine();
                x = Integer.parseInt(input.substring(2))-1;
                y = Integer.parseInt(input.substring(0,1))-1;
            } 
            
            if(player) {
                    board[x][y] = 'X';
                    player = !player;
                } else {
                    board[x][y] = 'O';
                    player = !player;
                }
        }
    }
    
    public static void grid(char[][] grid) {
        System.out.print("\f");
        for(int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print("[" + grid[row][col] + "]");
            }
            System.out.println();
        }
    }

}
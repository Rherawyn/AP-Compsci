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
            while(input.length() != 3 || input.charAt(1) != ',' || !Character.isDigit(input.charAt(0)) || !Character.isDigit(input.charAt(2))) {
                System.out.println("invalid input! try again idot");
                input =in.nextLine();
            }
            
            x = Integer.parseInt(input.substring(2)) -1;
            y = Integer.parseInt(input.substring(0,1)) -1;
            while(x > 2 || x < 0 || y > 2 || y < 0 || board[x][y] != ' ') {
                System.out.println("invalid move! try again idot");
                input =in.nextLine();
                while(input.length() != 3 || input.charAt(1) != ',' || !Character.isDigit(input.charAt(0)) || !Character.isDigit(input.charAt(2))) {
                    System.out.println("invalid input! try again idot");
                    input =in.nextLine();
                }   
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
            win = winner(board);
            if(win == true) {
                grid(board);
                if(player) {
                    System.out.println("O won!");
                } else {
                    System.out.println("X won!");
                }
            }
        }
    }
    
    public static boolean winner(char[][] grid) {
        for(int c = 0; c < 3; c++) {
             if(grid[0][c] != ' ' && grid[0][c] == grid[1][c] && grid[1][c] == grid[2][c]) {
                    return true;
             }
        }
        
        for(int r = 0; r < 3; r++) {
             if(grid[r][0] != ' ' && grid[r][0] == grid[r][1] && grid[r][1] == grid[r][2]) {
                    return true;
             }
        }
        
        if(grid[1][1] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        } else if (grid[1][1] != ' ' && grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]) {
            return true;
        }
        return false;
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
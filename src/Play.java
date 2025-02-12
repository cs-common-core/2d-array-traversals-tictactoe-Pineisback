import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        while(!game.isGameOver()) {
            game.printBoard();
           System.out.println("Turn for:" +game.getCurrentPlayer());
           int row=scanner.nextInt();
           int col= scanner.nextInt();
           game.play(row,col);

        }
        int winner=game.getWinner();
        if(winner!=0){
            System.out.println("Win! for player:" +winner);
        }else{
            System.out.println("draw");
        }
        scanner.close();
    }
}

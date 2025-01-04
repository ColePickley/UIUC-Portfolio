import java.util.Scanner;

public class Run
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String game = "";
        boolean gameChosen = false;
        TicTacToe ticTacToe = new TicTacToe();
        Cooperation cooperation = new Cooperation();
        
        System.out.print('\u000C');
        System.out.println("Choose a game!!!");
        System.out.println("Enter the number of the game you wish to choose:");
        System.out.println("1. Ultimate TicTacToe");
        System.out.println("2. Cooperation");
        while(gameChosen == false)
        {
            game = in.next();
            if(game.equals("1"))
            {
                gameChosen = true;
                ticTacToe.run();
            }
            else if(game.equals("2"))
            {
                gameChosen = true;
                cooperation.run();
            }
            else
            {
                System.out.print('\u000C');
                System.out.println("Input invalid!");
                System.out.println("Enter the number of the game you wish to choose:");
                System.out.println("1. Ultimate TicTacToe");
                System.out.println("2. Cooperation");
            }
        }
    }
}

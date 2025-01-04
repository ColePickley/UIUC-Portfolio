import java.util.Scanner;

public class Cooperation
{
    Scanner in = new Scanner(System.in);
    boolean gamemodeChosen = false;
    boolean numRoundsChosen = false;
    String numRounds = "";
    String gamemode = "";
    String player1 = "";
    String player2 = "";
    boolean isRandom;
    CoSinglePlayer single = new CoSinglePlayer();
    CoMultiPlayer multi = new CoMultiPlayer();
    
    public Cooperation()
    {
        
    }
    
    public void run()
    {
        this.chooseGameMode();
        this.chooseNumRounds();
        if (gamemode.equals("s"))
        {
            single.play(player1, player2);
        }
        else
        {
            multi.play(player1, player2);
        }
    }
    
    private void chooseGameMode()
    {
        System.out.print('\u000C');
        System.out.println("Single-Player or Multi-Player (s/m)");
        gamemode = in.next();
        while(gamemodeChosen == false)
        {
            if(gamemode.equals("s"))
            {
                System.out.print('\u000C');
                System.out.println("Sinlge-Player");
                System.out.println("Input your name:");
                player1 = in.next();
                player2 = "Evil Cooperation Bot";
                gamemodeChosen = true;
            }
            else if(gamemode.equals("m"))
            {
                System.out.print('\u000C');
                System.out.println("Multi-Player");
                System.out.println("Player 1, input your name:");
                player1 = in.next();
                System.out.print('\u000C');
                System.out.println("Multi-Player");
                System.out.println("Player 2, input your name:");
                player2 = in.next();
                gamemodeChosen = true;
            }
            else
            {
                System.out.print('\u000C');
                System.out.println("Single-Player or Multi-Player (s/m)");
                System.out.println("Invalid input!");
                gamemode = in.next();
            }
        }
    }
    
    private void chooseNumRounds()
    {
        System.out.print('\u000C');
        System.out.println("Select the number of rounds:");
        System.out.println("1. 10");
        System.out.println("2. 15");
        System.out.println("3. 20");
        System.out.println("4. Random");
        numRounds = in.next();
        while (numRoundsChosen == false)
        {
            if (numRounds.equals("1"))
            {
                System.out.print('\u000C');
                System.out.println("50");
                numRoundsChosen = true;
                single.numberOfRounds(numRounds);
                multi.numberOfRounds(numRounds);
            }
            else if (numRounds.equals("2"))
            {
                System.out.print('\u000C');
                System.out.println("100");
                numRoundsChosen = true;
                single.numberOfRounds(numRounds);
                multi.numberOfRounds(numRounds);
            }
            else if (numRounds.equals("3"))
            {
                System.out.print('\u000C');
                System.out.println("200");
                numRoundsChosen = true;
                single.numberOfRounds(numRounds);
                multi.numberOfRounds(numRounds);
            }
            else if (numRounds.equals("4"))
            {
                System.out.print('\u000C');
                System.out.println("Random");
                numRoundsChosen = true;
                single.numberOfRounds(numRounds);
                multi.numberOfRounds(numRounds);
            }
            else
            {
                System.out.print('\u000C');
                System.out.println("Select the number of rounds:");
                System.out.println("1. 10");
                System.out.println("2. 15");
                System.out.println("3. 20");
                System.out.println("4. Random");
                System.out.println("Invalid input!");
                numRounds = in.next();
            }
        }
    }
}

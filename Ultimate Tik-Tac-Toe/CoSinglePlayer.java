import java.util.Random;
import java.util.Scanner;

public class CoSinglePlayer
{
    private int numRounds;
    private Random random = new Random();
    private String modelType = "";
    private String previousMove;
    private String move = "";
    private int numRoundsLeft;
    private boolean isRandom;
    private boolean isFirstMove = true;
    private Scanner in = new Scanner(System.in);
    private CoBoard board = new CoBoard();
    private CoBot bot = new CoBot();
    
    public CoSinglePlayer()
    {
        
    }
    
    public void play(String player1, String player2)
    {
        while (numRoundsLeft > 0)
        {
            board.printBoard(numRoundsLeft);
            board.storeRound(this.move(1, player1, player2), this.move(2, player1, player2));
            isFirstMove = false;
            numRoundsLeft--;
            System.out.print('\u000C');
        }
        if (board.getP1Score() > board.getP2Score())
        {
            System.out.println(player1 + " Wins!");
        }
        else if (board.getP1Score() < board.getP2Score())
        {
            System.out.println(player2 + " Wins!");
        }
        else
        {
            System.out.println("Tie!");
        }
        System.out.println("Final Score " + player1 + ": " + board.getP1Score());
        System.out.println("Final Score " + player2 + ": " + board.getP2Score());
    }
    
    public boolean move(int player, String player1, String player2)
    {
        System.out.print('\u000C');
        board.printBoard(numRoundsLeft);
        boolean moveMade = false;
        if (player == 1)
        {
            System.out.println(player1 + ", cooperate or defect (c/d):");
            move = in.next();
            previousMove = move;
        }
        else
        {
            move = bot.move(previousMove);
        }
        while (moveMade == false)
        {
            if (!move.equals("c") && !move.equals("d"))
            {
                System.out.print('\u000C');
                board.printBoard(numRoundsLeft);
                System.out.println(player1 + ", cooperate or defect (c/d):");
                System.out.println("Invalid Input!");
                move = in.next();
            }
            else
            {
                moveMade = true;
            }
        }
        return this.isCooperate(move);
    }
    
    public boolean isCooperate(String input)
    {
        if (input.equals("c"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void numberOfRounds(String choiceNum)
    {
        if (choiceNum.equals("1"))
        {
            numRounds = 10;
        }
        else if (choiceNum.equals("2"))
        {
            numRounds = 15;
        }
        else if (choiceNum.equals("3"))
        {
            numRounds = 20;
        }
        else if (choiceNum.equals("4"))
        {
            numRounds = random.nextInt(26) + 10;
        }
        board.setIsRandom(isRandom);
        board.setNumRounds(numRounds);
        numRoundsLeft = numRounds;
    }
}

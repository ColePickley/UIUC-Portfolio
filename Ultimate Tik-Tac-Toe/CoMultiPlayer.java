import java.util.Random;
import java.util.Scanner;

public class CoMultiPlayer
{
    private int numRounds;
    private int numRoundsLeft;
    private boolean isRandom;
    private Random random = new Random();
    private Scanner in = new Scanner(System.in);
    private CoBoard board = new CoBoard();
    
    public CoMultiPlayer()
    {
        
    }
    
    public void play(String player1, String player2)
    {
        while (numRoundsLeft > 0)
        {
            board.printBoard(numRoundsLeft);
            board.storeRound(this.move(1, player1, player2), this.move(2, player1, player2));
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
        String message = "";
        boolean moveMade = false;
        if (player == 1)
        {
            message = player1 + ", cooperate or defect (c/d):";
        }
        else
        {
            message = player2 + ", cooperate or defect (c/d):";
        }
        System.out.println(message);
        String move = in.next();
        while (moveMade == false)
        {
            if (!move.equals("c") && !move.equals("d"))
            {
                System.out.print('\u000C');
                board.printBoard(numRoundsLeft);
                System.out.println(message);
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
            isRandom = false;
        }
        else if (choiceNum.equals("2"))
        {
            numRounds = 15;
            isRandom = false;
        }
        else if (choiceNum.equals("3"))
        {
            numRounds = 20;
            isRandom = false;
        }
        else if (choiceNum.equals("4"))
        {
            numRounds = random.nextInt(19) + 10;
            isRandom = true;
        }
        board.setIsRandom(isRandom);
        board.setNumRounds(numRounds);
        numRoundsLeft = numRounds;
    }
}

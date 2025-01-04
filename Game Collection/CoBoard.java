import java.util.ArrayList;

public class CoBoard
{
    private ArrayList<Boolean> p1Rounds = new ArrayList();
    private ArrayList<Boolean> p2Rounds = new ArrayList();
    private int p1Score = 0;
    private int p2Score = 0;
    private int numRounds;
    private boolean isRandom;
    
    public CoBoard()
    {

    }
    
    public void printBoard(int numRoundsLeft)
    {
        System.out.print('\u000C');
        System.out.println("Player 1 Score: " + p1Score + " | Player 2 Score: " + p2Score);
        if (isRandom == false)
        {
            System.out.println("Number of rounds: " + numRoundsLeft + "/" + numRounds);
        }
        else
        {
            System.out.println("Number of rounds: random");
        }
        System.out.println();
        System.out.print("Player 1 |");
        for (int i = 0; i < p1Rounds.size(); i++)
        {
            System.out.print(this.getGraphic(p1Rounds.get(i)) + "|");
        }
        System.out.println();
        System.out.print("Player 2 |");
        for (int i = 0; i < p2Rounds.size(); i++)
        {
            System.out.print(this.getGraphic(p2Rounds.get(i)) + "|");
        }
        System.out.println();
        System.out.println();
    }
    
    public void setNumRounds(int numRounds)
    {
        this.numRounds = numRounds;
    }
    
    public void setIsRandom(boolean isRandom)
    {
        this.isRandom = isRandom;
    }
    
    public void storeRound(boolean p1Move, boolean p2Move)
    {
        p1Rounds.add(p1Move);
        p2Rounds.add(p2Move);
        this.addPoints(p1Move, p2Move);
    }
    
    public int getP1Score()
    {
        return p1Score;
    }
    
    public int getP2Score()
    {
        return p2Score;
    }
    
    public void addPoints(boolean p1Move, boolean p2Move)
    {
        if (p1Move == true && p2Move == true)
        {
            p1Score = p1Score + 3;
            p2Score = p2Score + 3;
        }
        else if (p1Move == false && p2Move == true)
        {
            p1Score = p1Score + 5;
        }
        else if (p1Move == true && p2Move == false)
        {
            p2Score = p2Score + 5;
        }
        else
        {
            p1Score++;
            p2Score++;
        }
    }
    
    public String getGraphic(boolean input)
    {
        if (input == true)
        {
            return "+";
        }
        else
        {
            return "-";
        }
    }
}

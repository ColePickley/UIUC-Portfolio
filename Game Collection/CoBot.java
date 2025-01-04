import java.util.Random;
import java.util.ArrayList;

public class CoBot
{
    private int botType;
    private Random random = new Random();
    private int i = 10;
    private ArrayList<String> roundStorage = new ArrayList();
    
    public CoBot()
    {
        
    }
    
    public String move(String previousMove)
    {
        roundStorage.add(previousMove);
        if (i == 10)
        {
            botType = random.nextInt(8) + 1;
            i--;
        }
        else if (i == 1)
        {
            i = 10;
        }
        else
        {
            i--;
        }
        return this.botCaller();
    }
    
    public String botCaller()
    {
        if (botType == 1)
        {
            return this.randomBot();
        }
        else if (botType == 2)
        {
            return this.cooperationBot();
        }
        else if (botType == 3)
        {
            return this.defectionBot();
        }
        else if (botType == 4)
        {
            return this.mimicBot();
        }
        else if (botType == 5)
        {
            return this.oppositionBot();
        }
        else if (botType == 6)
        {
            return this.secondChanceBot();
        }
        else if (botType == 7)
        {
            return this.grudgeBot();
        }
        return this.forgivingBot();
    }
    
    public String randomBot()
    {
        int rand = random.nextInt(2);
        if (rand == 0)
        {
            return "c";
        }
        return "d";
    }
    
    public String cooperationBot()
    {
        return "c";
    }
    
    public String defectionBot()
    {
        return "d";
    }
    
    public String mimicBot()
    {
        if (roundStorage.size() == 1)
        {
            return this.randomBot();
        }
        else if (roundStorage.get(roundStorage.size() - 2).equals("c"))
        {
            return "c";
        }
        return "d";
    }
    
    public String oppositionBot()
    {
        if (roundStorage.size() == 1)
        {
            return this.randomBot();
        }
        else if (roundStorage.get(roundStorage.size() - 2).equals("c"))
        {
            return "d";
        }
        return "c";
    }
    
    public String secondChanceBot()
    {
        if (roundStorage.size() < 3)
        {
            return "c";
        }
        else if (roundStorage.get(roundStorage.size() - 3).equals("d") && roundStorage.get(roundStorage.size() - 2).equals("d"))
        {
            return "d";
        }
        return "c";
    }
    
    public String grudgeBot()
    {
        if (roundStorage.size() == 1 || roundStorage.indexOf("d") == -1)
        {
            return "c";
        }
        return "d";
    }
    
    public String forgivingBot()
    {
        if (roundStorage.size() == 1 || roundStorage.indexOf("c") == -1)
        {
            return "d";
        }
        return "c";
    }
}

public class TiTester
{
    public TiTester()
    {
        
    }
    
    public boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        catch(NullPointerException e)
        {
            return false;
        }
        return true;
    }
    
    public boolean isValidSpace(int space, int subBoard, String[][] subBoards)
    {
        if (subBoards[subBoard][space].equals(" "))
        {
            return true;
        }
        return false;
    }
    
    public boolean isValidSubBoard(int subBoard, String[] mainBoard)
    {
        if (mainBoard[subBoard].equals(" "))
        {
            return true;
        }
        return false;
    }
    
    public boolean isSubWin(int subBoard, String[][] subBoards)
    {
        for (int i = 0; i < 7; i = i + 3)
        {
            if (subBoards[subBoard][i].equals(subBoards[subBoard][i + 1]) 
            && subBoards[subBoard][i + 1].equals(subBoards[subBoard][i + 2]) 
            && !subBoards[subBoard][i].equals(" "))
            {
                return true;
            }
        }
        for (int i = 0; i < 3; i++)
        {
            if (subBoards[subBoard][i].equals(subBoards[subBoard][i + 3]) 
            && subBoards[subBoard][i + 3].equals(subBoards[subBoard][i + 6]) 
            && !subBoards[subBoard][i].equals(" "))
            {
                return true;
            }
        }
        if (subBoards[subBoard][0].equals(subBoards[subBoard][4]) 
        && subBoards[subBoard][4].equals(subBoards[subBoard][8]) 
        && !subBoards[subBoard][0].equals(" "))
        {
            return true;
        }
        if (subBoards[subBoard][2].equals(subBoards[subBoard][4]) 
        && subBoards[subBoard][4].equals(subBoards[subBoard][6]) 
        && !subBoards[subBoard][2].equals(" "))
        {
            return true;
        }
        return false;
    }
    
    public boolean isWin(String[] mainBoard)
    {
        for (int i = 0; i < 7; i = i + 3)
        {
            if (mainBoard[i].equals(mainBoard[i + 1]) 
            && mainBoard[i + 1].equals(mainBoard[i + 2]) 
            && !mainBoard[i].equals(" "))
            {
                return true;
            }
        }
        for (int i = 0; i < 3; i++)
        {
            if (mainBoard[i].equals(mainBoard[i + 3]) 
            && mainBoard[i + 3].equals(mainBoard[i + 6]) 
            && !mainBoard[i].equals(" "))
            {
                return true;
            }
        }
        if (mainBoard[0].equals(mainBoard[4]) 
        && mainBoard[4].equals(mainBoard[8]) 
        && !mainBoard[0].equals(" "))
        {
            return true;
        }
        if (mainBoard[2].equals(mainBoard[4]) 
        && mainBoard[4].equals(mainBoard[6]) 
        && !mainBoard[2].equals(" "))
        {
            return true;
        }
        return false;
    }
}

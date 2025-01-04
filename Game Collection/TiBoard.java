public class TiBoard
{
    public TiBoard()
    {
        
    }

    public void printMainBoard(String[][] subBoards)
    {
        System.out.println(" " + subBoards[0][0] + " | " + subBoards[0][1] + " | " + subBoards[0][2] + 
        " █ " + subBoards[1][0] + " | " + subBoards[1][1] + " | " + subBoards[1][2] + 
        " █ " + subBoards[2][0] + " | " + subBoards[2][1] + " | " + subBoards[2][2] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[0][3] + " | " + subBoards[0][4] + " | " + subBoards[0][5] + 
        " █ " + subBoards[1][3] + " | " + subBoards[1][4] + " | " + subBoards[1][5] + 
        " █ " + subBoards[2][3] + " | " + subBoards[2][4] + " | " + subBoards[2][5] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[0][6] + " | " + subBoards[0][7] + " | " + subBoards[0][8] + 
        " █ " + subBoards[1][6] + " | " + subBoards[1][7] + " | " + subBoards[1][8] + 
        " █ " + subBoards[2][6] + " | " + subBoards[2][7] + " | " + subBoards[2][8] + " ");
        System.out.println("███████████████████████████████████");
        System.out.println(" " + subBoards[3][0] + " | " + subBoards[3][1] + " | " + subBoards[3][2] + 
        " █ " + subBoards[4][0] + " | " + subBoards[4][1] + " | " + subBoards[4][2] + 
        " █ " + subBoards[5][0] + " | " + subBoards[5][1] + " | " + subBoards[5][2] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[3][3] + " | " + subBoards[3][4] + " | " + subBoards[3][5] + 
        " █ " + subBoards[4][3] + " | " + subBoards[4][4] + " | " + subBoards[4][5] + 
        " █ " + subBoards[5][3] + " | " + subBoards[5][4] + " | " + subBoards[5][5] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[3][6] + " | " + subBoards[3][7] + " | " + subBoards[3][8] + 
        " █ " + subBoards[4][6] + " | " + subBoards[4][7] + " | " + subBoards[4][8] + 
        " █ " + subBoards[5][6] + " | " + subBoards[5][7] + " | " + subBoards[5][8] + " ");
        System.out.println("███████████████████████████████████");
        System.out.println(" " + subBoards[6][0] + " | " + subBoards[6][1] + " | " + subBoards[6][2] + 
        " █ " + subBoards[7][0] + " | " + subBoards[7][1] + " | " + subBoards[7][2] + 
        " █ " + subBoards[8][0] + " | " + subBoards[8][1] + " | " + subBoards[8][2] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[6][3] + " | " + subBoards[6][4] + " | " + subBoards[6][5] + 
        " █ " + subBoards[7][3] + " | " + subBoards[7][4] + " | " + subBoards[7][5] + 
        " █ " + subBoards[8][3] + " | " + subBoards[8][4] + " | " + subBoards[8][5] + " ");
        System.out.println("-----------█-----------█-----------");
        System.out.println(" " + subBoards[6][6] + " | " + subBoards[6][7] + " | " + subBoards[6][8] + 
        " █ " + subBoards[7][6] + " | " + subBoards[7][7] + " | " + subBoards[7][8] + 
        " █ " + subBoards[8][6] + " | " + subBoards[8][7] + " | " + subBoards[8][8] + " ");
    }
    
    public void printSubBoard(int b, String[][] subBoards)
    {
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
        System.out.println("     " + subBoards[b][0] + "     █     " + subBoards[b][1] + "     █     " + subBoards[b][2] + "     ");
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
        System.out.println("███████████████████████████████████");
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
        System.out.println("     " + subBoards[b][3] + "     █     " + subBoards[b][4] + "     █     " + subBoards[b][5] + "     ");
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
        System.out.println("███████████████████████████████████");
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
        System.out.println("     " + subBoards[b][6] + "     █     " + subBoards[b][7] + "     █     " + subBoards[b][8] + "     ");
        System.out.println("           █           █           ");
        System.out.println("           █           █           ");
    }
}

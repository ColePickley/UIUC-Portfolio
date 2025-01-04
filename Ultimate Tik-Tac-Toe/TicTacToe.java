import java.util.Scanner;

public class TicTacToe
{
    private String[] mainBoard = new String[9];
    private String[][] subBoards = new String[9][9];
    private TiBoard board = new TiBoard();
    private TiTester tester = new TiTester();
    private Scanner in = new Scanner(System.in);
    private String p1Name;
    private String p2Name;
    private boolean gameOver = false;
    private int playerTurn;
    private int subBoard;
    
    public TicTacToe()
    {
        for (int i = 0; i < 9; i++)
        {
            mainBoard[i] = " ";
            for (int j = 0; j < 9; j++)
            {
                subBoards[i][j] = " ";
            }
        }
    }
    
    public void run()
    {
        System.out.print('\u000C');
        System.out.println("Player 1 (X's), please input your name:");
        p1Name = in.next();
        System.out.print('\u000C');
        System.out.println("Player 2 (O's), please input your name:");
        p2Name = in.next();
        while (gameOver == false)
        {
            playerTurn = 1;
            this.turn(p1Name);
            if (tester.isSubWin(subBoard, subBoards) == true)
            {
                this.setSubWin();
            }
            if (tester.isWin(mainBoard) == true)
            {
                gameOver = true;
            }
            else
            {
                playerTurn = 2;
                this.turn(p2Name);
            }
            if (tester.isSubWin(subBoard, subBoards) == true)
            {
                this.setSubWin();
            }
            if (tester.isWin(mainBoard) == true)
            {
                gameOver = true;
            }
        }
        this.gameOver(playerTurn);
    }
    
    public void turn(String playerName)
    {
        boolean subBoardSelected = false;
        boolean spaceSelected = false;
        String subBoardIn;
        String spaceIn;
        int space = -1;
        
        System.out.print('\u000C');
        board.printMainBoard(subBoards);
        System.out.println(playerName + " please select a board (use #'s 1-9):");
        subBoardIn = in.next();
        if (tester.isInteger(subBoardIn) && tester.isValidSubBoard(Integer.valueOf(subBoardIn) - 1, mainBoard) == true)
        {
            subBoardSelected = true;
            subBoard = Integer.valueOf(subBoardIn) - 1;
        }
        while (subBoardSelected == false)
        {
            System.out.print('\u000C');
            board.printMainBoard(subBoards);
            System.out.println(playerName + " please select a board (use #'s 1-9):");
            System.out.println("Invalid Input!");
            subBoardIn = in.next();
            if (tester.isInteger(subBoardIn) && tester.isValidSubBoard(Integer.valueOf(subBoardIn) - 1, mainBoard) == true)
            {
                subBoardSelected = true;
                subBoard = Integer.valueOf(subBoardIn) - 1;
            }
        }
        
        System.out.print('\u000C');
        board.printSubBoard(subBoard, subBoards);
        System.out.println(playerName + " please select a space: (use #'s 1-9)");
        spaceIn = in.next();
        if (tester.isInteger(spaceIn) && tester.isValidSpace(Integer.valueOf(spaceIn) - 1, subBoard, subBoards) == true)
        {
            spaceSelected = true;
            space = Integer.valueOf(spaceIn) - 1;
        }
        while (spaceSelected == false)
        {
            System.out.print('\u000C');
            board.printSubBoard(subBoard, subBoards);
            System.out.println(playerName + " please select a space (use #'s 1-9):");
            System.out.println("Invalid Input!");
            spaceIn = in.next();
            if (tester.isInteger(spaceIn) && tester.isValidSpace(Integer.valueOf(spaceIn) - 1, subBoard, subBoards) == true)
            {
                spaceSelected = true;
                space = Integer.valueOf(spaceIn) - 1;
            }
        }
        
        this.setTurn(space);
    }
    
    public void setTurn(int space)
    {
        String spaceSetter;
        if (playerTurn == 1)
        {
            spaceSetter = "X";
        }
        else
        {
            spaceSetter = "O";
        }
        subBoards[subBoard][space] = spaceSetter;
    }
    
    public void setSubWin()
    {
        if (playerTurn == 1)
        {
            mainBoard[subBoard] = "X";
            for (int i = 0; i < 8; i = i + 2)
            {
                subBoards[subBoard][i] = "X";
                subBoards[subBoard][i + 1] = " ";
            }
            subBoards[subBoard][8] = "X";
        }
        else
        {
            mainBoard[subBoard] = "O";
            for (int i = 0; i < 4; i++)
            {
                subBoards[subBoard][i] = "O";
                subBoards[subBoard][i + 5] = "O";
            }
            subBoards[subBoard][4] = " ";
        }
    }
    
    public void gameOver(int playerTurn)
    {
        String playerName;
        if (playerTurn == 1)
        {
            playerName = p1Name;
        }
        else
        {
            playerName = p2Name;
        }
        System.out.print('\u000C');
        board.printMainBoard(subBoards);
        System.out.println(playerName + " Wins!");
    }
}

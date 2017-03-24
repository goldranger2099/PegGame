/**
 * The class that contains the game rules 
 * @author Vincent Lam
 * @author Robert Sobieski
 * @author Evan Dawkins
 * @author Nolan Major
 */
public class Rules
{
    /**
     * Checks if there is one peg left.
     * @param board Board object containing pegs
     * @return boolean True or false if the player has won
     */ 
    public boolean checkWinner(Board board)
    {
        boolean onePeg = false;
        int counter = 0;
        for(int i = 0; i < board.getBoard().size(); i++)
        {
            if(board.getBoard().get(i).getValue() == 1)
            {
                counter++;
            }
        }
        if(counter == 1)
        {
            onePeg = true; 
        }
        else
        {
            onePeg = false; 
        }
        return onePeg;
    }

    /**
     * Checks to see if there are any moves left.
     * @param board Board object containing pegs
     * @return boolean True or false if the player has lost
     */
    public boolean checkLoser(Board board)
    {
        int counter = 0;
        for(int i = 0; i < board.getBoard().size(); i++)
        {
            if(board.getBoard().get(i).getValue() == 1)
            {
                if(numMoves(board, i + 1) > 0)
                {
                    counter++;
                }
            }
        }
        if(counter > 0)
        {
            return false; 
        }
        else
        {
            return true; 
        }
    }

    /**
     * Checks the board to see amount of possible possible moves
     * @param board Board object containing pegs
     * @param peg Peg number
     * @return int Number of total possible moves
     */
    public int numMoves(Board board, int peg)
    {
        int counter = 0;
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 2, (board.getBoard().get(peg - 1)).getPosY()) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 4, (board.getBoard().get(peg - 1)).getPosY()) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
            {
                counter++;
            }
        }
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 2, (board.getBoard().get(peg - 1)).getPosY()) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 4, (board.getBoard().get(peg - 1)).getPosY()) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
            {
                counter++;
            }
        }
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 1, (board.getBoard().get(peg - 1)).getPosY() - 1) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 2, (board.getBoard().get(peg - 1)).getPosY() - 2) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
            {
                counter++;
            }
        }
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 1, (board.getBoard().get(peg - 1)).getPosY() - 1) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 2, (board.getBoard().get(peg - 1)).getPosY() - 2) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
            {
                counter++;
            }
        }
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 1, (board.getBoard().get(peg - 1)).getPosY() + 1) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() - 2, (board.getBoard().get(peg - 1)).getPosY() + 2) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
            {
                counter++;
            }
        }
        if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 1, (board.getBoard().get(peg - 1)).getPosY() + 1) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
        {
            if(board.pegExists((board.getBoard().get(peg - 1)).getPosX() + 2, (board.getBoard().get(peg - 1)).getPosY() + 2) == true && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
            {
                counter++;
            }
        }
        return counter;
    }
    
    /**
     * Finds peg number of middle peg when given a starting peg and ending peg
     * @param board The board object containing pegs
     * @param pegStart Number of starting peg
     * @param pegEnd Number of ending peg
     * @return int Number of middle peg
     */
    public int findMidPeg(Board board, int pegStart, int pegEnd)
    {
        if((board.getBoard().get(pegStart - 1).getNum() == 1 && (board.getBoard().get(pegEnd - 1).getNum() == 4)))
        {
            return 2;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 1 && (board.getBoard().get(pegEnd - 1).getNum() == 5)))
        {
            return 3;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 2 && (board.getBoard().get(pegEnd - 1).getNum() == 7)))
        {
            return 4;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 2 && (board.getBoard().get(pegEnd - 1).getNum() == 9)))
        {
            return 5;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 3 && (board.getBoard().get(pegEnd - 1).getNum() == 8)))
        {
            return 5;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 3 && (board.getBoard().get(pegEnd - 1).getNum() == 10)))
        {
            return 6;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 4 && (board.getBoard().get(pegEnd - 1).getNum() == 11)))
        {
            return 7;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 4 && (board.getBoard().get(pegEnd - 1).getNum() == 13)))
        {
            return 8;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 5 && (board.getBoard().get(pegEnd - 1).getNum() == 12)))
        {
            return 8;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 5 && (board.getBoard().get(pegEnd - 1).getNum() == 14)))
        {
            return 9;
        }
        return 0;
    }
    
    /**
     * Finds if there is a middle peg when given a starting peg and ending peg
     * @param board The board object
     * @param pegStart Number of starting peg
     * @param pegEnd Number of ending peg
     * @return boolean True or false if there is a middle peg
     */
    public boolean isMidPeg(Board board, int pegStart, int pegEnd)
    {
        if((board.getBoard().get(pegStart - 1).getNum() == 1 && (board.getBoard().get(pegEnd - 1).getNum() == 4)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 1 && (board.getBoard().get(pegEnd - 1).getNum() == 5)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 2 && (board.getBoard().get(pegEnd - 1).getNum() == 7)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 2 && (board.getBoard().get(pegEnd - 1).getNum() == 9)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 3 && (board.getBoard().get(pegEnd - 1).getNum() == 8)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 3 && (board.getBoard().get(pegEnd - 1).getNum() == 10)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 4 && (board.getBoard().get(pegEnd - 1).getNum() == 11)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 4 && (board.getBoard().get(pegEnd - 1).getNum() == 13)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 5 && (board.getBoard().get(pegEnd - 1).getNum() == 12)))
        {
            return true;
        }
        else if((board.getBoard().get(pegStart - 1).getNum() == 5 && (board.getBoard().get(pegEnd - 1).getNum() == 14)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     /**
     * Checks to see whether a peg can move to a certain space or not
     * @param board Board object containing pegs
     * @param pegStart Number of starting peg
     * @param pegMid Number of middle peg
     * @param pegEnd Number of ending peg
     * @return boolean True or false if pegs can be moved.
     */
    public boolean isValidMove(Board board, int pegStart, int pegMid, int pegEnd)
    {
        if(board.getBoard().get(pegStart - 1).getValue() == 1 && board.getBoard().get(pegMid - 1).getValue() == 1 && board.getBoard().get(pegEnd - 1).getValue() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

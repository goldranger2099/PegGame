/**
 * The class that contains the game rules 
 * @author Robert Vince Evan and Nolan
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
        if(canMove(board, i + 1) > 0)
        {
          counter++;
        }
      }
    }
    if(counter >= 1)
    {
      return false; 
    }
    else
    {
      return true; 
    }
  }
  /**
   * Checks to see whether a peg can move to a certain space or not
   * @param board Board object containing pegs
   * @param peg Peg number
   * @return int Number of total possible moves
   */
  public int canMove(Board board, int peg)
  {
    int counter = 0;
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  &&  (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        counter++;
      }
    }
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
        if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        counter++;
      }
    }
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1, ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        counter++;
      }
    }
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        counter++;
      }
    }
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        counter++;
      }
    }
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        counter++;
      }
    }
    return counter;
  }
  
  /**
   * If only one move is available, this method finds the positions of the middle peg and end peg
   * @param board Board object containing pegs
   * @param peg Peg number
   * @return int[] Array containing position x and y of the middle and end pegs
   */
  public int[] findOneMove(Board board, int peg)
  {
    //O is midPosX, 1 is MidPosY, 2 is EndPosX, 3 is EndPosY
    int[] midEndPegPosXY = new int[4];
    if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  &&  (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY();
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY();
      }
    }
    else if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
        if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4 , ((Peg)(board.getBoard().get(peg - 1))).getPosY()) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY();
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY();
      }
    }
    else if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1, ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1;
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2;
      }
    }
    else if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1;
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2;
      }
    }
    else if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1;
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2;
      }
    }
    else if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2) != null  && (((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        midEndPegPosXY[0] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1;
        midEndPegPosXY[1] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1;
        midEndPegPosXY[2] = ((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2;
        midEndPegPosXY[3] = ((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2;
      }
    }
    return midEndPegPosXY;
  }
}

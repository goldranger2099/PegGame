public class Rules
{
  // Checks if there is one peg left.
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
  //Checks to see if there are any moves left.
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
  //Checks to see whether a peg can move to a certain space or not.
   public int canMove(Board board, int peg)
    {
    int counter = 0;
    if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2 , ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
      if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        counter++;
      }
    }
    else if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 1))
    {
    	if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 4, ((Peg)(board.getBoard().get(peg - 1))).getPosY())).getValue() == 0))
      {
        counter++;
      }
    }
    else if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        counter++;
      }
    }
    else if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 1)).getValue() == 1))
    {
      if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() - 2)).getValue() == 0))
      {
        counter++;
      }
    }
    else if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() - 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        counter++;
      }
    }
    else if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 1,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 1)).getValue() == 1))
    {
      if((((Peg)board.getPeg(((Peg)(board.getBoard().get(peg - 1))).getPosX() + 2,((Peg)(board.getBoard().get(peg - 1))).getPosY() + 2)).getValue() == 0))
      {
        counter++;
      }
    }
    return counter;
  }
}

public class Rules
{
  public boolean checkWinner(Board board)
  {
    boolean onePeg = false;
    int counter = 0;
    for(int i = 0; i < board.getBoard().size(); i++)
    {
      if(board.get(i).getValue() == 1)
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
  public boolean checkLoser(Board board)
  {
    boolean moreThanOne = false;
    int counter = 0;
    for(int i = 0; i < board.getBoard().size(); i++)
    {
      if(board.get(i).getValue() == 1)
      {
         counter++;
      }
    }
    if(counter != 1)
    {
      moreThanOne = false; 
    }
    else
    {
      moreThanOne = true; 
    }
    return moreThanOne;
  }
  public boolean canMove(Board board, int peg)
  {
    if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 2, board.get(peg - 1).getPosY())).getValue == 1)
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 4, board.get(peg - 1).getPosY())).getValue == 0)
      {
        return true;
      }
    }
    else if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 2, board.get(peg - 1).getPosY())).getValue == 1))
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 4, board.get(peg - 1).getPosY())).getValue == 0)
      {
        return true;
      }
    }
    else if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 1, board.get(peg - 1).getPosY() - 1)).getValue == 1))
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 2, board.get(peg - 1).getPosY() - 2)).getValue == 0))
      {
        return true;
      }
    }
    else if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 1, board.get(peg - 1).getPosY() - 1)).getValue == 1))
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 2, board.get(peg - 1).getPosY() - 2)).getValue == 0))
      {
        return true;
      }
    }
    else if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 1, board.get(peg - 1).getPosY() + 1)).getValue == 1))
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() - 2, board.get(peg - 1).getPosY() + 2)).getValue == 0))
      {
        return true;
      }
    }
    else if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 1, board.get(peg - 1).getPosY() + 1)).getValue == 1))
    {
      if(board.get(peg - 1).getPeg(board.get(peg - 1).getPosX() + 2, board.get(peg - 1).getPosY() + 2)).getValue == 0))
      {
        return true;
      }
    else
    {
      return false;
    }
  }
}

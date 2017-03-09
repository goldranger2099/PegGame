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
    {
      if(board)
      {
        //x +1
        return true;
      }
    }
  }
}

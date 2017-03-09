public class Rules
{
  public boolean checkWinner(Board)
  {
    boolean onePeg = false;
    int counter = 0;
    for(int i = 0; i < Board.getBoard().length; i++)
    {
      if(Board.getPeg(i) == 1)
      {
         counter++
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
  public boolean checkLoser(Board)
  {
    boolean moreThanOne = false;
    int counter = 0;
    for(int i = 0; i < Board.getBoard().length; i++)
    {
      if(Board.getPeg(i) == 1)
      {
         counter++
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
}

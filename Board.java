import java.util.ArrayList;

public class Board
{
  public class Peg
  {
    /*
    / Sets the X and Y of the Peg board as well as the beginning values.
    */
    int posX;
    int posY;
    int value;
    public Peg(posX, posY)
    {
      this.posX = posX;
      this.posY = posY;
    }
    //Returns X
    public int getPosX()
    {
      return posX;
    }
    //Returns Y
    public int getPosY()
    {
      return posY;
    }
    //Changes the Value in that pegs properties
    public void setValue(int value)
    {
      this.value = value;
    }
    //Returns a pegs value
    public int getValue()
    {
      return value;
    }
  }
  //Creation of Pegs and sets them on board.
  ArrayList<Peg> board = new ArrayList<>();
  Peg peg1 = new Peg(5, 5);
  board.add(peg1);
  Peg peg2 = new Peg(4, 4);
  board.add(peg2);
  Peg peg3 = new Peg(6, 4);
  board.add(peg3);
  Peg peg4 = new Peg(3, 3);
  board.add(peg4);
  Peg peg5 = new Peg(5, 3);
  board.add(peg5);
  Peg peg6 = new Peg(7, 3);
  board.add(peg6);
  Peg peg7 = new Peg(2, 2);
  board.add(peg7);
  Peg peg8 = new Peg(4, 2);
  board.add(peg8);
  Peg peg9 = new Peg(6, 2);
  board.add(peg9);
  Peg peg10 = new Peg(8, 2);
  board.add(peg10);
  Peg peg11 = new Peg(1, 1);
  board.add(peg11);
  Peg peg12 = new Peg(3, 1);
  board.add(peg12);
  Peg peg13 = new Peg(5, 1);
  board.add(peg13);
  Peg peg14 = new Peg(7, 1);
  board.add(peg14);
  Peg peg15 = new Peg(9, 1);
  board.add(peg15);
  //Sets ALL pegs to 1.
  for(int pegs: board)
  {
    pegs.setValue(1);
  }
  //Resets board completely.
  public void resetBoard()
  {
    for(int pegs: board)
    {
      pegs.setValue(1);
    }
  }
  //Changes a peg to zero.
  public void removePeg(peg)
  {
    if(peg > 0 && peg < 16)
    {
      board.get(peg - 1).setValue(0);
    }
  }
  //Moves a peg from x - 2, x + 2, y + 2, or y - 2.
  public void movePeg(int start, int mid, int end)
  {
    if (board.get(start).getValue() == 1 && board.get(mid).getValue() == 1 && board.get(end).getValue() == 0)
    {
      board.get(start - 1).setValue() = 0;
      board.get(mid - 1).setValue() = 0;
      board.get(end - 1).setValue() = 1;
    }
  }
  //Finds peg in X and Y spot
  public Peg getPeg(posX, posY)
  {
    for(int i = 0; i < board.size(); i++)
    {
      if(posX >= 1 && posX <= 9 && posY >= 1 && posY <= 5 && posX == board.get(i).getPosX() && posY == board.get(i).getPosY())
      {
        return board.get(i);
      }
    }
    return;
  }
  //Returns board
  public ArrayList getBoard()
  {
    return board;
  }
}

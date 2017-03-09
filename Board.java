import java.util.ArrayList;

public class Board
{
  public class Peg
  {
    int posX;
    int posY;
    int value;
    public Peg(posX, posY)
    {
      this.posX = posX;
      this.posY = posY;
    }
    public int getPosX()
    {
      return posX;
    }
    public int getPosY()
    {
      return posY;
    }
    public void setValue(int value)
    {
      this.value = value;
    }
  }
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
  
  for(int pegs: board)
  {
    pegs.setValue(1);
  }
  public void resetBoard()
  {
    for(int pegs: board)
    {
      pegs = 1;
    }
  }
  public int movePeg(start, mid, end)
  {
    board[start] = 0;
    board[mid] = 0;
    board[end] = 1;
  }
  public ArrayList returnBoard()
  {
    return board;
  }
}

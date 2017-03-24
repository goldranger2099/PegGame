/**
 * The board class that holds all the pegs
 * @author Vincent Lam
 * @author Robert Sobieski
 * @author Evan Dawkins
 * @author Nolan Major
 */
import java.util.ArrayList;

public class Board
{
  private ArrayList<Peg> board = new ArrayList<>();
  /**
   * Constructor for the peg positions
   */
  public Board()
  {
    Peg peg1 = new Peg(5, 5, 1);
    board.add(peg1);
    Peg peg2 = new Peg(4, 4, 2);
    board.add(peg2);
    Peg peg3 = new Peg(6, 4, 3);
    board.add(peg3);
    Peg peg4 = new Peg(3, 3, 4);
    board.add(peg4);
    Peg peg5 = new Peg(5, 3, 5);
    board.add(peg5);
    Peg peg6 = new Peg(7, 3, 6);
    board.add(peg6);
    Peg peg7 = new Peg(2, 2, 7);
    board.add(peg7);
    Peg peg8 = new Peg(4, 2, 8);
    board.add(peg8);
    Peg peg9 = new Peg(6, 2, 9);
    board.add(peg9);
    Peg peg10 = new Peg(8, 2, 10);
    board.add(peg10);
    Peg peg11 = new Peg(1, 1, 11);
    board.add(peg11);
    Peg peg12 = new Peg(3, 1, 12);
    board.add(peg12);
    Peg peg13 = new Peg(5, 1, 13);
    board.add(peg13);
    Peg peg14 = new Peg(7, 1, 14);
    board.add(peg14);
    Peg peg15 = new Peg(9, 1, 15);
    board.add(peg15);
    
    //Sets ALL pegs to 1, which means the pegs are on the board.
    
    for(int i = 0; i < board.size(); i++)
    {
      board.get(i).setValue(1);
    }
  }
  /**
  *   Resets board completely.
  */
  public void resetBoard()
  {
    for(int i = 0; i < board.size(); i++)
    {
      board.get(i).setValue(1);
    }
  }
  /**
   * Changes a peg to zero, which means the peg is removed.
   * @param peg Peg Number
   */
  public void removePeg(int peg)
  {
    if(peg > 0 && peg < 16)
    {
      board.get(peg - 1).setValue(0);
    }
  }
  /**
   * Moves a peg from x - 2, x + 2, y + 2, or y - 2. The starting peg jumps to the empty end position, which removes the peg in the middle
   * @param start Starting peg number
   * @param mid Middle peg number
   * @param end End peg number
   */
  public void movePeg(int start, int mid, int end)
  {
    if (board.get(start).getValue() == 1 && board.get(mid).getValue() == 1 && board.get(end).getValue() == 0)
    {
      board.get(start - 1).setValue(0);
      board.get(mid - 1).setValue(0);
      board.get(end - 1).setValue(1);
    }
  }
  public boolean pegExists(int posX, int posY) {
        for(int i = 0; i < board.size(); i++)
        {
            if(posX >= 1 && posX <= 9 && posY >= 1 && posY <= 5 && posX == board.get(i).getPosX() && posY == board.get(i).getPosY())
            {
                return true;
            }
        }
        return false;
    }
  /**
   * Finds peg in given X and Y spot
   * @param posX Position x of the peg
   * @param posY Position y of the peg
   * @return Peg A peg with given position
   */
  //Finds peg in given X and Y spot
    public Peg getPeg(int posX, int posY) throws IllegalArgumentException
    {
        for(int i = 0; i < board.size(); i++)
        {
            if(posX >= 1 && posX <= 9 && posY >= 1 && posY <= 5 && posX == board.get(i).getPosX() && posY == board.get(i).getPosY())
            {
                return board.get(i);
            }
        }
        throw new IllegalArgumentException();
    }
  /**
   * Returns Arraylist board
   * @return ArrayList<Peg> An array list containing pegs
   */
  public ArrayList<Peg> getBoard()
  {
    return board;
  }
}

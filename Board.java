public class Board
{
  int[] board = new int[15];
  for(int pegs: board)
  {
    pegs = 1;
  }
  public void resetBoard()
  {
    for(int pegs: board)
    {
      pegs = 1;
    }
  }
  public int setPeg(start, mid, end)
  {
    board[start] = 0;
    board[mid] = 0;
    board[end] = 1;
  }
}

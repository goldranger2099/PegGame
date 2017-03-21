public class Peg
  {
    /*
    Sets the X and Y of the Peg board as well as the beginning values.
    */
    private int posX;
    private int posY;
    private int value;
    private int pegNum;
    public Peg(int posX, int posY, int pegNum)
    {
      this.posX = posX;
      this.posY = posY;
      this.pegNum = pegNum;
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
    
    public int getNum()
    {
      return pegNum;
    }
  }

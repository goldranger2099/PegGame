/**
 * The peg class that contains peg values
 * @author Vincent Lam
 * @author Robert Sobieski
 * @author Evan Dawkins
 * @author Nolan Major
 */
public class Peg
{
    //Sets the X and Y of the Peg board as well as the beginning values.
    private int posX;
    private int posY;
    private int value;
    private int pegNum;
    /**
     * Constructor of the peg class
     * @param posX Position x of the peg
     * @param posY Position y of the peg
     * @param pegNum Peg number
     */
    public Peg(int posX, int posY, int pegNum)
    {
        this.posX = posX;
        this.posY = posY;
        this.pegNum = pegNum;
    }

    /**
     * Method that returns position X of a peg
     * @return int Position x
     */
    public int getPosX()
    {
        return posX;
    }

    /**
     * Method that returns position Y of a peg
     * @return int Position Y
     */
    public int getPosY()
    {
        return posY;
    }

    /**
     * Method that changes the value in that pegs properties
     * @param value New peg value
     */
    public void setValue(int value)
    {
        this.value = value;
    }

    /**
     * Method that returns a pegs value
     * @return int Peg value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Method that returns a pegs number
     * @return int Peg number
     */
    public int getNum()
    {
        return pegNum;
    }
}

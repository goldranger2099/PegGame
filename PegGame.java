/**
 * This program run a basic game of the Peg Game, or Triangle Peg.
 * A player begins playing the Peg Game on a triangle shaped board. The player clicks any one of 15 available pegs to remove, then the game begins.
 * A player can select a peg if the position next to the adjacent peg is empty (both the two pegs and empty position must be in a straight line).
 * The selected peg is then moved to the empty position, while the adjacent peg, which is “jumped over,” is removed.
 * However, if the selected peg has two or more such empty positions available to move to, the player must select the end position.
 * Before every turn, the game will check for any available moves, i.e. pegs that can move to empty positions; if not, the player loses the game.
 * The player wins the peg game if only one peg remains anywhere on the board.
 * At any point in the game, the player can click on the reset button to reset the board.
 * 
 * @author Vincent Lam
 * @author Robert Sobieski
 * @author Evan Dawkins
 * @author Nolan Major
 * @version %I%, %G%
 * @since 0.1.3.25
 */

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.URL;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

/**
 * Creates visible peg board for the players to play.
 * @see Board
 * @see Rules
 */
public class PegGame
{
  /**
    * Main method runs the peg game.
    */
  public static void main(String[] args)
  {
    //Creates playing board and window
    JFrame boardFrame = new JFrame("Peg Game");
    boardFrame.setPreferredSize(new Dimension(500, 625));
    JPanel pegBoard = new JPanel();
    pegBoard.setLayout(null);
    
    //Gets board background image from URL
    BufferedImage background = null;
    try
    {
        URL url1 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/backgroundpeggame.png");
        background = ImageIO.read(url1);
    }
    catch (IOException e) {}
    
    final Image backgroundImage = background;
    JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));
    
    //Adds background image to pegBoard
    pegBoard.add(backgroundLabel);
    backgroundLabel.setSize(500,500);
    backgroundLabel.setLocation(0,0);
    
    //Gets reset button background image from URL
    BufferedImage reset = null;
    try
    {
        URL url2 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/backgroundpeggame.png");
        reset = ImageIO.read(url2);
    }
    catch (IOException e) {}
    final Image resetImage = reset.getSubimage(0, 550, 500, 50); 
    final ImageIcon resetIcon = new ImageIcon(resetImage);
    
    //Creates reset button and adds reset image
    JButton resetButton = new JButton(resetIcon);
    resetButton.setPreferredSize(new Dimension(500,50));
    
    //Creates title display area
    JPanel titleDisplay = new JPanel();
    titleDisplay.setLayout(null);
    titleDisplay.setPreferredSize(new Dimension(500,50));
    
    //Creates text for title display area
    JLabel titleDisplayText = new JLabel("REMOVE A PEG");
    titleDisplayText.setFont(new Font("Verdana", Font.PLAIN, 12));
    titleDisplayText.setForeground(Color.WHITE);
    
    //Gets title background image from URL
    BufferedImage title = null;
    try
    {
        URL url3 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/backgroundpeggame.png");
        title = ImageIO.read(url3);
    }
    catch (IOException e) {}
    final Image titleImage = title.getSubimage(0, 0, 500, 50); 
    JLabel titleLabel = new JLabel(new ImageIcon(titleImage));
    
    //Adds titleText JLabel to titleDisplay JPanel
    titleDisplay.add(titleDisplayText);
    titleDisplayText.setSize(500,50);
    titleDisplayText.setHorizontalAlignment(JLabel.CENTER);
    titleDisplayText.setVerticalAlignment(JLabel.CENTER);
    
    //Adds title background image to titleDisplay
    titleDisplay.add(titleLabel);
    titleLabel.setSize(500,50);
    titleLabel.setLocation(0,0);
    
    //Gets transparent button image from URL
    BufferedImage clear = null;
    try
    {
        URL url4 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/100x100%20blank.png");
        clear = ImageIO.read(url4);
    }
    catch (IOException e) {}
    final Image clearImage = clear;
    ImageIcon clearIcon = new ImageIcon(clearImage);
    
    //Gets peg button image from URL
    BufferedImage peg = null;
    try
    {
        URL url5 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/Peg%20but%20it's%20100x100.png");
        peg = ImageIO.read(url5);
    }
    catch (IOException e) {}
    final Image pegImage = peg;
    ImageIcon pegIcon = new ImageIcon(pegImage);
    
    //Gets X image from URL
    BufferedImage redX = null;
    try
    {
        URL url6 = new URL("https://raw.githubusercontent.com/goldranger2099/PegGame/master/X.png");
        redX = ImageIO.read(url6);
    }
    catch (IOException e) {}
    final Image redXImage = redX;
    ImageIcon redXIcon = new ImageIcon(redXImage);
   
    //Creates buttons 1 - 15
    
    JButton button1 = new JButton(pegIcon);
    //button1.setContentAreaFilled(false);
    button1.setFocusPainted(false); 
    button1.setBorderPainted(false);
    
    JButton button2 = new JButton(pegIcon);
    button2.setFocusPainted(false); 
    button2.setBorderPainted(false);
    JButton button3 = new JButton(pegIcon);
    button3.setFocusPainted(false); 
    button3.setBorderPainted(false);
    JButton button4 = new JButton(pegIcon);
    button4.setFocusPainted(false); 
    button4.setBorderPainted(false);
    JButton button5 = new JButton(pegIcon);
    button5.setFocusPainted(false); 
    button5.setBorderPainted(false);
    JButton button6 = new JButton(pegIcon);
    button6.setFocusPainted(false); 
    button6.setBorderPainted(false);
    JButton button7 = new JButton(pegIcon);
    button7.setFocusPainted(false); 
    button7.setBorderPainted(false);
    JButton button8 = new JButton(pegIcon);
    button8.setFocusPainted(false); 
    button8.setBorderPainted(false);
    JButton button9 = new JButton(pegIcon);
    button9.setFocusPainted(false); 
    button9.setBorderPainted(false);
    JButton button10 = new JButton(pegIcon);
    button10.setFocusPainted(false); 
    button10.setBorderPainted(false);
    JButton button11 = new JButton(pegIcon);
    button11.setFocusPainted(false); 
    button11.setBorderPainted(false);
    JButton button12 = new JButton(pegIcon);
    button12.setFocusPainted(false); 
    button12.setBorderPainted(false);
    JButton button13 = new JButton(pegIcon);
    button13.setFocusPainted(false); 
    button13.setBorderPainted(false);
    JButton button14 = new JButton(pegIcon);
    button14.setFocusPainted(false); 
    button14.setBorderPainted(false);
    JButton button15 = new JButton(pegIcon);
    button15.setFocusPainted(false); 
    button15.setBorderPainted(false);
    
    //Creates array of JButtons
    ArrayList<JButton> buttons = new ArrayList<>();
    
    //Adds buttons to ArrayList buttons
    buttons.add(button1);
    buttons.add(button2);
    buttons.add(button3);
    buttons.add(button4);
    buttons.add(button5);
    buttons.add(button6);
    buttons.add(button7);
    buttons.add(button8);
    buttons.add(button9);
    buttons.add(button10);
    buttons.add(button11);
    buttons.add(button12);
    buttons.add(button13);
    buttons.add(button14);
    buttons.add(button15);
    
    //Creates board object.
    final Board board = new Board();
      
    //Creates rules object.
    final Rules rules = new Rules();
    
    /**
    * Listener class for buttons for choosing pegs on the board and updating every turn
    */
    class ClickListener implements ActionListener
    {
      private boolean firstTurn = true;
       /**
       * Button listener method to check button clicks.
       * @param e Button clicked
       */
       public void actionPerformed(ActionEvent e)
       {
          //If value of peg is 1, set the button icon to a peg. Otherwise if the value is 0, set the button icon to clear.
          if(board.getBoard().get(0).getValue() == 1)
          {
              button1.setIcon(pegIcon);
          }
          else if(board.getBoard().get(0).getValue() == 0)
          {
              button1.setIcon(clearIcon);
          }
          if(board.getBoard().get(1).getValue() == 1)
          {
              button2.setIcon(pegIcon);
          }
          else if(board.getBoard().get(1).getValue() == 0)
          {
              button2.setIcon(clearIcon);
          }
          if(board.getBoard().get(2).getValue() == 1)
          {
              button3.setIcon(pegIcon);
          }
          else if(board.getBoard().get(2).getValue() == 0)
          {
              button3.setIcon(clearIcon);
          }
          if(board.getBoard().get(3).getValue() == 1)
          {
              button4.setIcon(pegIcon);
          }
          else if(board.getBoard().get(3).getValue() == 0)
          {
              button4.setIcon(clearIcon);
          }
          if(board.getBoard().get(4).getValue() == 1)
          {
              button5.setIcon(pegIcon);
          }
          else if(board.getBoard().get(4).getValue() == 0)
          {
              button5.setIcon(clearIcon);
          }if(board.getBoard().get(5).getValue() == 1)
          {
              button6.setIcon(pegIcon);
          }
          else if(board.getBoard().get(5).getValue() == 0)
          {
              button6.setIcon(clearIcon);
          }
          if(board.getBoard().get(6).getValue() == 1)
          {
              button7.setIcon(pegIcon);
          }
          else if(board.getBoard().get(6).getValue() == 0)
          {
              button7.setIcon(clearIcon);
          }
          if(board.getBoard().get(7).getValue() == 1)
          {
              button8.setIcon(pegIcon);
          }
          else if(board.getBoard().get(7).getValue() == 0)
          {
              button8.setIcon(clearIcon);
          }
          if(board.getBoard().get(8).getValue() == 1)
          {
              button9.setIcon(pegIcon);
          }
          else if(board.getBoard().get(8).getValue() == 0)
          {
              button9.setIcon(clearIcon);
          }
          if(board.getBoard().get(9).getValue() == 1)
          {
              button10.setIcon(pegIcon);
          }
          else if(board.getBoard().get(9).getValue() == 0)
          {
              button10.setIcon(clearIcon);
          }
          if(board.getBoard().get(10).getValue() == 1)
          {
              button11.setIcon(pegIcon);
          }
          else if(board.getBoard().get(10).getValue() == 0)
          {
              button11.setIcon(clearIcon);
          }
          if(board.getBoard().get(11).getValue() == 1)
          {
              button12.setIcon(pegIcon);
          }
          else if(board.getBoard().get(11).getValue() == 0)
          {
              button12.setIcon(clearIcon);
          }
          if(board.getBoard().get(12).getValue() == 1)
          {
              button13.setIcon(pegIcon);
          }
          else if(board.getBoard().get(12).getValue() == 0)
          {
              button13.setIcon(clearIcon);
          }
          if(board.getBoard().get(13).getValue() == 1)
          {
              button14.setIcon(pegIcon);
          }
          else if(board.getBoard().get(13).getValue() == 0)
          {
              button14.setIcon(clearIcon);
          }
          if(board.getBoard().get(14).getValue() == 1)
          {
              button15.setIcon(pegIcon);
          }
          else if(board.getBoard().get(14).getValue() == 0)
          {
              button15.setIcon(clearIcon);
          }
          //If it is the first turn, the player clicks a button to remove that peg
          if(firstTurn == true)
          {
            titleDisplayText.setText("REMOVE A PEG");
            if (e.getSource() == button1)
            {
                board.removePeg(1);
                firstTurn = false;
                button1.setIcon(clearIcon);
            }
            else if (e.getSource() == button2)
            {
                board.removePeg(2);
                firstTurn = false;
                button2.setIcon(clearIcon);
            }
            else if (e.getSource() == button3)
            {
                board.removePeg(3);
                firstTurn = false;
                button3.setIcon(clearIcon);
            }
            else if (e.getSource() == button4)
            {
                board.removePeg(4);
                firstTurn = false;
                button4.setIcon(clearIcon);
            }
            else if (e.getSource() == button5)
            {
                board.removePeg(5);
                firstTurn = false;
                button5.setIcon(clearIcon);
            }
            else if (e.getSource() == button6)
            {
                board.removePeg(6);
                firstTurn = false;
                button6.setIcon(clearIcon);
            }
            else if (e.getSource() == button7)
            {
                board.removePeg(7);
                firstTurn = false;
                button7.setIcon(clearIcon);
            }
            else if (e.getSource() == button8)
            {
                board.removePeg(8);
                firstTurn = false;
                button8.setIcon(clearIcon);
            }
            else if (e.getSource() == button9)
            {
                board.removePeg(9);
                firstTurn = false;
                button9.setIcon(clearIcon);
            }
            else if (e.getSource() == button10)
            {
                board.removePeg(10);
                firstTurn = false;
                button10.setIcon(clearIcon);
            }
            else if (e.getSource() == button11)
            {
                board.removePeg(11);
                firstTurn = false;
                button11.setIcon(clearIcon);
            }
            else if (e.getSource() == button12)
            {
                board.removePeg(12);
                firstTurn = false;
                button12.setIcon(clearIcon);
            }
            else if (e.getSource() == button13)
            {
                board.removePeg(13);
                firstTurn = false;
                button13.setIcon(clearIcon);
            }
            else if (e.getSource() == button14)
            {
                board.removePeg(14);
                firstTurn = false;
                button14.setIcon(clearIcon);
            }
            else if (e.getSource() == button15)
            {
                board.removePeg(15);
                firstTurn = false;
                button14.setIcon(clearIcon);
            }
          }
          //After first turn, checking for peg moves
          else
          {
            titleDisplayText.setText("");
            if (e.getSource() == button1)
            {
              if(rules.canMove(board, 1) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 1);
                  board.movePeg(1, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
                  /*Check all possible moves (i.e. copy some code from canMove: around peg 1 there are two pegs. 
                  If pegs 2 and 3 both have value of 1, then if either or both pegs 4 and 6 have either value of 0, then set icons of pegs 4 and 6 to redXIcon.
                  Need another if statement for e.getSource() is a button that has a redXIcon, so player can click to move the peg manually
                  
                  if (button4.getIcon().equals(redXIcon) {};
                  
                  then do board.movePeg();
                  */
              }
            }
            else if(e.getSource() == button2)
            {
              if(rules.canMove(board, 2) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 2);
                  board.movePeg(2, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
                  
              }    
            }
            else if(e.getSource() == button3)
            {
              if(rules.canMove(board, 3) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 3);
                  board.movePeg(3, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button4)
            {
              if(rules.canMove(board, 4) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 4);
                  board.movePeg(4, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button5)
            {
              if(rules.canMove(board, 5) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 5);
                  board.movePeg(5, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button6)
            {
              if(rules.canMove(board, 6) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 6);
                  board.movePeg(6, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button7)
            {
              if(rules.canMove(board, 7) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 7);
                  board.movePeg(7, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button8)
            {
              if(rules.canMove(board, 8) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 8);
                  board.movePeg(8, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button9)
            {
              if(rules.canMove(board, 9) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 9);
                  board.movePeg(9, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button10)
            {
              if(rules.canMove(board, 10) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 10);
                  board.movePeg(10, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button11)
            {
              if(rules.canMove(board, 11) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 11);
                  board.movePeg(11, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button12)
            {
              if(rules.canMove(board, 12) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 12);
                  board.movePeg(12, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum()); 
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button13)
            {
              if(rules.canMove(board, 13) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 13);
                  board.movePeg(13, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if(e.getSource() == button14)
            {
              if(rules.canMove(board, 14) == 1)
              {
                  int[] posXY = rules.findOneMove(board, 14);
                  board.movePeg(14, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }
            }
            else if(e.getSource() == button15)
            {
              if(rules.canMove(board, 1) == 15)
              {
                  int[] posXY = rules.findOneMove(board, 15);
                  board.movePeg(15, board.getPeg(posXY[0], posXY[1]).getNum(), board.getPeg(posXY[2], posXY[3]).getNum());
              }
              else if (rules.canMove(board, 1) > 1)
              {
              }    
            }
            else if (e.getSource() == resetButton)
            {
              board.resetBoard();
              titleDisplayText.setText("REMOVE A PEG");
              for(int i = 0; i < buttons.size(); i++)
              {
                  buttons.get(i).setEnabled(true);
              }
              firstTurn = true;
            }
            
            //Checks if player has won the game
            if(rules.checkWinner(board) == true && rules.checkLoser(board) == false)
            {
              titleDisplayText.setText("YOU WIN!");
              for(int i = 0; i < buttons.size(); i++)
              {
                  buttons.get(i).setEnabled(false);
              }
            }
            
            //Checks if player has lost the game
            if(rules.checkLoser(board) == true && rules.checkWinner(board) == false)
            {
              titleDisplayText.setText("YOU LOST!");
              for(int i = 0; i < buttons.size(); i++)
              {
                  buttons.get(i).setEnabled(false);
              }
            }
          }
          SwingUtilities.updateComponentTreeUI(boardFrame);
      }
    }
    
    //Adds click listeners to buttons 1-15
    ActionListener boardListener = new ClickListener();
    button1.addActionListener(boardListener);
    button2.addActionListener(boardListener);
    button3.addActionListener(boardListener);
    button4.addActionListener(boardListener);
    button5.addActionListener(boardListener);
    button6.addActionListener(boardListener);
    button7.addActionListener(boardListener);
    button8.addActionListener(boardListener);
    button9.addActionListener(boardListener);
    button10.addActionListener(boardListener);
    button11.addActionListener(boardListener);
    button12.addActionListener(boardListener);
    button13.addActionListener(boardListener);
    button14.addActionListener(boardListener);
    button15.addActionListener(boardListener);
    
    //Adds levels to peg board in pyramid formation
    pegBoard.add(button1);
    button1.setSize(100,100);
    button1.setLocation(200, 0);
    pegBoard.add(button2);
    button2.setSize(100,100);
    button2.setLocation(150, 100);
    pegBoard.add(button3);
    button3.setSize(100,100);
    button3.setLocation(250, 100);
    pegBoard.add(button4);
    button4.setSize(100,100);
    button4.setLocation(100, 200);
    pegBoard.add(button5);
    button5.setSize(100,100);
    button5.setLocation(200, 200);
    pegBoard.add(button6);
    button6.setSize(100,100);
    button6.setLocation(300, 200);
    pegBoard.add(button7);
    button7.setSize(100,100);
    button7.setLocation(50, 300);
    pegBoard.add(button8);
    button8.setSize(100,100);
    button8.setLocation(150, 300);
    pegBoard.add(button9);
    button9.setSize(100,100);
    button9.setLocation(250, 300);
    pegBoard.add(button10);
    button10.setSize(100,100);
    button10.setLocation(350, 300);
    pegBoard.add(button11);
    button11.setSize(100,100);
    button11.setLocation(0, 400);
    pegBoard.add(button12);
    button12.setSize(100,100);
    button12.setLocation(100, 400);
    pegBoard.add(button13);
    button13.setSize(100,100);
    button13.setLocation(200, 400);                            
    pegBoard.add(button14);
    button14.setSize(100,100);
    button14.setLocation(300, 400);
    pegBoard.add(button15);
    button15.setSize(100,100);
    button15.setLocation(400, 400);
    
    //Adds listener to reset button
    resetButton.addActionListener(boardListener);
    
    //Adds peg board to window and makes window visible
    boardFrame.add(titleDisplay, BorderLayout.NORTH);
    boardFrame.add(pegBoard, BorderLayout.CENTER);
    boardFrame.add(resetButton, BorderLayout.SOUTH);
    boardFrame.pack();
    boardFrame.setResizable(false);
    boardFrame.setVisible(true);
    boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

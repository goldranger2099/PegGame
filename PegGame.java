import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.URL;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class PegGame
{
  public static void main(String[] args)
  {
    //Creates playing window and board
    JFrame boardFrame = new JFrame("Peg Game");
    boardFrame.setPreferredSize(new Dimension(500, 625));
    JPanel pegBoard = new JPanel();
    pegBoard.setLayout(null);
    
    //Creates buttons 1 - 15
    JButton button1 = new JButton("");
    button1.setBackground(Color.BLACK);
    JButton button2 = new JButton("");
    button2.setBackground(Color.BLACK);
    JButton button3 = new JButton("");
    button3.setBackground(Color.BLACK);
    JButton button4 = new JButton("");
    button4.setBackground(Color.BLACK);
    JButton button5 = new JButton("");
    button5.setBackground(Color.BLACK);
    JButton button6 = new JButton("");
    button6.setBackground(Color.BLACK);
    JButton button7 = new JButton("");
    button7.setBackground(Color.BLACK);
    JButton button8 = new JButton("");
    button8.setBackground(Color.BLACK);
    JButton button9 = new JButton("");
    button9.setBackground(Color.BLACK);
    JButton button10 = new JButton("");
    button10.setBackground(Color.BLACK);
    JButton button11 = new JButton("");
    button11.setBackground(Color.BLACK);
    JButton button12 = new JButton("");
    button12.setBackground(Color.BLACK);
    JButton button13 = new JButton("");
    button13.setBackground(Color.BLACK);
    JButton button14 = new JButton("");
    button14.setBackground(Color.BLACK);
    JButton button15 = new JButton("");
    button15.setBackground(Color.BLACK);
   
    //Creates reset button
    JButton resetButton = new JButton("RESET");
    resetButton.setBackground(Color.RED);
    resetButton.setPreferredSize(new Dimension(500,50));
    
    //Creates title display area
    JLabel titleDisplayText = new JLabel("PEG GAME");
    JPanel titleDisplay = new JPanel();
    titleDisplay.setPreferredSize(new Dimension(500,50));
    
    //Creates board object.
    final Board board = new Board();
      
    //Creates rules object.
    final Rules rules = new Rules();
    
    /**
    * Listener class for buttons for choosing pegs on the board
    */
    class ClickListener implements ActionListener
    {
      /**
       * Button listener method to check button clicks.
       * @param e Button clicked
       */
      public void actionPerformed(ActionEvent e)
      {
        if (e.getSource() == button1)
        {
          if(rules.canMove(board, 1) == 1)
          {
            
          }
          else if (rules.canMove(board, 1) > 1)
          {
          }
        }
        else if(e.getSource() == button2)
        {
        }
        else if(e.getSource() == button3)
        {
        }
        else if(e.getSource() == button4)
        {
        }
        else if(e.getSource() == button5)
        {
        }
        else if(e.getSource() == button6)
        {
        }
        else if(e.getSource() == button7)
        {
        }
        else if(e.getSource() == button8)
        {
        }
        else if(e.getSource() == button9)
        {
        }
        else if(e.getSource() == button10)
        {
        }
        else if(e.getSource() == button11)
        {
        }
        else if(e.getSource() == button12)
        {
        }
        else if(e.getSource() == button13)
        {
        }
        else if(e.getSource() == button14)
        {
        }
        else if(e.getSource() == button15)
        {
        }
        else if (e.getSource() == resetButton)
        {
          board.resetBoard();
          button1.setEnabled(true);
          button2.setEnabled(true);
          button3.setEnabled(true);
          button4.setEnabled(true);
          button5.setEnabled(true);
          button6.setEnabled(true);
          button7.setEnabled(true);
          button8.setEnabled(true);
          button9.setEnabled(true);
          button10.setEnabled(true);
          button11.setEnabled(true);
          button12.setEnabled(true);
          button13.setEnabled(true);
          button14.setEnabled(true);
          button15.setEnabled(true);
        }
        if(rules.checkWinner(board) == true && rules.checkLoser(board) == false)
        {
          titleDisplayText.setText("YOU WIN!");
          button1.setEnabled(false);
          button2.setEnabled(false);
          button3.setEnabled(false);
          button4.setEnabled(false);
          button5.setEnabled(false);
          button6.setEnabled(false);
          button7.setEnabled(false);
          button8.setEnabled(false);
          button9.setEnabled(false);
          button10.setEnabled(false);
          button11.setEnabled(false);
          button12.setEnabled(false);
          button13.setEnabled(false);
          button14.setEnabled(false);
          button15.setEnabled(false);
        }
        if(rules.checkLoser(board) == true && rules.checkWinner(board) == false)
        {
          titleDisplayText.setText("YOU LOST!");
          button1.setEnabled(false);
          button2.setEnabled(false);
          button3.setEnabled(false);
          button4.setEnabled(false);
          button5.setEnabled(false);
          button6.setEnabled(false);
          button7.setEnabled(false);
          button8.setEnabled(false);
          button9.setEnabled(false);
          button10.setEnabled(false);
          button11.setEnabled(false);
          button12.setEnabled(false);
          button13.setEnabled(false);
          button14.setEnabled(false);
          button15.setEnabled(false);
        }
        SwingUtilities.updateComponentTreeUI(boardFrame);
      }
    }
    
    //Adds listener to buttons 1-15
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
    
    //Adds titleText JLabel to titleDisplay JPanel
    titleDisplay.add(titleDisplayText);
      
    //Adds listener to reset button
    resetButton.addActionListener(boardListener);
    
    //Adds peg board to window and makes window visible
    boardFrame.add(titleDisplay, BorderLayout.NORTH);
    boardFrame.add(pegBoard, BorderLayout.CENTER);
    boardFrame.add(resetButton, BorderLayout.SOUTH);
    boardFrame.pack();
    boardFrame.setResizable(false);
    boardFrame.setVisible(true);
  }
}

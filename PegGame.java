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
    //Creates playing window, board, and board pyramid
    JFrame boardFrame = new JFrame();
    JFrame pegBoard = new JFrame();
    GridLayout pyramid = new GridLayout(5, 1);
    pegBoard.setLayout(pyramid);
    JPanel level1 = new JPanel();
    JPanel level2 = new JPanel();
    GridLayout onextwo = new GridLayout(1, 2);
    level2.setLayout(onextwo);
    JPanel level3 = new JPanel();
    GridLayout onexthree = new GridLayout(1, 3);
    level3.setLayout(onexthree);
    JPanel level4 = new JPanel();
    GridLayout onexfour = new GridLayout(1, 4);
    level4.setLayout(onexfour);
    JPanel level5 = new JPanel();
    GridLayout onexfive = new GridLayout(1, 5);
    level5.setLayout(onexfive);
    
    //Buttons 1 - 15
    JButton button1 = new JButton("");
    button1.setPreferredSize(100,100);
    JButton button2 = new JButton("");
    button2.setPreferredSize(100,100);
    JButton button3 = new JButton("");
    button3.setPreferredSize(100,100);
    JButton button4 = new JButton("");
    button4.setPreferredSize(100,100);
    JButton button6 = new JButton("");
    button6.setPreferredSize(100,100);
    JButton button7 = new JButton("");
    button7.setPreferredSize(100,100);
    JButton button8 = new JButton("");
    button8.setPreferredSize(100,100);
    JButton button9 = new JButton("");
    button9.setPreferredSize(100,100);
    JButton button10 = new JButton("");
    button10.setPreferredSize(100,100);
    JButton button11 = new JButton("");
    button11.setPreferredSize(100,100);
    JButton button12 = new JButton("");
    button12.setPreferredSize(100,100);
    JButton button13 = new JButton("");
    button13.setPreferredSize(100,100);
    JButton button14 = new JButton("");
    button14.setPreferredSize(100,100);
    JButton button15 = new JButton("");
    button15.setPreferredSize(100,100);
   
    //Reset button
    JButton resetButton = new JButton("RESET");
    
    //Creates title display area
    JLabel titleDisplayText = new JLabel("");
    JPanel titleDisplay = new JPanel();
    
    //Creates board object.
    final Board board = new Board();
      
    //Creates rules object.
    final Rules rules = new Rules();
    
    public boolean checkKonami()
    {
      
    }
    public void loadGraphics()
    {
      
    }
    
    //Adds listener to buttons 1-15
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
    
    //Adds buttons to levels
    level1.add(button1);
    level2.add(button2).setLocation(1,1);
    level2.add(button3).setLocation(1,2);
    level3.add(button4).setLocation(1,1);
    level3.add(button5).setLocation(1,2);
    level3.add(button6).setLocation(1,3);
    level4.add(button7).setLocation(1,1);
    level4.add(button8).setLocation(1,2);
    level4.add(button9).setLocation(1,3);
    level4.add(button10).setLocation(1,4);
    level5.add(button11).setLocation(1,1);
    level5.add(button12).setLocation(1,2);
    level5.add(button13).setLocation(1,3);
    level5.add(button14).setLocation(1,4);
    level5.add(button15).setLocation(1,5);
    
    //Adds levels to peg board in pyramid formation
    pegBoard.add(level1).setLocation(1,1);
    pegBoard.add(level2).setLocation(2,1);
    pegBoard.add(level3).setLocation(3,1);
    pegBoard.add(level4).setLocation(4,1);
    pegBoard.add(level4).setLocation(5,1);
    
    //Adds titleText JLabel to titleDisplay JPanel
    titleDisplay.add(titleDisplayText);
      
    //Adds listener to reset button
    resetButton.addActionListener(boardListener);
    
    //Adds peg board to window and makes window visible
    boardFrame.add(title, BorderLayout.NORTH);
    boardFrame.add(pegBoard, BorderLayout.CENTER);
    boardFrame.add(resetButton, BorderLayout.SOUTH);
    boardFrame.pack();
    boardFrame.setResizable(false);
    boardFrame.setVisible(true);
  }
}

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
    JFrame boardFrame = new JFrame()
    JFrame pegBoard = new JFrame();
    GridLayout pyramid = new GridLayout(5, 1);
    JFrame level1 = new JFrame();
    JFrame level2 = new JFrame();
    GridLayout onextwo = new GridLayout(1, 2);
    JFrame level3 = new JFrame();
    GridLayout onexthree = new GridLayout(1, 3);
    JFrame level4 = new JFrame();
    GridLayout onexfour = new GridLayout(1, 4);
    JFrame level5 = new JFrame();
    GridLayout onexfive = new GridLayout(1, 5);
    
    
    public boolean checkKonami()
    {
      
    }
    public void loadGraphics()
    {
      
    }
    boardFrame.add(pegGame, BorderLayout.CENTER);
    boardFrame.add(title, BorderLayout.NORTH);
    boardFrame.add(resetButton, BorderLayout.SOUTH);
  }
}

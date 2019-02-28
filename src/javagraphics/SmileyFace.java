package javagraphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.BLACK);
      window.fillOval( 310,250,200,200);
      window.setColor(Color.YELLOW);
      window.fillRect( 310,250,210,120);
      window.setColor(Color.BLACK);
      window.fillOval( 310-80+50, 200, 100, 100 );
      window.fillOval( 310+50+80, 200, 100, 100 );
      window.fillOval( 310+50+80, 200, 100, 100 );
      
      

		//add more code here


   }
}
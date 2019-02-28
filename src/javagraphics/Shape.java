package javagraphics;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private float color;

   public Shape(int x, int y, int wid, int ht, float col)
   {
		xPos = x;
                yPos= y;
                width=wid;
                height=ht;
                color=col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      for(float i=width;i>0;i--){
      window.setColor(Color.getHSBColor(i/100+color, .5f, 1f));
      window.fillOval(xPos, yPos, (int)i, (int)i);
      }
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
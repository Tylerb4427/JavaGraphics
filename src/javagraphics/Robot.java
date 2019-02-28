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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

     head(window);
     upperBody(window);
     lowerBody(window);
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.gray);
      window.fillRect(400-50, 100, 100, 100);
      window.setColor(Color.red);
      window.fillOval(400-10-20, 120, 20, 20);  
      window.fillOval(400-10+20, 120, 20, 20);

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.gray);
      window.fillRect(400-100, 200, 200, 200);
      window.fillRect(200, 220, 400, 25);
      
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
    window.setColor(Color.gray);
    window.fillRect(400-(75/2)+50, 300, 75, 200);
    window.fillRect(400-(75/2)-50, 300, 75, 200);
		//add more code here

   }
}
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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );
      window.setColor(Color.LIGHT_GRAY);
      window.fillPolygon(new int[] {800,820,600,620} , new int[] {350,550,550,350} ,4);
      window.setColor(Color.WHITE);
      window.fillPolygon(new int[] {810,830,610,630} , new int[] {360,560,560,360} ,4);
      window.setColor(Color.BLUE);
      window.fillRect( 700, 360, 2, 120 );
      window.fillRect( 750, 360, 2, 120 );
      window.fillRect( 690, 480, 70, 10 );
      window.setColor(Color.green);
      window.fillRect( 0, 525, 800, 425 );
      
      for(int i=0; i<=10;i++){
        window.fillPolygon(new int[] {60-7*i,100,140+7*i} , new int[] {200+(40*i),125+(40*i),200+(40*i)} ,3);
      }
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );

      window.setColor(Color.RED);
      window.fillRect(225,150,50,50);
      window.fillPolygon(new int[] {200,400,600}, new int[] {200,100,200} ,3);
      window.setColor(Color.cyan);
      window.fillRect( 250, 350, 100, 100 );
      window.setColor(Color.LIGHT_GRAY);
      window.fillRect( 450, 350, 100, 350 );
      
   }
}
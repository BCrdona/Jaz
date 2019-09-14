
package intento;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class i extends Applet{
    public void paint (Graphics g){
        
    g.setColor(Color.pink);
    g.fillRect(50, 50, 100, 100);
        
        
     g.setColor(Color.black);
     g.fillRect(75, 120, 50, 20);
     
     
     g.setColor(Color.blue);
     g.fillOval(50,150,100 ,100);
     
     g.setColor(Color.red);
     g.fillOval(50, 240, 50, 50);
     
       g.setColor(Color.red);
     g.fillOval(100, 240, 50, 50);
     
     g.setColor(Color.black);
     g.fillOval(60, 80, 25,25 );
     
     g.setColor(Color.black);
     g.fillOval(110, 80, 25,25 );
     
     g.setColor(Color.pink);
     g.fillOval(10, 180, 40, 40);
     
     g.setColor(Color.pink);
     g.fillOval(150, 180, 40, 40);
     
   int [] vx1 = {300, 350, 250};
        int [] vy1 = {250, 255, 295};
        g.drawPolygon (vx1, vy1, 3);
        
        
     g.setColor(Color.ORANGE);
     g.drawOval(280, 280, 100, 100);
     
      int [] vx2 = {400,450, 350};
        int [] vy2 = {225, 250, 95};
        g.drawPolygon (vx2, vy2, 3);
        
       g.setColor(Color.ORANGE);
     g.drawOval(280, 280, 100, 100);
    }
    
}

    
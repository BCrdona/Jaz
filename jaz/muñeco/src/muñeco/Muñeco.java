
package muñeco;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class Muñeco extends Applet {

    public void paint (Graphics g){
        g.setColor(Color.pink);
        g.fillRect(50, 150, 100, 100);
        
        
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
     
     
    }
    
}

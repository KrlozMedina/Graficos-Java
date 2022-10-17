/*
 * pincel.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author MARY
 */
public class pincel extends Canvas {
    
    grafos  form1;
    int px = 0,py = 0,ancho = 0, alto = 0;
    
    
    /** Creates a new instance of pincel */
    public pincel(grafos    R) {
        this.form1 = R;
    }
    
    public void asignacion (int prx, int pry, int d){
        this.px = prx;
        this.py = pry;
        this.ancho = d;
        this.alto = d;
    }
    
     public void paint(Graphics lapiz){ // Metodo de pintado 
    //Canvas papel = this;
    
     
     
     lapiz.setColor(new Color (0,0,255));
     lapiz.drawLine(0,150,400,150);
     lapiz.drawLine(200,0,200,300);
   // lapiz.drawLine(0, 30 ,400 , 30 );
     lapiz.setColor(new Color (255,0,0));
     lapiz.fillOval(px,py,ancho,alto);
     
     
     
     }
    
    
    
}

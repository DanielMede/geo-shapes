
import java.awt.Graphics;

public abstract class GeoShape {

    protected int posx, posy;
    protected double area;
    
    public  GeoShape(){
        posx = 0;
        posy = 0;
        area = calcArea();
    }
    
    public abstract double calcArea();
        
    public abstract void drawShape(Graphics g);
    
    public void setPos(int x, int y){
        posx = x;
        posy = y;
        
    }    
}

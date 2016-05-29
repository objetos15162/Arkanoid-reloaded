import greenfoot.*;

/**
 * Write a description of class Eye_Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eye_Ball extends Bola
{
    public Eye_Ball()
    {
        super(2,1);
    }
    /**
     * Act - do whatever the Eye_Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //if(Greenfoot.isKeyDown("space"))
         //band=1;
       mueveBola();     
       checaSuelo();
    }    
}

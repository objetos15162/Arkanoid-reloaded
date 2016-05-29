import greenfoot.*;

/**
 * Write a description of class DragonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonBall extends Bola
{
    public DragonBall()
    {
        super(4,2);
    }
    /**
     * Act - do whatever the DragonBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("space"))
         band=1;
       mueveBola();     
       checaSuelo();
    }    
}

import greenfoot.*;

/**
 * Write a description of class ItemDragonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemDragonBall extends Item
{
    
     public ItemDragonBall()
    {
       super(1);
    }
    
    /**
     * Act - do whatever the ItemDragonBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Cae();
        checaBarra();
    }    
}

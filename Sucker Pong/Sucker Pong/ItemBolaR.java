import greenfoot.*;

/**
 * Write a description of class ItemBolaR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemBolaR extends Item
{
    
    public ItemBolaR()
    {
       super(2);
    }
    
    /**
     * Act - do whatever the ItemBolaR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Cae();
        checaBarra();
    }    
}

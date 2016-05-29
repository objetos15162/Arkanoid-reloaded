import greenfoot.*;

/**
 * Write a description of class ItemBarraL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemBarraL extends Item
{
    
    public ItemBarraL()
    {
       super(3);
    }
    
    /**
     * Act - do whatever the ItemBarraL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Cae();
       checaBarra();
    }    
}

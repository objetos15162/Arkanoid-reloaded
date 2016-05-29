import greenfoot.*;

/**
 * Write a description of class ItemBarrarR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemBarraR extends Item
{
    
    public ItemBarraR()
    {
       super(4);
    }
    
    /**
     * Act - do whatever the ItemBarrarR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Cae();
        checaBarra();
    }    
}

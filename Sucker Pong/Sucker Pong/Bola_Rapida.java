import greenfoot.*;

/**
 * Write a description of class Bola_Rapida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola_Rapida extends Bola
{
    public Bola_Rapida()
    {
        super(4,1);
    }
    /**
     * Act - do whatever the Bola_Rapida wants to do. This method is called whenever
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

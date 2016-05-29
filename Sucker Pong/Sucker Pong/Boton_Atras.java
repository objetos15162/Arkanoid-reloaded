import greenfoot.*;

/**
 * Write a description of class Boton_Atras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton_Atras extends Actor
{
    /**
     * Si se da click en el boton atras se regresara al menu
     */
    public void act() 
    {
        if(Greenfoot.getMouseInfo()!=null){
               if(Greenfoot.mousePressed(this))
               {
                  Greenfoot.setWorld(new Menu());                      
               }               
            }
    }    
}

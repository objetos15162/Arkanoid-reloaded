import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barra extends Actor
{  
    protected int vel;
    
    public Barra(int velocidad)
    {
        vel=velocidad;
    }
    
    public void act() 
    {       
        Movimiento();
    }    
    
    /**
    * Metodo que se encarga del movimiento de la barra
    */ 
    protected void Movimiento()
    {
         if(Greenfoot.isKeyDown("Right"))
        {
            move(vel);
        }
          if(Greenfoot.isKeyDown("Left"))
        {
            move(-vel);
        }
    }
    
}

import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    private int golpes =2;
    private int item;
    
          
    public Enemigo(String nom)
    {
        setImage(nom+".png");
        item=Greenfoot.getRandomNumber(6);
    }
    
    /**
     * Checa cuantos golpes tiene el enemigo y si llega a 0 desaparece
     */
    private void checaGolpe()
    {
        World mundo = (MundoJuego) getWorld();
        MundoJuego mun = (MundoJuego) mundo;
        Bola bola=mun.dimeBola();
        Counter con = mun.damePuntos();
        if(isTouching(Bola.class))
        {
            golpes=golpes-bola.dimeDaño();
            con.add(1);
        }           
        if(golpes<=0 || golpes<0)
        {            
            checaItems();
            mundo.removeObject(this);            
        }
    }
    
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checaGolpe();        
    }   
    
    private void checaItems()
    {
       World mundo = (MundoJuego) getWorld();
       if(item==1)
           mundo.addObject(new ItemDragonBall(),getX(),getY()); 
       if(item==2)
           mundo.addObject(new ItemBolaR(),getX(),getY()); 
       if(item==3)
           mundo.addObject(new ItemBarraL(),getX(),getY()); 
       if(item==4)
           mundo.addObject(new ItemBarraR(),getX(),getY()); 
    }
    
}

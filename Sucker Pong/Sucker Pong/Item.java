import greenfoot.*;

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    protected int num;
    
    /**
     * Constructor de la clase item 
     */
    public Item(int n)
    {
       num=n;
    }
    
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Cae();
        checaBarra();        
    }
     
    /**
    * Comprueba si la bola toca la barra del jugador
    */
    protected void checaBarra()
    {
        World mundo = (MundoJuego) getWorld();
        if(isTouching(Barra.class))
        {
            agregaItem(num);
            mundo.removeObject(this);
        }
        else if(getY()==getWorld().getHeight()-1)
           mundo.removeObject(this);
        
    }
            
    /**
     * Metodo que se encarga de que la bola caiga
     */
    protected void Cae()
    {
        int y1=2;
        setLocation(getX(),getY()+y1);        
    }
    
    /**
     * Metodo que se encarga de comparar para saber que item se tiene que agregar
     */
    protected void agregaItem(int num)
    {
        World mundo = (MundoJuego) getWorld();
        MundoJuego mun = (MundoJuego) mundo;
        if(num==1)
        {                      
            mun.removeObjects(mun.getObjects(Bola.class)); 
            mun.igualaBola(new DragonBall());
            mundo.addObject(new DragonBall(),200,250);
        }
        if(num==2)
        {                      
            mun.removeObjects(mun.getObjects(Bola.class)); 
            mun.igualaBola(new Bola_Rapida());
            mundo.addObject(new Bola_Rapida(),200,250);
        }
        if(num==3)
        {                      
            mun.removeObjects(mun.getObjects(Barra.class)); 
            mundo.addObject(new Lenta(),200,470);
        }
        if(num==4)
        {                      
            mun.removeObjects(mun.getObjects(Barra.class)); 
            mundo.addObject(new Rapida(),200,470);
        }
    }
}

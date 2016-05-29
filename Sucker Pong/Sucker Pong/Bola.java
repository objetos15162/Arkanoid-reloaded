import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se asignan las propiedades que tiene la bola cuando
 * toca al jugador, o cuando toca los bordes de la pantalla, para asi
 * cambiar la direccion y la velocidad
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    /* Variables para La velocidad */
    protected int velX;   
    protected int velY;
    /*bandera*/
    protected int band=0;
    
    protected int daño;
   
    
    public Bola(int velocidad,int poder)
    {       
        velY= velocidad;
        daño= poder;
        velX = Greenfoot.getRandomNumber(2)+1 ;
        if (Greenfoot.getRandomNumber(2) == 0)
            velX = -1 * velX;
        
    }

    public void act() 
    {
       
    }    

    /**
     * Metodo para el movimiento de la bola 
     */
    protected void mueveBola()
    {
       setLocation(getX()+velX,getY()+velY);  
       checaPared();
       checaBarra();          
       checaEnemigo();               
    }

    /**
     * Comprueba si la bola toca los limites del mundo 
       */
    protected void checaPared()
    {
        if(getX()==0 || getX()== getWorld().getWidth()-1)
        {
            velX=-velX;
        }
        if(getY()==0)
        {
            velY=-velY;
        } 
        if(getY()==getWorld().getHeight()-1)
        {
            velY=+velY;
        }  
    }

    /**
     * Comprueba si la bola toca la barra del jugador
     */
    protected void checaBarra()
    {
        if(isTouching(Barra.class))
        {
            velY=-velY; 
        }
    }
    
    /**
     * Metodo que checa si la bola toca al enemigo para que rebote
     */
    protected void checaEnemigo()
    {
        if(isTouching(Enemigo.class))
        {
            velY=-velY; 
        }
    }
    
     /**
     *Metodo que se encarga de checar si la bola toca el suelo 
     */
    protected void checaSuelo()
    {
        World mundo = (MundoJuego) getWorld();
        if(getY()==getWorld().getHeight()-1)
        {
            MundoJuego mun = (MundoJuego) mundo;
            Counter con = mun.dameVidas();
            con.add(-1);
            preparaBolaNueva();
            mundo.removeObject(this);
            mun.igualaBola(new Eye_Ball());
            mun.removeObjects(mun.getObjects(Barra.class)); 
            mundo.addObject(new Normal(),200,470);
            mundo.addObject(new Eye_Ball(),200,250);           
        }
    }  
    
    protected void preparaBolaNueva()
    {
        //band=0;
        velX = Greenfoot.getRandomNumber(2)+1 ;
        if (Greenfoot.getRandomNumber(2) == 0)
            velX = -1 * velX;
    }
    
    public int dimeDaño()
    {
        return daño;
    }
    
    public int dameX()
    {
        return velX;
    }
    
    public int dameY()
    {
         return velY;
    }
      
}

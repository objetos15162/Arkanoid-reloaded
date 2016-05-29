import java.util.*;
import greenfoot.*;
import java.awt.Color;
import java.util.List;

/**
 * 
 */
public class MundoJuego extends World
{
    public static final int Ancho=400;
    public static final int Alto=500;
    private Archivo archivo = new Archivo();
    private Counter vidas= new Counter("Bolas ");
    private Counter puntos= new Counter("Puntos ");
    private Bola bola=new Eye_Ball();
    private Barra barra=new Normal();
    private String[] enemigos={"enemigo1","enemigo2","enemigo3","enemigo4","enemigo5","enemigo6",
                                "enemigo7","enemigo8","enemigo9","enemigo10","enemigo11"};
    

    /**
     * Constructor del mundo
     */
    public MundoJuego()
    {
        super(Ancho,Alto,1);
        Greenfoot.setWorld(new Menu());
        prepare();
        preparaEnemigos();
    }

    /**
     * Prepara los objetos necesarios para el juego
     */
    public void prepare()
    {
        vidas.setValue(3);
        puntos.setValue(0);
        addObject(puntos,60,20);
        addObject(vidas,350,20);
        addObject(barra,(Ancho / 2),Alto - 30);
        addObject(bola, (Ancho / 2), 222);
        GreenfootImage image = new GreenfootImage(Ancho,Alto);
        image.setColor(new Color(200,200,200));
        image.fillRect(0,0,Ancho,Alto);
        //setBackground(image);
    }
    
    /**
     *Metodo que regresa el contador de vidas para que pueda ser modificado
     */
    public Counter dameVidas()
    {
        return vidas;
    }
    
    /**
     *Metodo que regresa el contador de puntos para que pueda ser modificado
     */
    public Counter damePuntos()
    {
        return puntos;
    }   
    
    /**
     * Metodo que quita los objetos y muestra el texto de que ha perdido el jugador
     */
    private void Perdiste()
    {
        if(vidas.getValue()==0)
        {
            removeObjects(getObjects(null)); 
            addObject(new Mensaje("¡PERDISTE!",Color.RED),340,320);
            addObject(new Mensaje("Suerte para la proxima :(",Color.RED),280,350);
            addObject(puntos,Ancho/2,Alto/2);
            archivo.comparaPuntaje(puntos.getValue());
            Greenfoot.stop();
        }        
    }
    
     /**
     * 
     */
    public void act()
    {
        Ganaste();
        Perdiste();
    }
    
    /**
     * Coloca el arreglo de enemigos en el mundo
     */
    private void preparaEnemigos()
    {
        for(int ren=0;ren<5;ren++)
        {
            for(int col=0;col<13;col++)
            {
                addObject(new Enemigo(enemigos[Greenfoot.getRandomNumber(11)]),20+(col*30),50+(ren*30));
            }
        }
    }
       
    public Bola dimeBola()
    {
        return bola;
    }
    
    public void igualaBola(Bola bol)
    {
        bola=bol;
    }
    
     /**
     * Metodo que quita los objetos y muestra el texto de que ha ganado el jugador
     */
    private void Ganaste()
    {
        List ListaEnemigos = this.getObjects(Enemigo.class);
        if(ListaEnemigos.size()==0)
        {
            removeObjects(getObjects(null));            
            addObject(new Mensaje("¡GANASTE! :D",Color.RED),330,320);
            addObject(new Mensaje("Tu puntaje es: ",Color.RED),330,350);
            addObject(puntos,Ancho/2,Alto/2);
            archivo.comparaPuntaje(puntos.getValue());
            Greenfoot.stop();
        }        
    }
}
import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public static final int Ancho=640;
    public static final int Alto=400;

    private Archivo records= new Archivo();
    private Boton jugar;
    private Boton creditos;
    private Boton instrucciones;
    private Boton_Atras atras;

    private Mensaje mensaje1,mensaje2,mensaje3,mensaje4,mensaje5;

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(Ancho, Alto, 1); 
        creaBotones();
        act();
    }

    /**
     * Metodo que crea los botones necesarios para el menu 
     */
    public void creaBotones()
    {
        jugar = new Boton();
        jugar.creaBoton(1);
        creditos =new Boton();
        creditos.creaBoton(3);
        instrucciones = new Boton();
        instrucciones.creaBoton(2);
        atras = new Boton_Atras();

        this.addObject(jugar, Ancho/2, 100);
        this.addObject(creditos, Ancho/2, 300);
        this.addObject(instrucciones, Ancho/2, Alto/2);   
    }

    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(jugar))//Checa si se sio click en el boton jugar
            {
                Greenfoot.setWorld(new MundoJuego());
            }

            else 
            {
                if(Greenfoot.mousePressed(creditos))//Checa si se dio click en el boton creditos
                {
                    removeObjects(getObjects(null));

                    mensaje1 = new Mensaje("Creadores del juego",Color.YELLOW);
                    this.addObject(mensaje1, 200, 100);

                    mensaje2 = new Mensaje("Cesar Alfonso Catro Perez",Color.YELLOW);
                    this.addObject(mensaje2, 200, 150);

                    mensaje3 = new Mensaje("Maldonado Diaz Fabian Giovany",Color.YELLOW);
                    this.addObject(mensaje3, 200, 200);
                    int a=records.leeArchivo("Records.txt");
                    mensaje4=new Mensaje("El puntaje mayor es: "+a,Color.YELLOW);
                    this.addObject(mensaje4, 200, 300);

               
                             
                    this.addObject(atras, 320, 350);  
                }
                else 
                if(Greenfoot.mousePressed(instrucciones))//Checa si se dio click en el boton instrucciones
                {
                    removeObjects(getObjects(null));

                    mensaje1 = new Mensaje("Para mover la barra",Color.YELLOW);
                    this.addObject(mensaje1, 200, 150);

                    mensaje2 = new Mensaje("Se utilizan las flechas del teclado",Color.YELLOW);
                    this.addObject(mensaje2, 200, 200);

                    mensaje3 = new Mensaje("Derecha e Izquierda",Color.YELLOW);
                    this.addObject(mensaje3, 200, 250);

                    mensaje4 = new Mensaje("Bolas: Rapida, DragonBall",Color.YELLOW);
                    this.addObject(mensaje4, 200, 300);
                    
                    mensaje4 = new Mensaje("y Eye Ball",Color.YELLOW);
                    this.addObject(mensaje4, 200, 350);

                    mensaje5 = new Mensaje("Barras: Normal, Lenta, Rapida",Color.YELLOW);
                    this.addObject(mensaje5, 200, 400);

                    this.addObject(atras, 320, 350);              
                }            
            }
        }
    }
}

import greenfoot.*;

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    /**
     * Metodo que crea los botones para el menu.
     * @param num Recibe como parametro un numero de acuerdo a que botón se quiere crear.
     */
    public void creaBoton(int num)
    {
        if(num==1)
           setImage("Jugar.png");
        if(num==2)
           setImage("Instrucciones.png");
        if(num==3)
           setImage("Creditos.png");
        if(num==4)
           setImage("Atras.png");
    }
}

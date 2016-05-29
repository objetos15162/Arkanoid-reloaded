import greenfoot.*;
import java.io.*;

/**
 * Write a description of class Archivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archivo extends Actor
{
    //private int arr[]={0,0,0,0,0,0};
    /**
     * Metodo que se encarga de leer el archivo
     */
    public int leeArchivo(String arch)
    {
        File archivo;
        BufferedReader lector;
        int a=0;
        try
        {
            archivo = new File(arch);
            lector = new BufferedReader(new FileReader(archivo));
            //for (int i=0;i<5;i++)
            //{
                a=Integer.parseInt(lector.readLine());
            //}
            lector.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        return a;
    }
    
    /**
     *Metodo que se encarga de guardar el archivo 
     */
    public void guardaArchivo(String arch,int puntos)
    {
        File archivo;
        //ordenaRecords(puntos);
        BufferedWriter escritor;
        try
        {
            archivo = new File(arch);
            escritor = new BufferedWriter(new FileWriter(archivo));
            //for(int i=0;i<6;i++)
            //{
                escritor.write(Integer.toString(puntos));
             //}
            escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
    /**
     *Metodo que se encarga de comparar si el puntaje que se ha hecho es mayor al highscore 
     */
    public void comparaPuntaje(int punt)
    {
        int a=leeArchivo("Records.txt");
        if(punt>a)
            guardaArchivo("Records.txt",punt);
    }
    /*
    /**
     *Metodo que se encarga de ordenar los records 
     
    public void ordenaRecords(int puntos)
    {
        int aux=0;
        //arr=leeArchivo("Records.txt");
        arr[5]=puntos;
        for(int i=1;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }            
        }
        
    }
    */
    
    
}

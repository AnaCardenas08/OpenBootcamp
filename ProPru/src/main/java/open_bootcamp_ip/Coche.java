package open_bootcamp_ip;

import com.sun.source.tree.IfTree;

public class Coche
{
    //constructor de la clase coche
    public Coche()
    {

    }

    //set de la clase coche
    public void setnPuertas(int nPuertas)
    {
        this.nPuertas = nPuertas;
    }

    //get de la clase coche
    public int getnPuertas()
    {
        return nPuertas;
    }

    //variable que almancena # de puertas del coche
    private int nPuertas=aumentoPuertas();

    //funcion que aumenta el numero de puertas del coche
    public static int aumentoPuertas()
    {
        int puertas = 0;

        for(int puerta = 0; puerta<=10; puerta++)
        {
            puertas= puerta;
        }
        return puertas;
    }
}

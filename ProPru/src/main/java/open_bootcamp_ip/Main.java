package open_bootcamp_ip;

import java.awt.*;

import static open_bootcamp_ip.Coche.aumentoPuertas;

public class Main
{
    public static void main(String[] args)
        {
            //se llama la funcion suma y se asignan valores
           int res =  suma (5,8,10);

            System.out.println(res);

            //se crea una instancia de la clase coche
            Coche miCoche = new Coche();
            //se añade una puerta al coche
            int puertas =  miCoche.getnPuertas()+1;

            System.out.println(puertas);


        }

        //funcion que hace la suma de 3 variables
        public static int suma(int p1, int p2, int p3)
        {
            int res;

            res = p1+p2+p3;

            return res;


        }

}

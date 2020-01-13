package Abstraccion;

import java.util.*;

public class UsoTallas
{
    enum Talla
    {
        MINI("S"), MEDIANA("M"), GRANDE("G"), EXTRA_GRANDE("XXL");

        private String abreviatura;

        private Talla(String abreviatura)
        {
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura()
        {
            return this.abreviatura;
        }
    }

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Talla: ");
        String tallaUser = entrada.next().toUpperCase();

        Talla talla = Enum.valueOf(Talla.class, tallaUser);

        System.out.println("Talla: " + talla + " Talla abreviada: " +  talla.getAbreviatura());
    }
    
}
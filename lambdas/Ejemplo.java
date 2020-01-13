package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo
{
    public void ordenar()
    {
        List<String> ListNames = new ArrayList<>();

        ListNames.add("Roberto");
        ListNames.add("Eduardo");
        
        //JAVA 7
        // Collections.sort(ListNames, new Comparator<String>()
        // {
        // 	@Override
        // 	public int compare(String nameOne, String nameTwo)
        // 	{
        // 		return nameOne.compareTo(nameTwo);
        // 	}
        // });

        //JAVA 8
        Collections.sort(ListNames, (p1, p2) -> p1.compareTo(p2));
        
        for(String element:ListNames)
        {
            System.out.println(element);
        }

    }

    public void calcular()
    {
        //JAVA 7
        // ICalculadora calculadora = new ICalculadora()
        // {
        //     @Override
        //     public double operacion(double num1, double num2, String movimiento)
        //     {
        //         if(movimiento == "suma")
        //         {
        //             return num1 + num2;
        //         }
        //         else if(movimiento == "resta")
        //         {
        //             return num1 - num2;
        //         }
        //         else if(movimiento == "multiplicacion")
        //         {
        //             return num1 * num2;
        //         }
        //         else if(movimiento == "division")
        //         {
        //             return num1 / num2;
        //         }

        //         return 0;
        //     }
        // };

        // ICalculadora calculadora = (num1,  num2, movimiento) -> 
        // {
        //         if(movimiento == "suma")
        //         {
        //             return num1 + num2;
        //         }
        //         else if(movimiento == "resta")
        //         {
        //             return num1 - num2;
        //         }
        //         else if(movimiento == "multiplicacion")
        //         {
        //             return num1 * num2;
        //         }
        //         else if(movimiento == "division")
        //         {
        //             return num1 / num2;
        //         }

        //         return 0;
        // };
        
    }
    
    public static void main(String[] args) 
    {
        Ejemplo lambda = new Ejemplo();
        lambda.ordenar();
    }
}
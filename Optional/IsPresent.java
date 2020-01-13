package Optional;

import java.util.Optional;

//Gracias a isPresent podemos saber si el valor esta inicializado o no
//False retornara en caso de que el valor no se alla inicializado
//True retornara en caso de que el valor se alla inicializado

public class IsPresent 
{
    public static void main(String[] args)
    {
        IsPresent ispresent = new IsPresent();
        ispresent.isPresent(null);
    }

    public void isPresent(String value)
    {
        Optional<String> op = Optional.ofNullable(value);
        boolean x = op.isPresent();
        System.out.println(x);
    }
}
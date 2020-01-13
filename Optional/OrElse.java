package Optional;

import java.util.Optional;

//Si mandamos al metodo orElse null podemos controlar la excepcion de otra manera utilizando un valor por defecto
//Solo en caso de que el valor que se recibe es nulo
//Si mandamos null se imprime "Predeterminado"
//En caso de que se envie algo el valor que se imprimira sera el valor que se reciba

public class OrElse 
{
    public static void main(String[] args)
    {
        OrElse orelse = new OrElse();
        orelse.orElse(null);
    }

    public void orElse(String value)
    {
        Optional<String> op = Optional.ofNullable(value);
        String x = op.orElse("Predeterminado");
        System.out.println(x);
    }
}
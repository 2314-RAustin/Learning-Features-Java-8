package Optional;

import java.util.Optional;

//orElseThrow nos permitira controlar la excepcion que deseemos mandar al obtener un error
//En este caso por defecto mandaria la Exception java.lang.NullPointerException pero podemos cambiarla
//Y en este caso enviamos otra exception NumberFormatException
//Esto se puede observar al caer en el metodo

public class OrElseThrow
{
    public static void main(String[] args)
    {
        OrElseThrow orelsethrow = new OrElseThrow();
        orelsethrow.orElseThrow(null);
    }

    public void orElseThrow(String value)
    {
        Optional<String> op = Optional.ofNullable(value);
        String x = op.orElseThrow(NumberFormatException::new);
    }
}
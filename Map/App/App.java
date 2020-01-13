package Map.App;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App
{
    private Map<Integer, String> map;

    public void poblar()
    {
        map = new HashMap<>();
        
        map.put(1, "Roberto");
        map.put(2, "Eduardo");
        map.put(3, "Medina");
    }

    //Manera clasica en la version de java 7 se recorria un mapa
    public void imprimir_v7()
    {
        for(Entry<Integer, String> e : map.entrySet())
        {
            System.out.println( "LLave: " + e.getKey() + "  Valor: " + e.getValue() );
        }    
    }

    //Ahora con java 8 podemos imprimir con lambda, metodos referenciados e incluso apoyarnos de un stream
    public void imprimir_v8()
    {
        map.forEach((k,v) -> System.out.println( "LLave: " + k + "  Valor: " + v) );//Lambda
        map.entrySet().stream().forEach( e -> System.out.println( "LLave: " + e.getKey() + "  Valor: " + e.getValue() ) );//Stream con expresion lambda
        map.entrySet().stream().forEach(System.out::println);//Stream con metodos referenciados
    }

    //Despues de a ver filtrado la informacion requerido lo normal es querer tener en un nuevo mapa toda esa informacion
    //Gracias a collect potdemos recolectar esa informacion y regresarla al nuevo mapa
    public void recolectar()
    {
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
            .filter(e -> e.getValue().contains("o"))
            .collect(Collectors.toMap( p -> p.getKey(), p -> p.getValue() ));

        mapaRecolectado.forEach((k,v) -> System.out.println( "LLave: " + k + "  Valor: " + v ));
    }

    //En el caso de que no exista la llave del mapa se agregara
    //Nota: este metodo no sustituye informacion (Para sustituir podemos usar el put)
    public void insertarSiAusente()
    {
        map.putIfAbsent(4, "Austin");
    }

    //En el caso de que exista un valor dentro del mapa podemos hacer ciertas funciones como concatenarlas como por ejemplo
    public void operarSiPresente()
    {
        map.computeIfPresent(3, (k,v) -> k + v );
        System.out.println(map.get(3));
    }

    //Si no existe la llave de cierto mapa podemos utilizar cierto valor por defecto y agregarlo a ese mapa
    public void obtenerOrPredeterminado()
    {
        String valor = map.getOrDefault(5, "Valor por defecto");
        System.out.println(valor);
    }

    public static void main(String[] args)
    {
        
    }
}
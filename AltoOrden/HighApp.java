package AltoOrden;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp
{
    private Function<String, String> upperCase = x -> x.toUpperCase();
    private Function<String, String> lowerCase = x -> x.toLowerCase();

    public void imprimri(Function<String, String> function, String valor)
    {
        System.out.println( function.apply(valor) );
    }

    public Function<String, String> mostrar(String mensaje)
    {
        return (String x) -> mensaje + x;
    }

    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena)
    {
        lista.stream()
            .filter(this.establecerLogicaFiltro(longitud))
            .forEach(consumidor);

        lista.stream()
            .filter(this.establecerLogicaFiltro(cadena))
            .forEach(consumidor);

    }

    public Predicate<String> establecerLogicaFiltro(String cadena)
    {
        return texto -> texto.contains(cadena);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud)
    {
        return texto -> texto.length() < longitud;
    }

    public static void main(String[] args)
    {
        HighApp app = new HighApp();
        // app.imprimri(app.upperCase, "valor");
        // app.imprimri(app.lowerCase, "VALOR");

        // System.out.println( app.mostrar("Hola ").apply("Roberto") );

        List<String> lista = new ArrayList<>();
        lista.add("Roberto");
        lista.add("Eduardo");
        lista.add("Medina");
        lista.add("Austin");

        app.filtrar(lista, System.out::println, 7, "");
        // app.filtrar(lista, System.out::println, 0, "Roberto");
    }
}
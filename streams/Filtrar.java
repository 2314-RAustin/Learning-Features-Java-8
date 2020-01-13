package streams;

import java.util.ArrayList;
import java.util.List;

public class Filtrar
{
    private List<String> lista;
    private List<String> numeros;

    public Filtrar()
    {
        lista = new ArrayList<>();
        lista.add("Roberto");
        lista.add("Eduardo");
        lista.add("Medina");
        lista.add("Austin");

        numeros = new ArrayList<>();
        numeros.add("0");
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
    }

    public static void main(String[] args)
    {
        Filtrar app = new Filtrar();
        app.filtrar();    
    }

    //Filtramos por los que empiezan con M y los itereamos para mostrarlos por pantalla con metodos referenciados
    public void filtrar()
    {
        lista.stream()
            .filter(x -> x.startsWith("M"))
            // .forEach(x -> System.out.println(x))//Tambien podemos utilizar lambdas
            .forEach(System.out::println);
    }
}
package streams;

import java.util.ArrayList;
import java.util.List;

public class Transformar
{
    private List<String> lista;
    private List<String> numeros;

    public Transformar()
    {
        lista = new ArrayList<>();
        lista.add("Roberto");
        lista.add("Eduardo");
        lista.add("Medina");
        lista.add("Austin");

        numeros = new ArrayList<>();
        numeros.add("2");
        numeros.add("4");
        numeros.add("6");
        numeros.add("8");
        numeros.add("10");
        numeros.add("12");
        numeros.add("14");
        numeros.add("16");
        numeros.add("18");
        numeros.add("20");
    }

    public static void main(String[] args)
    {
        Transformar app = new Transformar();
        app.transformar();    
    }

    public void transformar()
    {
        lista.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        numeros.stream()
            .map(x -> Integer.parseInt(x) * 2)
            .forEach(System.out::println);
    }
}
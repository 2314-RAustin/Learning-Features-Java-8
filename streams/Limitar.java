package streams;

import java.util.ArrayList;
import java.util.List;

public class Limitar
{
    private List<String> lista;
    private List<String> numeros;

    public Limitar()
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
        Limitar app = new Limitar();
        app.limitar();    
    }

    public void limitar()
    {
        lista.stream()
            .limit(2)
            .forEach(System.out::println);
    }

}
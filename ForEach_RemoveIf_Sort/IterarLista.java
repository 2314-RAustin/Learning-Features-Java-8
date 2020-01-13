package ForEach_RemoveIf_Sort;

import java.util.ArrayList;
import java.util.List;

public class IterarLista
{
    private List<String> lista;

    public static void main(String[] args)
    {
        IterarLista app = new IterarLista();
        app.llenarLista(); 
        app.for_Each();
    }

    public void llenarLista()
    {
        this.lista = new ArrayList<>();

        this.lista.add("Roberto");
        this.lista.add("Eduardo");
        this.lista.add("Medina");
        this.lista.add("Austin");
    }

    public void for_Each()
    {
        // Iteracion con for each tradicional
        System.out.println("for clasico (:)");
        for(String element : this.lista)
        {
            System.out.println(element);
        }

        // Iteracion funcion flecha
        System.out.println("for lambda (->)");
        lista.forEach(element -> System.out.println(element));

        // Iteracion referencia a metodos
        System.out.println("for references methods (::)");
        lista.forEach(System.out::println);
    }
}
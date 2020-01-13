package ForEach_RemoveIf_Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveLista
{
    private List<String> lista;

    public static void main(String[] args)
    {
        RemoveLista app = new RemoveLista();
        app.llenarLista();  
        app.remove_if();
    }

    public void llenarLista()
    {
        this.lista = new ArrayList<>();

        this.lista.add("Roberto");
        this.lista.add("Eduardo");
        this.lista.add("Medina");
        this.lista.add("Austin");
    }

    public void remove_if()
    {
        //Iteracion y eliminacion de un elemento de la this.lista
        //Clasica 
        Iterator<String> it = this.lista.iterator();
        while(it.hasNext())
        {
            if(it.next().equalsIgnoreCase("Roberto"))
            {
                it.remove();
            }
        }

        //Funcion Flecha
        this.lista.removeIf(x -> x.equalsIgnoreCase("Roberto"));

        //Metodos referenciados
        this.lista.removeIf("Roberto"::equalsIgnoreCase);
    }
}
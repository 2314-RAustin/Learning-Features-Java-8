package ForEach_RemoveIf_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class OrdenLista
{
    private List<String> lista;

    public static void main(String[] args)
    {
        OrdenLista app = new OrdenLista();
        app.llenarLista();  
        app.sort_list();
    }

    public void llenarLista()
    {
        this.lista = new ArrayList<>();

        this.lista.add("Roberto");
        this.lista.add("Eduardo");
        this.lista.add("Medina");
        this.lista.add("Austin");
    }

    public void sort_list()
    {
        //Orden de una this.lista de tareas de manera tradicional
        Collections.sort(this.lista, new Comparator<String>()
        {
        	@Override
        	public int compare(String x, String y)
        	{
        		return x.compareTo(y);
        	}
        });

        //Orden con funcion flecha o expresion lambda
        this.lista.sort((x,y) -> x.compareTo(y));

        //Orden con metodos referenciados
        this.lista.sort(String::compareTo);
        System.out.println(this.lista);
    }
}
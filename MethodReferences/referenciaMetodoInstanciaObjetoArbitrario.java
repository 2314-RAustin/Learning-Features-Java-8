package MethodReferences;

import java.util.Arrays;
import java.util.Comparator;

public class referenciaMetodoInstanciaObjetoArbitrario
{
	public static void main(String[] args)
	{
		referenciaMetodoInstanciaObjetoArbitrario app = new referenciaMetodoInstanciaObjetoArbitrario();
		app.referenciarMetodoInstanciaObjetoArbitrario();
	}

    public void referenciarMetodoInstanciaObjetoArbitrario()
	{
		String[] nombres = {"Roberto", "Eduardo", "Medina", "Austin"};

        //Llamado a metodos de la clase que se importan Arrays, y comparator

        //Manera clasica o tradicional
		Arrays.sort(nombres, new Comparator<String>()
		{
			@Override
			public int compare(String name1, String name2)
			{
				return name1.compareToIgnoreCase(name2);
			}
        });
        System.out.println(nombres);
        
        //Funcion Flecha o expresion Lambda
        Arrays.sort(nombres, (name1, name2) -> name1.compareToIgnoreCase(name2));
        System.out.println(nombres);

        //Metodos de referencia ::
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
	}
}
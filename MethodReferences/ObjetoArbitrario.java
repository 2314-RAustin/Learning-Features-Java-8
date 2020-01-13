package MethodReferences;

import java.util.Arrays;
import java.util.Comparator;

public class ObjetoArbitrario 
{
    public void referenciarMetodoInstanciaObjetoArbitrario()
	{
		String[] nombres = {"Roberto", "Eduardo", "Medina", "Austin"};

		Arrays.sort(nombres, new Comparator<String>()
		{
			@Override
			public int compare(String strNameOne, String strNameTwo)
			{
				return strNameOne.compareToIgnoreCase(strNameTwo);
			}
		});
		
		System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, (strNameOne, strNameTwo) -> strNameOne.compareToIgnoreCase(strNameTwo) );
		System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
    }
}
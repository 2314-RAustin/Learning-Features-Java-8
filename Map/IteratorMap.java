package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class IteratorMap 
{
    Map<Integer, String> hashMap = new HashMap<Integer, String>();
    public static void main(String[] args)
    {
		IteratorMap app = new IteratorMap();
		app.creaInfo();
		app.iteraMap();
	}

	public void creaInfo()
	{
		hashMap.put(1, "Casillas");
		hashMap.put(15, "Ramos");
		hashMap.put(3, "Pique");
		hashMap.put(5, "Puyol");
		hashMap.put(11, "Capdevila");
		hashMap.put(14, "Xabi Alonso");
		hashMap.put(16, "Busquets");
		hashMap.put(8, "Xavi Hernandez");
		hashMap.put(18, "Pedrito");
		hashMap.put(6, "Iniesta");
		hashMap.put(7, "Villa");
	}

	public void iteraMap()
	{
		Iterator <Integer> it = hashMap.keySet().iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println("Clave: " + key + " -> Valor: " + hashMap.get(key));
		}
	}
}

/**
 * 
 * Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
 * Map<Integer, String> nombreMap = new HashMap<Integer, String>();
 * nombreMap.size(); // Devuelve el numero de elementos del Map
 * nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
 * nombreMap.put(K clave, V valor); // Añade un elemento al Map
 * nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
 * nombreMap.clear(); // Borra todos los componentes del Map
 * nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
 * nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
 * nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
 * nombreMap.values(); // Devuelve una "Collection" con los valores del Map
 * 
 * Existen diferentes tipos de mapas
 * 
 * - HashMap: Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos. 
 * 
 * - TreeMap: El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros, los ordena de menos a mayor.
 * 
 * - LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando; es decir, que no tiene una ordenación de los elementos como tal, por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases. 
 * 
 * 
 */
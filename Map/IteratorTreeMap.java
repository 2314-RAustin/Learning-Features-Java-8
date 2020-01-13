package Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class IteratorTreeMap 
{
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    public static void main(String[] args)
    {
		IteratorTreeMap app = new IteratorTreeMap();
        app.creaInfo();
        app.iterarTreeMap();
	}

	public void creaInfo()
	{
		treeMap.put(1, "Casillas");
		treeMap.put(15, "Ramos");
		treeMap.put(3, "Pique");
		treeMap.put(5, "Puyol");
		treeMap.put(11, "Capdevila");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(16, "Busquets");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(18, "Pedrito");
		treeMap.put(6, "Iniesta");
		treeMap.put(7, "Villa");
	}

	public void iterarTreeMap()
	{
        Iterator <Integer> it = treeMap.keySet().iterator();

        while(it.hasNext())
        {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }
	}
}
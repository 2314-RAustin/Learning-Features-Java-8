package Map;

import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class IteratorLinkedHashMap 
{
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    public static void main(String[] args)
    {
		IteratorLinkedHashMap app = new IteratorLinkedHashMap();
        app.creaInfo();
        app.iteraTreeMap();
	}

	public void creaInfo()
	{
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(16, "Busquets");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(6, "Iniesta");
		linkedHashMap.put(7, "Villa");
	}

	public void iteraTreeMap()
	{
        Iterator <Integer> it = linkedHashMap.keySet().iterator();

        while(it.hasNext())
        {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
	}
}
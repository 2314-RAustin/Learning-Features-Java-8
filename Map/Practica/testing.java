package Map.Practica;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class testing
{
    public static void main(String[] args)
    {
        System.out.println("********* TreeMap con Objetos y como Clave un String *********");
        Map <String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();
        jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
        jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
        jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
        jugadores.put("Capdevila", new JugadorSeleccion(11, "Capdevila", "Lateral Izquierdo"));
        jugadores.put("Xabi", new JugadorSeleccion(14, "Xabi Alonso", "Medio Centro"));
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
        jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi Hernandez", "Centro Campista"));
        jugadores.put("Pedrito", new JugadorSeleccion(18, "Pedrito", "Interior Izquierdo"));
        jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "Interior Derecho"));
        jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "Delantero"));

        for (Entry<String, JugadorSeleccion> jugador : jugadores.entrySet())
        {
            String clave = jugador.getKey();
            JugadorSeleccion valor = jugador.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }
    }    
}
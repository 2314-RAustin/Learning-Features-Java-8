package StreamAsync;

import java.util.ArrayList;
import java.util.List;

//Los procesos asincronos deben de ser poco utlilizados en grandes magnitudes de informacion debido a que no es recomendado
//stream trabaja de manera funcional paso a paso y por orden
//parallelStream trabaja de manera asyncrona donde tranaja constantemente con la informacion

/*Ahi que saber cuando utilizar estos procesos debido a que puede romper el software*/

public class ParallelStream
{
    private List<Integer> numeros;

    public static void main(String[] args)
    {
        ParallelStream app = new ParallelStream();
        app.llenar();
        app.streamSync();
        app.streamAsync();
    }

    public void llenar()
    {
        this.numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            numeros.add(i);
        }
    }

    public void streamAsync()
    {
        numeros.parallelStream().forEach(System.out::println);
    }

    public void streamSync()
    {
        numeros.stream().forEach(System.out::println);
    }
}
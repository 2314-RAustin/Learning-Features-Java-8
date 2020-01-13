package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream 
{
    public static boolean isNotEmpty(String text)
    {
        return !text.equals("") ? true : false;
    }

    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Roberto");
        list.add("Eduardo");
        list.add("Medina");
        list.add("Austin");
        list.add("Mdjskfiosdjfoidfjgiodfja");

        List<String> listNew = new ArrayList<>();

        listNew = list.stream()
            .filter(s -> s.startsWith("M") || s.endsWith("o") )

            // .filter(stream::isNotEmpty
            // .forEach(s -> System.out.println(s))
            .collect(Collectors.toList());
            

        System.out.println(listNew);
               
    }
}
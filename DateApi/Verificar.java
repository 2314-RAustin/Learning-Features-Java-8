package DateApi;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Verificar
{
    public void verificar(int version)
    {
        if(version == 7)
        {
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();

            fecha1.set(1991, 0, 21);
            System.out.println(fecha1.after(fecha2));
        }
        else if(version == 8)
        {
            LocalDate fecha1 = LocalDate.of(1991, 01, 21);
            LocalDate fecha2 = LocalDate.now();
            System.out.println(fecha1.isAfter(fecha2));
            System.out.println(fecha1.isBefore(fecha2));

            LocalTime tiempo1 = LocalTime.of(23, 10, 11);
            LocalTime tiempo2 = LocalTime.now();
            System.out.println(tiempo1.isAfter(tiempo2));
            System.out.println(tiempo1.isBefore(tiempo2));

            LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 01, 21, 23, 10, 11);
            LocalDateTime fechaTiempo2 = LocalDateTime.now();
            System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
            System.out.println(fechaTiempo1.isBefore(fechaTiempo2));
        }
    }

    public static void main(String[] args)
    {
        Verificar app = new Verificar();
        
        try 
        {
            app.verificar(8);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
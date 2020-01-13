package DateApi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Convertir
{
    public void convertir(int version) throws ParseException
    {
        if(version == 7)
        {
            String fecha = "21/01/1991";
            DateFormat formateador = new SimpleDateFormat("dd//MM/yyyy");
            Date fechaConvertida = formateador.parse(fecha);
            System.out.println(fechaConvertida);

            Date fechaActual = Calendar.getInstance().getTime();
            formateador = new SimpleDateFormat("dd//MM/yyyy HH:mm:ss a");
            String fechaCadena = formateador.format(fechaActual);
            System.out.println(fechaCadena);
        }
        else if(version == 8)
        {
            String fecha = "21/01/1991";
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
            System.out.println(fechaLocal);

            // formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.println(formateador.format(fechaLocal));
        }
    }

    public static void main(String[] args)
    {
        Convertir app = new Convertir();
        
        try 
        {
            
            app.convertir(8);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
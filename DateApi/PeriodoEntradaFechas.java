package DateApi;

import java.time.Period;
import java.time.LocalDate;
import java.util.Calendar;

public class PeriodoEntradaFechas
{

    public void periodoEntradaFechas(int version)
    {
        if(version == 7)
        {
            Calendar nacimiento =  Calendar.getInstance();
            Calendar actual = Calendar.getInstance();

            nacimiento.set(1991, 0, 21);
            actual.set(2017, 1, 04);

            int anios = 45;

            while(nacimiento.before(actual))
            {
                nacimiento.add(Calendar.YEAR, 1);
                if(nacimiento.before(actual))
                {
                    anios++;
                }
            }

            System.out.println(anios);
        }
        else if(version == 8)
        {
            LocalDate nacimiento = LocalDate.of(1991, 1, 21);
            LocalDate actual = LocalDate.now();

            Period periodo = Period.between(nacimiento, actual);

            System.out.println("Han transcurrido " 
            + periodo.getYears() + " años, "
            + periodo.getMonths() + " meses, y " 
            + periodo.getDays() + " dias "
            + "desde " + nacimiento
            + " hasta " + actual);
        }
    }

    public static void main(String[] args)
    {
        PeriodoEntradaFechas app = new PeriodoEntradaFechas();
        
        try 
        {
            app.periodoEntradaFechas(8);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
package DateApi;

import java.time.Duration;
import java.time.Instant;

public class MedirTiempo
{
    public void medirTiempo(int version) throws InterruptedException
    {
        if(version == 7)
        {
            long ini = System.currentTimeMillis();
            Thread.sleep(1000);
            long fin = System.currentTimeMillis();
            System.out.println(fin - ini);
        }
        else if(version == 8)
        {
            Instant ini = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(ini, fin));
            System.out.println(Duration.between(ini, fin).toDays() );
            System.out.println(Duration.between(ini, fin).toHours() );
            System.out.println(Duration.between(ini, fin).toMillis() );
            System.out.println(Duration.between(ini, fin).toMinutes() );
            System.out.println(Duration.between(ini, fin).toNanos() );
        }
    }

    public static void main(String[] args)
    {
        MedirTiempo app = new MedirTiempo();
        
        try 
        {
            app.medirTiempo(8);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
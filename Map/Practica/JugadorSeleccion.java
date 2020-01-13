package Map.Practica;

public class JugadorSeleccion
{
    private int dorsal;    
    private String name;
    private String demarcacion;

    public JugadorSeleccion(){}

    public JugadorSeleccion(int dorsal, String name, String demarcacion)
    {
        this.dorsal = dorsal;
        this.name = name;
        this.demarcacion = demarcacion;
    }

    public int getDorsal()
    {
        return this.dorsal;
    }

    public void setDorsal(int dorsal)
    {
        dorsal = this.dorsal;
    }

    public String getname()
    {
        return this.name;
    }

    public void setDorsal(String name)
    {
        name = this.name;
    }

    public String getDemarcacion()
    {
        return this.demarcacion;
    }

    public void setDemarcacion(String demarcacion)
    {
        demarcacion = this.demarcacion;
    }

    @Override
    public String toString()
    {
        return this.dorsal + "  --  " + this.name + "  --  " + this.demarcacion;

    }
}
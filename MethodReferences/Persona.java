package MethodReferences;

public class Persona
{
    private int id;
    private String nombre;
    
    Persona(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void getNombre(String nombre)
    {
        this.nombre =  nombre;
    }

    @Override
    public String toString()
    {
        return "ID: " + this.id + " Nombre: " + nombre;
    }
}
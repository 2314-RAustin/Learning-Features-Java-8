package Java8;

public class Employee 
{
    int edad;
    String nombre;
    String fechaIngreso;
    String fechaSalida;
    String departamento;
    
    public Employee(){}

    public Employee(int edad, String nombre, String fechaIngreso, String fechaSalida, String departamento)
    {
        this.edad = edad;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.departamento = departamento;
    }
}
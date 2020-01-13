package MethodReferences;

public class referenciaConstructor
{
    public static void main(String[] args)
    {
        referenciaConstructor app = new referenciaConstructor();
        app.referenciarConstructor();
    }

    public void referenciarConstructor()
    {
        //Manera clasica o tradicional
        IPersona persona = new IPersona()
        {
            @Override
            public Persona crear(int id, String nombre)
            {
                return new Persona(id, nombre);
            }
        };
        Persona per = persona.crear(1, "Roberto");
        System.out.println(per);
        

        //Funcion flecha o expresion lambda
        IPersona persona2 = (x,y) -> (new Persona(x,y));
        Persona per2 = persona2.crear(2, "Eduardo");
        System.out.println(per2);

        //Metodos Referenciados
        IPersona persona3 = Persona::new;
        Persona per3 = persona3.crear(3, "Medina");
        System.out.println(per3);
    }
}
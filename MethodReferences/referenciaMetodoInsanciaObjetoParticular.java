package MethodReferences;

public class referenciaMetodoInsanciaObjetoParticular
{
    public static void main(String[] args)
    {
        referenciaMetodoInsanciaObjetoParticular app = new referenciaMetodoInsanciaObjetoParticular();

        //Manera clasica o tradicianal
        Operacion op1 = new Operacion()
        {
            @Override
            public void saludar(){}
        };
        op1.saludar();

        //Funcion Flecha
        Operacion op2 = () -> app.referenciarMetodoInstanciaObjetoParticular();
        op2.saludar();

        //Metodos referenciados ::
        Operacion op3 = app::referenciarMetodoInstanciaObjetoParticular;
        op3.saludar();
    }

    public void referenciarMetodoInstanciaObjetoParticular()
    {
        System.out.println("Metodo referido Instancia de objeto en particular");
    }
}
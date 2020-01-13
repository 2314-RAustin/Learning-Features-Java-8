package MethodReferences;

/**
 * Los metodos referenciados son una de las caracteristicas que nos ofrece java a partir de su JDK 1.8.
 * Esta caracteristica nos permite hacer referencias a metodos y constructores por medio de una interfaz funcional.
 */
public class referenciarMetodoStatic implements Operacion
{
	public static void main(String[] args)
	{
		referenciarMetodoStatic app = new referenciarMetodoStatic();
		app.operar();
	}

	public void operar()
	{
		//Manera clasica o tradicional
		Operacion op = new Operacion()
		{
			@Override
			public void saludar(){}
		};
		op.saludar();

		//LLAMADO A METODO POR FUNCION FLECHA
		Operacion o = () -> referenciarMetodoStatic.methodStatic();
		o.saludar();
		
		// LLAMADO A METODO POR REFERENCIA DE METODO "::"
		//NOTA LOS LLAMADOS A METODOS POR REFERENCIA NO PUEDEN SER UTLILIZADO PARA RECIBIR PARAMETROS EN JAVA 1.8 POR UN TEMA LLAMADO CURRIFICACION
		Operacion o2 = referenciarMetodoStatic::methodStatic;
		o2.saludar();
	}

	public static void methodStatic()
	{
		System.out.println("");
	}

	@Override
	public void saludar()
	{
		System.out.println("Saludos");
	}

}
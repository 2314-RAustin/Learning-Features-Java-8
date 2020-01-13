package PatronSingleton;

/**
 * principal
 */
public class principal
{
    public static void main(String[] args)
    {
        //DE ESTA MANERA SOLICITAMOS UNA INSTANCIA O REFERENCIA DE LA CLASE SingletonClass
        SingletonClass ref = SingletonClass.getInstance();
        DBConfigSingleton refDB = DBConfigSingleton.getInstance();
        // System.out.println(refDB);

        final Contacts contacto = new Contacts("Roberto", "Medina");
        System.out.println(contacto);
    }
}
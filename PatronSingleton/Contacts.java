package PatronSingleton;


/*REGLAS PARA CLASES INMUTABLES
CLASE FINAL
ATRIBUTOS PRIVATE
ATRIBUTOS FINAL
NO SETTERS
UN CONSTRUCTOR PARA TODOS LOS ATRIBUTOS
OBJETO INSTANCIADO COMO FINAL
*/

public final class Contacts
{
    private final String firstName;
    private final String lastName;

    public Contacts(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return "firstName: " + firstName + " " + "lastName: " + lastName;
    }
}
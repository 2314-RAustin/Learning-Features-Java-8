package Java8;
import static java.lang.Math.*;

public class Principal
{
    static int i;
    int j;

    static
    {
        i = 10;
        System.out.println("Static block called");
    }

    {
        System.out.println("no static block called");
    }

    public void treeCompany()
    {
        Director d = new Director();
        Manager m = new Manager();
        Employee e = m;
        m = d;

        Employee em = new Manager(5, "Pedro", "24/04/1612", "9/2099", "Sistemas");

        Manager ma = (Manager) em;
    }

    public static void main(String[] args)
    {
        Principal p = new Principal();
        System.out.println(Principal.i);
        double resultado =  pow(2,2);
    }
}
package PatronSingleton;

/**
 * SingletonClass
 */
public class SingletonClass 
{
    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance()
    {
        return instance;
    }

    public static void main(String[] args)
    {
        System.out.println(instance);
    }
}
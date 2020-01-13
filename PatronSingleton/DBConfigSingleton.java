package PatronSingleton;

public final class DBConfigSingleton
{
    private final String hostName;
    private final String dbName;

    private static final DBConfigSingleton instance = new DBConfigSingleton();

    private DBConfigSingleton()
    {
        this.hostName = "dbhost.example.com";
        this.dbName = "dbhost";
    }

    public static DBConfigSingleton getInstance()
    {
        return instance;
    }
}   
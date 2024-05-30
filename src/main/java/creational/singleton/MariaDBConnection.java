package creational.singleton;

public class MariaDBConnection {

    private String host;
    private String port;
    private String database;
    private String userName;
    private String password;

    public static MariaDBConnection mariaDBConnection;

    private MariaDBConnection() {
        this.host = System.getProperty("host");
        this.port = System.getProperty("port");
        this.database = System.getProperty("database");
        this.userName = System.getProperty("username");
        this.password = System.getProperty("password");

    }

    public static MariaDBConnection getConnection(){
        if (mariaDBConnection == null){
            mariaDBConnection = new MariaDBConnection();
        }
        return mariaDBConnection;
    }

    public boolean connectToDB(){
        // code for DB connection
        return false;
    }


}

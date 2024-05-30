package creational.singleton;

public class SingletonSample {

    /**
     * Run the program with -D params
     * Eg: -Dhost="localhost" -Dport="8080" -Ddatabase="singleton" -Dusername="saihari98" -Dpassword="saihari98"
     * @param args - arguments to the main function
     */
    public static void main(String[] args) {
        MariaDBConnection dbConnection = MariaDBConnection.getConnection();
        System.out.print("DB Connection 1: ");
        System.out.println(dbConnection);
        MariaDBConnection secondDBConnection = MariaDBConnection.getConnection();
        System.out.print("DB Connection 2: ");
        System.out.println(secondDBConnection);
    }
}

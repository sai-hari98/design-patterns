package creational.singleton;

public class Main {

    /**
     * Run the program with -D params
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

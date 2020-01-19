package ua.com.alevel.classworks.lesson11.enums.singleton;

public class DatabaseConnection {
    static private DbStates state = DbStates.IDLE;

    private DatabaseConnection(){
        this.state = DbStates.ACTIVE;
    }

    public static DatabaseConnection getInstance(){

        return new DatabaseConnection();

    }
}

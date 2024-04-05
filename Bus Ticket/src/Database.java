import java.util.ArrayList;

public class Database {

    private static ArrayList<User> users = new ArrayList<>();

    private Database(){

    }

    private static Database instance;

    public static  Database getInstance(){
        if(instance == null) instance = new Database();

        return instance;
    }

    public static ArrayList<User> getUsers(){
        return users;
    }
    public static void setUsers(User user){
        users.add(user);
    }


}

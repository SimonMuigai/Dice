import java.util.ArrayList;

public class User {

    private String First_name;
    private String  Second_Name;
    private int phone_number;
    private String email;
    private int Id_Number;

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getSecond_Name() {
        return Second_Name;
    }

    public void setSecond_Name(String second_Name) {
        Second_Name = second_Name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_Number() {
        return Id_Number;
    }

    public void setId_Number(int id_Number) {
        Id_Number = id_Number;
    }
}

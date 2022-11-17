package  Client;

public class UserInfo {
    private int id;
    private String FirstName;
    private String LastName;
    private String Username;
    private int Password;

    public UserInfo(int id, String FirstName, String LastName, String Username, int Password) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Username = Username;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUsername() {
        return Username;
    }

    public int getPassword() {
        return Password;
    }
}
package restraurantPkg;
@SuppressWarnings("unused")
enum USER_TYPE {
    ADMINISTRATOR,
    OTHER
}

enum UNIT {
    KG,
    LITER,
    PIECE
}

public class User {
    private String username;
    private String password;
    private USER_TYPE userType;

    public User() {
        // Default constructor --> ADDED CHANGE IN UML
    }

    public boolean authenticate() {
        // Logic for user authentication
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public USER_TYPE getUserType() {
        return userType;
    }

    public void setUserType(USER_TYPE userType) {
        this.userType = userType;
    }
}

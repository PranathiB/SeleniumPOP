package models;

public class UserLoginDetails {
    public static UserLoginDetails INVALID_USER_DETAILS = new UserLoginDetails("invalid.user@gmail.com", "invalid-password");

    private String emailAddress;
    private String password;

    public UserLoginDetails(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmail() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

}

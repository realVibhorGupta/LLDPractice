package splitwise.model;

public class User {

    private int userId;
    private String username;
    private String email;
    private int mobileNumber;

    public User(int userId, String username, String email, int mobileNumber) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.mobileNumber=mobileNumber;

    }

    public int getUserId(){
        return  userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}



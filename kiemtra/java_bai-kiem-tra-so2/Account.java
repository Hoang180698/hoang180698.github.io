import java.util.Set;

public class Account {
   
    private String userName;
    private String password;
    private String email;
    public Account(){
        
    }
    public Account(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "user: " +userName +"    pass: " +password +"   email: " +email;
    }
    // erwerwerwe
   
}

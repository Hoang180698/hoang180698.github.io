import java.util.Set;
import java.util.regex.Pattern;

public class Model {
    public boolean hasUsername(Set<Account> aSet, String username){
        boolean hasUsername = false;
        for (Account acc : aSet){
            if (acc.getUserName().equals(username)){
                hasUsername = true;
                break;
            }
        }
        return hasUsername;
        
    }
    public boolean hasEmail(Set<Account> aSet, String email){
        boolean hasEmail = false;
        for (Account acc : aSet){
            if (acc.getEmail().equals(email)){
                hasEmail = true;
                break;
            }
        }
        return hasEmail;
    }
    public boolean trueEmail(String email){
//         Định nghĩa email:
//         - Bắt đầu bằng chữ cái.
//         - Chỉ chứa chữ cái, chữ số và dấu gạch ngang (-).
//         - Chứa một ký tự @, sau @ là tên miền.
//         - Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.
        String EMAIL_PATTERN = "[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})";
        return Pattern.matches(EMAIL_PATTERN, email);
    }
    public boolean truePassword(String password){
        // password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)
        String PASS_PATTERN = "(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,15}";
        return Pattern.matches(PASS_PATTERN, password);
    }
    public boolean isAcc(Set<Account> accounts, Account acc){
        boolean isAccount = false;
        for (Account a : accounts) {
            if (a.getUserName().equals(acc.getUserName()) && a.getPassword().equals(acc.getPassword())){
                isAccount = true;
                break;
            }
        }
        return isAccount;
    }

    
}

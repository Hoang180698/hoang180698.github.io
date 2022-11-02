import java.util.HashSet;
import java.util.Set;

public class _929_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            local = local.split("\\+")[0];
            local = local.replace(".", "");
            set.add(local + email.substring(i));
            
        }
        return set.size();
    }
}

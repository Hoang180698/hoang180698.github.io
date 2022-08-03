import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        String phone = scanner.nextLine();
//         Định nghĩa email:
//         - Bắt đầu bằng chữ cái.
//         - Chỉ chứa chữ cái, chữ số và dấu gạch ngang (-).
//         - Chứa một ký tự @, sau @ là tên miền.
//         - Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.
        String EMAIL_PATTERN = "[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})";
//          Số điện thoại có chứa từ 9 đến 11 chữ số
        String PHONE_PATTERN = "\\d{9,11}";
        System.out.println("Email có hợp lệ: " + Pattern.matches(EMAIL_PATTERN, email) );
        System.out.println("SĐT có hợp lệ: " + Pattern.matches(PHONE_PATTERN, phone));
        scanner.close();
        
    }
}

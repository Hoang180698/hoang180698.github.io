import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("hoang180698", "Hoang_1998", "hoang180698@gmail.com");
        Account acc2 = new Account("cong123", "Abcd_1234", "cong123@gmail.com");
        Set<Account> accounts = new HashSet<>();
        Model model = new Model();
        accounts.add(acc1);
        accounts.add(acc2);
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        while (true){
         view.display1();
         int op1 = scanner.nextInt();
         scanner.nextLine();
         switch (op1) {
            // case 1 Đăng nhập
            case 1 : {
                System.out.println("Nhap username: ");            
                String user = scanner.nextLine();
                System.out.println("Nhap password: ");
                String pass = scanner.nextLine();
                Account acc = new Account();
                acc.setUserName(user);
                acc.setPassword(pass);
                if ( model.isAcc(accounts, acc)){
                    for (Account ac : accounts) {
                        if (ac.getUserName().equals(acc.getUserName())){
                            acc = ac;
                        }
                    }
                    boolean isQuit = true;
                    while (isQuit){
                    view.display3(acc);
                    int op2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (op2) {
                        // Thay đổi username
                        case 1 :{
                            System.out.println("Nhập username mới:");
                            String newUsername = scanner.nextLine();

                            // Kiểm tra điều kiện username... chưa làm

                            for (Account ac1 : accounts){
                                if (ac1.getEmail().equals(acc.getEmail())){
                                    ac1.setUserName(newUsername);
                                }
                            }
                            acc.setEmail(newUsername);
                            System.out.println("Thay đổi username thành công!!!");
                            System.out.println("Thông tin mới của bạn:");
                            System.out.println(acc.toString());
                            break;
                        }
                        // thay đổi email
                        case 2 : {
                            System.out.println("Nhập email mới:");
                            String newEmail = scanner.nextLine();

                            // Kiểm tra điều kiện email.... chưa làm

                            for (Account ac1 : accounts){
                                if (ac1.getUserName().equals(acc.getUserName())){
                                    ac1.setEmail(newEmail);
                                }
                            }
                            acc.setEmail(newEmail);
                            System.out.println("Thay đổi email thành công!!!");
                            System.out.println("Thông tin mới của bạn:");
                            System.out.println(acc.toString());
                            break;
                        }
                        // thay đổi pass
                        case 3 : {
                            System.out.println("Nhập mật khẩu mới:");
                            String newPass = scanner.nextLine();

                            // Kiểm tra điều kiện pass.... chưa làm

                            for (Account ac1 : accounts){
                                if (ac1.getEmail().equals(acc.getEmail())){
                                    ac1.setUserName(newPass);
                                }
                            }
                            acc.setPassword(newPass);
                            System.out.println("Thay đổi pass thành công!!!");
                            System.out.println("Thông tin mới của bạn:");
                            System.out.println(acc.toString());
                            break;
                        }
                        // đăng xuất
                        case 4 : {
                            isQuit = false;
                            break;
                        }
                        // Thoát
                        case 0 : {
                            System.out.println("Good bye");
                            scanner.close();
                            break;
                        }
                        default : break;
                    }
                }
                } else {
                    // Sai mật khẩu
                    int count = 0;
                    Account trueAcc = new Account();
                    for (Account a : accounts){                      
                        if (a.getUserName().equals(acc.getUserName())){
                            trueAcc = a;
                            System.out.println("Sai mật khẩu");
                            view.display2();
                            int op3 = scanner.nextInt();
                            scanner.nextLine();
                            count++;
                            switch (op3) {
                                // Đăng nhập lại
                                case 1 : {
                                    break;
                                }
                                // quên mật khẩu
                                case 2 : {
                                    System.out.println("nhập email của bạn: ");
                                    String emailA = scanner.nextLine();
                                    if (trueAcc.getEmail().equals(emailA)){
                                        System.out.println("Nhập pass mới: ");
                                        String newPass = scanner.nextLine();

                                        // kiểm tra điều kiện pass.... chưa làm

                                        a.setPassword(newPass);
                                        System.out.println("thay đổi pass thành công");
                                        break;
                                    } else {
                                        System.out.println("Chưa tồn tại tài khoản");
                                        break;
                                    }

                                }
                                default : break;
                            }
                        } 
                       
                    }
                    // Sai userName
                    if (count == 0){
                        System.out.println("Kiểm tra lại username");
                        break;
                    }
                    
                }
                             
            }
            // case 2 Đăng ký 1 tài khoản
            case 2 : { 
                System.out.println("Nhập username: ");
                String myUsername = scanner.nextLine();
                System.out.println("Nhập password: ");
                String myPassword = scanner.nextLine();
                System.out.println("Nhập email: ");
                String myEmail = scanner.nextLine();

                // Kiểm tra điều kiện.... chưa làm :))))

                accounts.add(new Account(myUsername, myPassword, myEmail));
                System.out.println("Đăng ký thành công: ");
                break;


            }
            default : break;
        }
    }
        
        
    }
}
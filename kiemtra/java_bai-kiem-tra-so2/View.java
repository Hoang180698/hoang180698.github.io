public class View {

    public void display1() {
        System.out.println("Chọn option (1 or 2): ");
        System.out.println("1- Đăng nhập");
        System.out.println("2- Đăng ký");
    }
    public void display2() {
        System.out.println("Chọn tác vụ (1 or 2): ");
        System.out.println("1- Đăng nhập lại");
        System.out.println("2- Quên mật khẩu");
    }
    public void display3(Account acc) {
        System.out.println("\nWelcome " +acc.getUserName());
        System.out.println("Chọn một menu(0-4): ");
        System.out.println("1- Thay đổi username");
        System.out.println("2- Thay đổi email");
        System.out.println("3- Thay đổi mật khẩu");
        System.out.println("4- Đăng xuất");
        System.out.println("0- Thoát chương trình");
    }
}

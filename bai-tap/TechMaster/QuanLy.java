public class QuanLy {
    private String name;
    private String phoneNumber;
    private String email;

    public QuanLy(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void printQuanLy(){
        System.out.println(name +"   email: " +email +"   Sdt: " +phoneNumber );
                          
    }

}

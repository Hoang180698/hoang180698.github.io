import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class User{
    
    protected String id;
    protected String name;
    protected Gender gender;
    protected LocalDate birthday;
    protected String email;
    protected String phoneNumber;

    public User(String id, String name, Gender gender, String birthday, String email, String phoneNumber){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(birthday, formatter);
        this.birthday = birth;
    }

    public String getName(){
        return this.name;
    }
    public boolean hasKeyword(String keyword){
        return (this.name.contains(keyword) || this.email.contains(keyword) || this.phoneNumber.contains(keyword));
    }
    // Viết hàm printInfo để in thông tin cho lớp User
    public void printInfo(){
        System.out.print(this.id +": " +this.name +"   Birthday: " +birthday.toString() +"    Gender: "+this.gender +"   Email: " +this.email +"    phone: " +this.phoneNumber);
    }
    public int getOld(){
        int yearOld =  Period.between(this.birthday, LocalDate.now()).getYears();
        return yearOld;
    }
    public String getLastName(){
        int lastSpace = this.name.lastIndexOf(" ");
        String Ten = this.name.substring(lastSpace + 1);
        return Ten;
    }

}
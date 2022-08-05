import java.time.LocalDate;
import java.time.Period;
enum GENDER {
    MALE,
    FEMALE
}

public class Employee{
    public String id;
    public String name;
    public LocalDate birthday;
    public GENDER gender;
    public double salary;


    public Employee(String id, String name, LocalDate birthday, GENDER gender, double salary){
        this.id = "NV" +id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean hasKeyword(String keyword){
        boolean result = this.name.contains(keyword);
        return result;
    }
    public int tinhTuoi(LocalDate ngaySinh){
        int tuoi = Period.between(ngaySinh, LocalDate.now()).getYears();
        return tuoi;
    }

  
}
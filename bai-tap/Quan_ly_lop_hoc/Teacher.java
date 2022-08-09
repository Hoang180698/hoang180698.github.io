public class Teacher extends User {

    int yearOfExperiences;
    String speciality;

    public Teacher(String id, String name, Gender gender, String birthday, String email, String phoneNumber, int yearOfExperiences, String speciality){
        super(id, name, gender, birthday, email, phoneNumber);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.print("   Kinh nghiem: " + this.yearOfExperiences +" nam     Chuyen mon: " +this.speciality +"\n");
    }

    
    
}

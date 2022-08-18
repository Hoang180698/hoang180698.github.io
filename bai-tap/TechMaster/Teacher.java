public class Teacher {
    private String name;
    private String email;
    private String phoneNumber;
    private int yearOfExperiences;
    private String speciality;

    public Teacher(String name, String email, String phoneNumber, int yearOfExperiences, String speciality) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }
    public void printTeacher(){
        System.out.println(name +"   email: " +email +"   Sdt: " +phoneNumber 
                           + "   Kinh nghien: " +yearOfExperiences +" năm     Chuyên môn: " +speciality);
    }
}

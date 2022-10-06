public class Student {
    public String fullname;
    public int age;
    public int GPA;

    public Student(String fullname, int age, int gPA) {
        this.fullname = fullname;
        this.age = age;
        GPA = gPA;
    }
    public String toString() {
        return "fullName: " +fullname +"     age: " +age +"      GPA: " +GPA;
    }
    public String getLastName() {
        int lastSpace = this.fullname.lastIndexOf(" ");
        String lastName = this.fullname.substring(lastSpace + 1);
        return lastName;
    }

    
}

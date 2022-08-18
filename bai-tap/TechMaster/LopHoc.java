import java.util.ArrayList;

public class LopHoc {
    private ArrayList<Subject> subjects;
    private ArrayList<Student> students;

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "LopHoc [students=" + students + ", subjects=" + subjects + "]";
    }
    public void printMonHoc(){
        for (int i=0; i < subjects.toArray().length; i++){
            System.out.println(subjects.toArray()[i]);
        }
    }
    public void printHocVien(){
        for (int i=0; i < students.toArray().length; i++){
            System.out.println(students.toArray()[i]);
        } 
    }
    
    
}

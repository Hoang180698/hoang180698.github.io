import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // tao 1 quan ly
        QuanLy quanLy = new QuanLy("Hương Thanh", "0978293432", "huong@techmaster.vn");
        
        // tao 1 giang vien
        Teacher teacher = new Teacher("Chu Tiến Đạt", "datct0105@gmail.com",
                                      "08942341312", 5, "Java");
         
        // Tao cac mon hoc
        Subject subject1 = new Subject("Web căn bản", 12);
        Subject subject2 = new Subject("Java Core", 16);
        Subject subject3 = new Subject("Database", 8);
        Subject subject4 = new Subject("Cấu trúc dữ liệu & Giải thuật", 14);
        Subject subject5 = new Subject("Spring Boot", 38);

        // Tao cac hoc vien
        Student student1 = new Student("HV01", "Nguyen Van Hoang", 24, "Very good");
        Student student2 = new Student("HV02", "Le Viet Cuong", 24, "Good");
        Student student3 = new Student("HV03", "Le Dinh Cong", 25, "Origin");

        // Tao lop hoc
        LopHoc lopHoc= new LopHoc();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);
        subjects.add(subject5);

        lopHoc.setSubjects(subjects);
        lopHoc.setStudents(students);

        // Hiển thị thông tin chi tiết của trung tâm
        System.out.print("Quan Ly: ");
        quanLy.printQuanLy();
        System.out.print("Giang vien: ");
        teacher.printTeacher();
        System.out.println("Danh sách môn học:");
        lopHoc.printMonHoc();
        System.out.println("Danh sách học viên:");
        lopHoc.printHocVien();
         
        // Thực hiện thêm học viên vào lớp hiện tại
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        // In danh sach hoc vien moi
        System.out.println("Danh sách học viên mới: ");
        lopHoc.printHocVien();
        
        // Thực hiện cập nhật thông tin học lực của 1b học viên dựa vào Id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id học viên cần thay đổi thông tin học lực: ");
        String findId = scanner.nextLine();
        System.out.println("Nhập học lực mới: ");
        String newRanked = scanner.nextLine();
        for (Student stu : students){
            if(stu.getId().equals(findId)){
                stu.setRanked(newRanked);
            }
        }
        System.out.println("Thong tin sau cập nhật");
        lopHoc.printHocVien();

        // Xóa học viên xin nghỉ
        System.out.println("Nhập id học viên cần xóa: ");
        String moveId = scanner.nextLine();
        for (Student stu : students){
            if(stu.getId().equals(moveId)){
                students.remove(stu);
            }
        }
        System.out.println("Danh sach mới: ");
        lopHoc.printHocVien();

        scanner.close();
        

   }
}
public class Main {
    public static Student[] sortByFullName(Student[] students) {
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i = 0; i < students.length-1; i++){
                if(students[i].fullname.compareTo(students[i+1].fullname) < 0){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                    sorted = false;
                } // fulName giong nhau thi so sanh theo tuoi
                 else if (students[i].fullname.compareTo(students[i+1].fullname) == 0) {
                    if (students[i].age < students[i+1].age) {
                        Student temp = students[i];
                        students[i] = students[i+1];
                        students[i+1] = temp;
                        sorted = false;
                    }
                  
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
        return students;
    }
    public static Student[] sortByAge(Student[] students) {
        int n = students.length;

        for(int i = 0; i < n - 1; i++){
            int minIdx = i;

            //tìm index của phần tử nhỏ nhất
            for(int j = i + 1; j < n; j++){
                if(students[j].age < students[minIdx].age){
                    minIdx = j;
                } else if(students[j].age == students[minIdx].age) {
                    // tuoi bang nhau so sanh theo gpa
                    if (students[j].GPA > students[minIdx].GPA) {
                        minIdx = j;
                    }
                }
            }
            //đổi vị trí
            Student temp = students[minIdx];
            students[minIdx] = students[i];
            students[i] = temp;
        }
        return students;
    }
    public static Student[] sortByLastName(Student[] students) {
        int n = students.length;

        for(int i = 0; i < n - 1; i++){
            int minIdx = i;

            //tìm index của phần tử nhỏ nhất
            for(int j = i + 1; j < n; j++){
                if(students[j].getLastName().compareTo(students[minIdx].getLastName()) < 0) {
                    minIdx = j;
                } else if(students[j].getLastName().compareTo(students[minIdx].getLastName()) == 0) {
                    // ten giong nahu thi sap xep theo full name
                    if (students[i].fullname.compareTo(students[i+1].fullname) < 0) {
                        minIdx = j;
                    }
                }
            }
            //đổi vị trí
            Student temp = students[minIdx];
            students[minIdx] = students[i];
            students[i] = temp;
        }
        return students;
    }
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Nguyen Van Hoang", 24, 10);
        students[1] = new Student("Le Dinh Cong", 25, 5);
        students[2] = new Student("Nguyen Van Hoang", 26, 9);
        students[3] = new Student("Tran Thi Yen", 25, 7);
        students[4] = new Student("Do Nam Trump", 60, 9);
        students[5] = new Student("Donal Trump", 60, 10);
        

        // #1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.
        Student[] students2 = sortByFullName(students);
        System.out.println("Sap xep theo ho ten: ");
        for (Student student : students2) {
            System.out.println(student.toString());
        }

        // #2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
        System.out.println("\nSap xep theo tuoi: ");
        Student[] students3 = sortByAge(students);
        for (Student student : students3) {
            System.out.println(student.toString());
        }

        // #3. Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)
        System.out.println("\nSap xep theo ten");
        Student[] students4 = sortByLastName(students);
        for (Student student : students4) {
            System.out.println(student.toString());
        }

    }
}

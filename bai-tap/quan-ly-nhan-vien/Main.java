import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee [5];

        employee[0] = new Employee("01", "Nguyen Van Hoang",
                          LocalDate.of(1998, 06, 18),
                          GENDER.MALE, 120000000);

        employee[1] = new Employee("02", "Le Dinh Cong",
                          LocalDate.of(1997, 02, 21),
                          GENDER.MALE, 20000000);
        
        employee[2] = new Employee("03", "Johnny Depp",
                          LocalDate.of(1963, 06, 9),
                          GENDER.MALE, 30000000);

        employee[3] = new Employee("04", "Elizabeth Olsen",
                          LocalDate.of(1989, 02, 16),
                          GENDER.FEMALE, 25000000);
        
        employee[4] = new Employee("05", "Tran Thi Hong Duyen",
                          LocalDate.of(1997, 11, 04),
                          GENDER.FEMALE, 12000000);

     //   Tìm nhân viên theo id ( tìm chính xác)
         Scanner scanner = new Scanner(System.in);
         System.out.print("Nhap id nhan vien can tim: ");
         String idTK = scanner.nextLine();
         System.out.println("Ket qua tim kiem: ");
         boolean isPrime = false;
         for(Employee nv : employee){
            if(idTK.equals(nv.id)){
                System.out.println("   "+nv.id +": " + nv.name );
                isPrime = true;
            }        
            
         }
         if(isPrime == false){
            System.out.println("   Khong tim thay nhan vien can tim");
        }

    // Tìm nhân viên theo tên ( tìm theo từ khoá, ví dụ: Nguyễn Văn A -> nhập A hoặc Văn => đều tìm ra được)
         System.out.print("Nhap ten NV can tim: ");    
         String tenTK = scanner.nextLine();
         System.out.println("Ket qua tim kiem: ");
         boolean isResult = false;
         for(Employee nv : employee){
            if(nv.hasKeyword(tenTK)){
                System.out.println("   "+nv.id +": " + nv.name );
                isResult = true;
            }

         }
         if(isResult == false){
            System.out.println("   Khong tim thay nhan vien can tim");
         }
     // Đếm số nhân viên nam, nữ
        int soNam = 0;
        int soNu = 0;
        for(int index = 0; index < employee.length; index++){
            GENDER gioiTinh  = employee[index].gender;
            switch (gioiTinh) {
                case MALE: {
                    soNam++;
                    break;
                }
                case FEMALE: {
                    soNu++;
                    break;
                }
            }
         
        }
        System.out.println("So nhan vien nam: " + soNam);
        System.out.println("So nhan vien nu: " + soNu);

     // Liệt kê các nhân viên trên 30 tuổi
         System.out.println("Cac nhan vien tren 30 tuoi: ");
         int count = 0;
         for(Employee nv : employee){
            int tuoiNv = nv.tinhTuoi(nv.birthday);
            if(tuoiNv > 30){
                System.out.println("   "+nv.id +": " + nv.name );
                count++;
            }
        
         }
         if(count == 0){
            System.out.println("    Khong co nhan vien nao");
         }

    //  Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật
         System.out.print("Input month: ");
         int month = scanner.nextInt();
         System.out.println("Nhan vien sinh nhat trong thang " +month +": ");
         boolean isBirthday = false;
         for(Employee nv : employee){
            if(nv.birthday.getMonthValue() == month){
                System.out.println("   "+nv.id +": " + nv.name );
                isBirthday = true;
            }
        }
        if(isBirthday == false){
            System.out.println("    Khong co ai sinh nhat trong thang nay");
        }

    // In ra top 3 người có lương tháng cao nhất
         System.out.println("Top 3 nguoi luong cai cao nhat: ");
         Employee[] topLuong = employee;
         Employee temp = topLuong[0];
         for(int i = 0; i < topLuong.length; i++){
            for(int j = i + 1; j < topLuong.length; j++){
                if(topLuong[i].salary < topLuong[j].salary){
                    temp = topLuong[j];
                    topLuong[j] = topLuong[i];
                    topLuong[i] = temp;
                }
            }
         }
         for(int index = 0; index < 3; index++){
            System.out.println("    Top" + (index+1) + ": " +topLuong[index].id +" " +  topLuong[index].name + "  " +topLuong[index].salary +"$");
         }


         scanner.close();

                           
    }
    
}
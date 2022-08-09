import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User[] user = new User[8];

        user[0] = new Teacher("GV01", "Pham Thi Hong", Gender.FEMALE, "17/09/1994", "Hong123@gmail.com", "09321034234", 5, "java front-end");
        user[1] = new Teacher("GV02", "Pep Guardiola", Gender.MALE, "18/01/1981", "pepTroc@gmail.com", "0973129341", 13, "football");

        user[2] = new Student("HS01", "Nguyen Van Hoang", Gender.MALE, "18/06/1998", "LeHoang180698@gmail.com", "0969882365", false, "Dang hoc");
        user[3] = new Student("HS02", "Le Viet Cuong", Gender.MALE, "01/10/1998", "Cuong738@gmail.com", "0972991238", true, "Dang di lam");
        user[4] = new Student("HS03", "Le Dinh Cong", Gender.MALE, "21/02/1997", "CongLe@gmail.com", "023812938", false, "Dang hoc");
        user[5] = new Student("HS04", "Park Rosé", Gender.FEMALE, "11/02/1998", "Roseee", "0239213781", false, "Dang lam ca si");
        user[6] = new Student("HS05", "Kylian Mbappé", Gender.MALE, "20/12/1998", "MbappeTroc@yahoo.com", "09213812312", true, "Dang da bong");
        user[7] = new Student("HS06", "Taylor Alison Swift", Gender.FEMALE, "13/12/1989", "Taylor@gmail.com", "0921321738", true, "Dang hat");

    //  Duyệt mảng và in ra thông tin học sinh, bao giáo viên
        for(User user1 : user){
            user1.printInfo();
        }

    // Tìm kiếm theo keyword bất kỳ nếu xuất hiện trong tên hoặc email hoặc số điện thoại thì in a thông tin người đó
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap keyword: ");
        String keyword = scanner.nextLine();
        System.out.println("Ket qua Tim kiem: ");
        for(User user1 : user){
            if(user1.hasKeyword(keyword)){
                user1.printInfo();
            }
        }
        
    // Sắp xếp theo tên tăng dần ( theo từ điển a-zA-Z0-1-2)
        System.out.println("\nSap xep theo ten: ");
        User temp = user[0];
        for(int i = 0; i < user.length; i++){
            for(int j = i + 1; j < user.length; j++){
                if(user[i].getLastName().compareTo(user[j].getLastName()) < 0){
                    temp = user[j];
                    user[j] = user[i];
                    user[i] = temp; 
                }
                 // Ten giong nhau thi sap xep theo ho
                 else if(user[i].getLastName().compareTo(user[j].getLastName()) == 0){ 
                    if(user[i].getName().compareTo(user[j].getName()) < 0){
                        temp = user[j];
                        user[j] = user[i];
                        user[i] = temp; 
                    }
                }
            }
        }
        for(User user1 : user){
            user1.printInfo();
        }

    // Sắp xếp theo tuổi giảm dần
        System.out.println("\nSap xeo theo tuoi giam dan: ");
        for(int i = 0; i < user.length; i++){
            for(int j = i + 1; j < user.length; j++){
                if(user[i].getOld() < user[j].getOld()){
                    temp = user[j];
                    user[j] = user[i];
                    user[i] = temp; 
                }            
            }
        }
        for(User user1 : user){
            user1.printInfo();
        }

        scanner.close();
    
        
    }
}

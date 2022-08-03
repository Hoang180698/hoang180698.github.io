import java.util.Scanner;

public class Bai4{
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập một số: ");
    int number = scanner.nextInt();
    System.out.println("Bảng cửu chương của số vừa nhập: ");
    for (int i =1 ; i <= 10; i++){
        System.out.println(number +" x " +i +" = " +number*i);
    }
    scanner.close();
 
}
}   // ------------------------- Bài 4 -------------------------------------------
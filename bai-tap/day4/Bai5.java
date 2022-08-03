import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int column = scanner.nextInt();
        // khởi tạo mảng hai chiều
        int[][] number = new int [row][column];
        // Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.printf("number[%d][%d]: ", i , j);
                number[i][j] = scanner.nextInt();
            }
        }
        // In thông tin mảng ra màn hình
        System.out.println("In thông tin mảng: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(number[i][j] + "  ");
            }
            System.out.println();
        }
        // Liệt kê các phần tử nằm trên đường chéo chính
        System.out.println("Các phần tử trên đường chéo chính: ");
        for (int i = 0; i < row && i < column; i++){
                System.out.print(number[i][i] + "  ");
            }
        // Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
        int[][] otherNumber = new int[row][column];
        System.out.println("\nNhập các phần tử cho mảng mới: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.printf("ohterNumber[%d][%d]: ", i , j);
                otherNumber[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Tổng 2 mảng: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print((number[i][j] + otherNumber[i][j]) + "  ");
            }
            System.out.println();
        }
        scanner.close();


    }
}

import java.util.Random;

public class Bai3 {
    //  Phương thức kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
        return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
        if (n % i == 0) {
        return false;
        }
        }
        return true;
       }
    public static void main(String[] args){
           //Dùng lớp Random để sinh ra một số ngẫu nhiên
          Random random = new Random();
          int ranNum = random.nextInt(1000000); // tạo một số nguyên dương ngẫu nhiên trong phạm vi từ 0 đến 999999
          System.out.println("Số ngẫu nhiên: "+ranNum);
          System.out.println("Đây là số nguyên tố: "+isPrimeNumber(ranNum));
        
    }
}

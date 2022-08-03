import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.print("Input a string: ");
          String txt = scanner.nextLine();
          scanner.close();
          System.out.print("Reverse string: ");
          for (int i = (txt.length() - 1); i >= 0; i-- ){
            System.out.print(txt.charAt(i));
          }

                         //---------------------------------Bài 5-----------------------
    }
}

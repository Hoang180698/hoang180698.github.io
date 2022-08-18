import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
    // Tạo các sản phẩm
        Product product1 = new Product("sp01", "Mark", "black",
                                       10, 30000, "dv1");
        Product product2 = new Product("sp02", "Milk", "drink",
                                       4, 60000, "dv2"); 
        Product product3 = new Product("sp03", "Laptop", "Asus",
                                       7, 22000000, "dv3");
        Product product4 = new Product("sp04", "Keo", "red",
                                       3, 9000, "dv4"); 
                                       
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1); 
        products.add(product2); 
        products.add(product3); 
        products.add(product4);
        
    // Xem danh sách sản phẩm
        for (Product goods : products) {
            goods.printProduct();
        }
        
     // Tìm sản phẩm theo tên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String nameFind = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        for (Product goods : products) {
            if (goods.hasKeyword(nameFind)){
                goods.printProduct();
            }
        }
        
    //  3 - Tìm sản phẩm theo id:
    // 3.1: Xóa sản phẩm
    
        System.out.println("Nhập id sản phẩm cần xóa: ");
        String idReMove = scanner.nextLine();
         for (Product goods : products) {
            if (goods.getId().equals(idReMove)){
                products.remove(goods);
                break;
            }
        }

        // 3.2: Cập nhật số lượng sản phẩm
        System.out.println("Nhập id sản phẩm cần cập nhật số lượng: ");
        String idUpdate = scanner.nextLine();
        System.out.println("Nhập số lượng mới: ");
        int newAmount = scanner.nextInt();
        for (Product goods : products) {
            if (goods.getId().equals(idUpdate)){
                goods.setAmount(newAmount);
            }
        }
        System.out.println("Thông tin sau cập nhật: ");
        for (Product goods : products) {
                goods.printProduct();
            }
        
    // Tìm các sản phẩn có số lượng dưới 5
        System.out.println("Các sản phẩm có số lượng dưới 5: "); 
        for (Product goods : products) {
            if (goods.getAmount() < 5){
                goods.printProduct();
            }
        }

    // Tìm sản phẩm theo mức giá
        System.out.println("Sản phẩm có giá dưới 50.000: ");
        for (Product goods : products) {
            if (goods.getPrice() < 50000){
                goods.printProduct();
            }
        }
        System.out.println("Sản phẩm có giá từ 50.000 đến dưới 100.000");
        for (Product goods : products) {
            if (goods.getPrice() > 50000 && goods.getPrice() < 100000){
                goods.printProduct();
            }
        }
        System.out.println("sản phẩm có giá trên 100.000: ");
        for (Product goods : products) {
            if (goods.getPrice() > 100000){
                goods.printProduct();
            }
        }
        scanner.close();


        }
   }
   

    

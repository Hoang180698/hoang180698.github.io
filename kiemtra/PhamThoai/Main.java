import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static void openScanner(){
        scanner = new Scanner(System.in);
    }
    public static void closeScanner(){
        scanner.close();
    }
    static List<Orders> orderList = new ArrayList<Orders>();
    static List<Stock> stockList = new ArrayList<Stock>();
    public static void orderService(Customer customer, Item item, List<Stock> stockList, List<Orders> oList, int quantily){

         Orders orders = new Orders();
         orders.setCustomer(customer);;
         orders.setItem(item);;
         orders.setQuantily(quantily);
         orders.setTimeOrder(LocalDate.now());
         orders.setTotal(item.getPrice() * quantily);

         oList.add(orders);
         
         for (Stock stock : stockList) {
            if (stock.getId() == item.getId()) {
                stock.setQuantily(stock.getQuantily() - quantily);
            }
         }

         customer.payMoney(item.getPrice() * quantily);
         System.out.println("oder thanh cong");
         
    }
    public static void showMenuOder(List<Stock> stockList){
        for (Stock stock : stockList) {
            System.out.println("id: " +stock.getId() + "   name: " +stock.getItem().getName() + "    Quantily: " +stock.getQuantily() );
        }
        System.out.println("0: exit");
    }
    public static boolean isHasItemInStockList(int id, List<Stock> stockList){
        boolean check = false;
        for (Stock stock : stockList) {
            if (stock.getId() == id) {
                check = true;
                break;
            }
        }
        return check;
    }
    public static boolean checkQuantily(int id, int quantily, List<Stock> stockList){
        boolean check = false;
        for (Stock stock : stockList) {
            if (stock.getId() == id) {
                if (stock.getQuantily() >= quantily) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
    public static Item returnItem(int id, List<Stock> stockList){
        Item item = null;
        for (Stock stock : stockList) {
            if (stock.getId() == id) {
                item = stock.getItem();
                break;
            }
        }
        return item;
    }
    
    public static void oderAction(Customer customer,List<Stock> stockList, List<Orders> oList){
        int idInput;
        int quantilyInput;
        Item item;
        while (true) {
            showMenuOder(stockList);
            System.out.println("Nhap id hang ban muon oder: ");
            idInput = Integer.parseInt(scanner.nextLine());
            if (idInput == 0) {
                System.exit(0);
            } else if (isHasItemInStockList(idInput, stockList)) {
                item = returnItem(idInput, stockList);
        
                while (true) {
                    System.out.println("Nhap so luong: ");      
                    quantilyInput = Integer.parseInt(scanner.nextLine());
                   
                    if (checkQuantily(idInput, quantilyInput, stockList)) {
                        if (customer.getWallet().getAmount() >= item.getPrice() * quantilyInput) {
                            orderService(customer, item, stockList, oList, quantilyInput);
                            break;
                        } else {
                            System.out.println("So tien cua ban khong du!\n\n");
                        }
                    } else {
                        System.out.println("Khong du hang\n\n");
                    }
                }
            } else {
                System.out.println("Khong co mat hang nay\n\n");
            }

        }
        
    }
    public static void main(String[] args) {
        Item item1 = new Item(1, "Thuoc hoi trinh", 20000, "desciption");
        Item item2 = new Item(2, "Tam nuoc", 75000, "desciption");
        Stock stock1 = new Stock(1, item1, 5);
        Stock stock2 = new Stock(2, item2, 10);
        Wallet wallet1 = new Wallet(1, "103921093", "viettinbank", 200000);
        Customer customer1 = new Customer(1, "Hoang", "21387123", "HN", wallet1);
        stockList.add(stock1);
        stockList.add(stock2);


        openScanner();

        oderAction(customer1,stockList,orderList);

        closeScanner();
        
    }
}

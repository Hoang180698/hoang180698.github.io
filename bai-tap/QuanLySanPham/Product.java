public class Product {
    private String id;
    private String name;
    private String describe;
    private int amount;
    private double price;
    private String donViTinh;
    public Product(String id, String name, String describe, int amount, double price, String donViTinh) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.amount = amount;
        this.price = price;
        this.donViTinh = donViTinh;
    }

    public void printProduct(){
        System.out.println(id +": " +name +"   mô tả: " +describe +"   Số lượng: " +amount
                           +"   Giá bán: " +price +"$    Đơn vị tính: " +donViTinh);
    }

    public boolean hasKeyword(String nameFind) {
        return (this.name.contains(nameFind));
    }
   public String getId() {
       return id;
   }
   public void setAmount(int amount) {
       this.amount = amount;
   }
   public int getAmount() {
       return amount;
   }
   public double getPrice() {
       return price;
   }

}

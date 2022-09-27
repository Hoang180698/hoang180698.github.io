public class Customer {

    public Customer(int id, String name, String phone, String address, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.wallet = wallet;
    }

    private int id;
    private String name;
    private String phone;
    private String address;
    private Wallet wallet;


    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public void payMoney(Double amount){
        this.wallet.setAmount(this.wallet.getAmount() - amount);
    }
}

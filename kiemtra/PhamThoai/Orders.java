import java.time.LocalDate;

public class Orders {
    public Orders() {
    }

    private int id;
    private Customer customer;
    private Item item;
    private int quantily;
    private LocalDate timeOrder;
    private double total;

    

    public Orders(int id, Customer customer, Item item, int quantily, LocalDate timeOrder, double total) {
        this.id = id;
        this.customer = customer;
        this.item = item;
        this.quantily = quantily;
        this.timeOrder = timeOrder;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public LocalDate getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(LocalDate timeOrder) {
        this.timeOrder = timeOrder;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

public class Stock {
    
    private int id;
    private Item item;
    private int quantily;


    public Stock(int id, Item item, int quantily) {
        this.id = id;
        this.item = item;
        this.quantily = quantily;
    }

    public Stock() {
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
}

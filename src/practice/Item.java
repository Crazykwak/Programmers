package practice;


public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
    public String s = "쿠콰콰쾅오";

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void introduce() {
        System.out.println("itemName = " + itemName);
        System.out.println("price = " + price);
        System.out.println("quantity = " + quantity);
    }

    public void introduce(String s) {
        System.out.println("itemName = " + itemName);
        System.out.println("price = " + price);
        System.out.println("quantity = " + quantity);
        System.out.println("s = " + s);
    }
}
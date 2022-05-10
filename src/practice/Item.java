package practice;

public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
        System.out.println("기본 생성자를 호출했다.");
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this();
        System.out.println("인자를 받는 두번째 생성자도 호출했다.");
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
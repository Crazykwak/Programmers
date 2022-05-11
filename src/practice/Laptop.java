package practice;

public class Laptop extends Item{

    private String model;

    public String s = "뽀잉뽀잉뽀잉";

    public Laptop() {

    }

    public Laptop(String itemName, Integer price, Integer quantity, String model) {
        super(itemName, price, quantity);
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Laptop 기동");
    }

    @Override
    public void introduce() {
        System.out.println("모델명 :" + model);;
        System.out.println("s = " + s);
        System.out.println("super.s = " + super.s);
    }
}

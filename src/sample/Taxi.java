package sample;

public class Taxi extends Car {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void payment() {
        System.out.println("料金を" + price + "円支払いました");
        price = 0;
    }

    @Override
    public void stepOnAccele() {        
        price += 90;
        System.out.println("料金が" + price + "円に増えました");
    }

}

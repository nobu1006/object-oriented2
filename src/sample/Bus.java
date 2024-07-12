package sample;

public class Bus extends Car {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void stepOnAccele() {
        super.stepOnAccele();
        price += 30;
        System.out.println("料金が" + price + "円に増えました");
    }
}

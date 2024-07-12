package sample;

public class Ex01 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        // bus.speed = 10;
        bus.setSpeed(10);
        // bus.name = "小田急バス";
        bus.setName("小田急バス");
        bus.stepOnAccele();
        bus.stepOnBrake();
        bus.stepOnBrake();

    }

}

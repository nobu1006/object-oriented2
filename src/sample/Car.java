package sample;

public class Car {
    private int speed;
    private String name;


    @Override
    public String toString() {
        return "Car [speed=" + speed + ", name=" + name + "]";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(int speeed, String name) {
        this.speed = speeed;
        this.name = name;
    }

    public Car() {}

    public void stepOnAccele() {
        speed += 10;
        System.out.println("スピードが" + speed + "にkm/hに増えました");
    }

    public void stepOnBrake() {
        speed -= 10;
        System.out.println("スピードが" + speed + "にkm/hに減りました");
    }
}

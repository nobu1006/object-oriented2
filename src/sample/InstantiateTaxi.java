package sample;

public class InstantiateTaxi {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        // taxi.speed = 10;
        taxi.setSpeed(10);
        // taxi.name = "日本タクシー";
        taxi.setName("日本タクシー");
        taxi.stepOnAccele();
        taxi.stepOnAccele();
        taxi.stepOnBrake();
        // System.out.println(taxi.name + "の現在のスピードは" + taxi.speed + "km/hです");
        System.out.println(taxi.getName() + "の現在のスピードは" + taxi.getSpeed() + "km/hです");
    }

}

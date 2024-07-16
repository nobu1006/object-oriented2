package sample;

public class InstantiateTaxi2 {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        // taxi.speed = 10;
        // taxi.name = "日本タクシー";
        // taxi.price = 1000;
        taxi.stepOnAccele();
        taxi.payment();
        // String s = taxi.toString();
        System.out.println(taxi);
    }

}

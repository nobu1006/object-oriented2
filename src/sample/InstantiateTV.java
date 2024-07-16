package sample;

public class InstantiateTV {
    public static void main(String[] args) {
        TV sonyTv = new TV();
        sonyTv.changeChannel(5);

        TV panasonicTv = new TV();
        panasonicTv.changeChannel(13);
        // panasonicTv.channel = 13;
        // System.out.println(panasonicTv.channel);
    }

}

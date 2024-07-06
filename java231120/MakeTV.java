package java231120;

class MakeTV {
    String color;
    boolean power;
    int channel;
    MakeTV(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;


    }

    void power(boolean power) { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
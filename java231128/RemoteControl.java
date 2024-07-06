package java231128;

interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    default void setMute(boolean mute) {
    }

    default void setVolume(int volume) { // default는 오버라이드가 필요없다.

        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            System.out.println("볼륨을 " + volume + "(으)로 설정합니다.");
        } else if (volume < MIN_VOLUME) {
            System.out.println("최소 볼륨은 " + MIN_VOLUME + "입니다. 최소값으로 설정합니다.");
        } else {
            System.out.println("최대 볼륨은 " + MAX_VOLUME + "입니다. 최대값으로 설정합니다.");
        }
    }

}
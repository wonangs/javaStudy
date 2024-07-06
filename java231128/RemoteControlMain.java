package java231128;

public class RemoteControlMain {

    public static void main(String[] args) {

        RemoteControl rc;

        // rc 변수에 Televison 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        // rc 변수에 Audio 객체를 대입(교체시킴)
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();

        System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

        rc.setVolume(100);
        rc.setVolume(-10);

        rc.setMute(true);
        rc.setMute(false);


    }
}

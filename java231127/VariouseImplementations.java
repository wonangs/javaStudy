package java231127;

public class VariouseImplementations {

    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        Alarm alarm = sp;
        Phone phone = sp;
        Messenger messenger = sp;



        sp.playMusic("상어송");
        alarm.beep();

        sp.call("010-1234-5678");
        phone.receive();

        sp.sendMsg("010-1234-5678", "자니?");
        messenger.receiveMsg();

    }
}


interface Alarm {
    void playMusic(String title);
    void beep();
}

interface Phone {
    void call(String phoneNum);
    void receive();
}

interface Messenger {
    void sendMsg(String phoneNum, String msg);
    void receiveMsg();
}
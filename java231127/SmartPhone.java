package java231127;

class SmartPhone implements Alarm, Phone, Messenger {
//    private String phoneNumber;

    public void playMusic(String title) {
        System.out.printf("[%s]이/가 재생됩니다.", title);
    }

    public void beep() {
        System.out.println("[비프음]이 재생됩니다. 삐빅!");
    }

    public void call(String phoneNum) {
        System.out.printf("[%s]로 전화를 겁니다. rrrr.\n", phoneNum);
    }

    public void receive() {
        System.out.println("전화를 받습니다.");
    }

    public void sendMsg(String phoneNum, String msg) {
        System.out.printf("[%s]로 메시지 전송 : %s\n", phoneNum, msg);
    }

    public void receiveMsg() {
        System.out.println("메시지가 도착하였습니다.");
    }
}
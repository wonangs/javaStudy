package java231130.HashCodeExam;

public class HashCodeExam {
    int id;
    String name;

    public HashCodeExam(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { // 내용을 보고 같은지 판단하는 메서드
        return id;
    }


    //이거 주석처리하면 false나옴
    public boolean equals(Object obj) { // 내용을 보고 같은지 판단하는 메서드

        if (obj instanceof HashCodeExam) {
            return this.getId() == ((HashCodeExam) obj).getId();
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        HashCodeExam user1 = new HashCodeExam(1001, "홍길동");
        HashCodeExam user2 = new HashCodeExam(1001, "홍길동");
        //System.out.println(user1.equals(user2));
        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
    }
}
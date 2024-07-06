package java231121;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음"); // 첫 번째 줄(스택에 저장됐기 때문에 참조가 같다)
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음"); // 두 번째 줄
        }

        String strVar3 = new String("Hong gil dong");
        String strVar4 = new String("Hong gil dong");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음"); // 세 번째 줄(스택을 참조하여 힙에 저장되었기 때문에 참조가 다르다)
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음"); // 네 번째 줄
        }
    }
}

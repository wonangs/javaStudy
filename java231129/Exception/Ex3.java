package java231129.Exception;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf("10을 X로 나누려 한다.\nX의 값을 입력. > ");
            String inputStr = sc.next();
            int inputNum = Integer.parseInt(inputStr);

            int result = 10 / inputNum;
            System.out.printf("10 나누기 %d => %d\n", inputNum, result);
        } catch (NumberFormatException exception) {
            System.out.println("정수 변환에 실패했습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
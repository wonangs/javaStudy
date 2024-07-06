package java231201;

import java.util.StringJoiner;

public class StringEx5 {

    public static void main(String[] args) throws Exception {

        String str = "가";

        byte[] bArr = str.getBytes("utf-8");
        byte[] bArr2 = str.getBytes("cp949");

        System.out.println("utf-8:" + joinByteArr(bArr));
        System.out.println("cp949:" + joinByteArr(bArr2));

        System.out.println("utf-8:" + new String(bArr, "utf-8"));
        System.out.println("utf-8:" + new String(bArr2, "cp949"));
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}
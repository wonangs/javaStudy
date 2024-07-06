package java231130.Bank;

import java.io.*;


public class BankAccountTest {

/*
    public static void main(String[] args) throws IOException {

        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워렌 버핏", "206-000002", 1000000);

        File file = new File("accounts-data.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");
        fw.close();
    }
*/


    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("accounts-data.txt");
        FileReader fr = new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
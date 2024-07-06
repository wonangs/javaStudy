package java231123;

import java.util.Scanner;
public class Item {

    Scanner scan = new Scanner(System.in);
    String item;
    int price;

    Item(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [item=" + item + ", price=" + price + "]";
    }
}
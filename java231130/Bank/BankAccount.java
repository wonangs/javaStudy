package java231130.Bank;

class BankAccount {
    private final String username;
    private final String number;
    private int amount;

    public BankAccount(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }

    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}

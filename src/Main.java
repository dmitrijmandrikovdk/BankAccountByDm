public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Dmitrij", "DK-987654", 100.0);
        System.out.println(account);
        account.deposit(50.0);
        account.deposit(20.0);
        account.withdraw(200.0);
        account.withdraw(80.0);
        System.out.println(account);
    }
}
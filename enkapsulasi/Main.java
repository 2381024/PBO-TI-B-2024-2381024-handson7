package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount arvelPeyoh = new BankAccount(100);

        arvelPeyoh.deposit(10);
        arvelPeyoh.withdraw(40);
        System.out.println(arvelPeyoh.getSaldo());
    }
}

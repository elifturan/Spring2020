package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Elif = new BankAccount();
        Elif.accountHolder="Elif";
        Elif.accountNumber=12345;

        Elif.checkingBalance();
        Elif.deposit(33);
        Elif.checkingBalance();

        Elif.withDraw(13);
        Elif.checkingBalance();

        Elif.withDraw(30);
        Elif.checkingBalance();
        System.out.println("======================================");

        System.out.println(Elif);



    }
}

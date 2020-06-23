
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matAcc = new Account("Matthews account", 1000);
        Account bekAcc = new Account("My account", 0);
        
        matAcc.withdrawal(100.0);
        bekAcc.deposit(100.0);
        
        System.out.println(matAcc);
        System.out.println(bekAcc);
    }
}

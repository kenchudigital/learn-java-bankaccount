public class Main {
    public static void main(String[] args) {

        Account clientAccount = new Account();
        clientAccount.withdrawFunds(100.0);
        clientAccount.depositFunds(300.0);
        clientAccount.withdrawFunds(100.0);
    }
}
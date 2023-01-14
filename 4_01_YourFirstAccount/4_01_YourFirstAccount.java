public class YourFirstAccount {

    public static void main(String[] args) {
        Account myAccount = new Account("My Account", 100.00);
        myAccount.deposit(20.0);
        System.out.println(myAccount);
    }
}

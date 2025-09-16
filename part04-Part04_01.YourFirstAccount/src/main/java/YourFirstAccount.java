
public class YourFirstAccount {

    public static void main(String[] args) {
        Account emmasAccount = new Account("Emma", 100);
        
        emmasAccount.deposit(20);
        System.out.println(emmasAccount.toString());
    }
}

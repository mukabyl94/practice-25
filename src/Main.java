import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<User, BankAccount> bank = new HashMap<>();
        bank.put(new User("Mika", "Surnamov"), new BankAccount(896));
        bank.put(new User("Liya", "Surnamova"), new BankAccount(456));
        bank.put(new User("Mick", "Surnamov"), new BankAccount(83456));
        bank.put(new User("Nika", "Surnamov"), new BankAccount(84566));
        bank.put(new User("Oliver", "Surnamov"), new BankAccount(416));
        bank.put(new User("Sofia", "Surnamova"), new BankAccount(8960));
        bank.put(new User("Soke", "Surnamov"), new BankAccount(978));
        bank.put(new User("Nike", "Surnamov"), new BankAccount(3564));
        bank.put(new User("Yan", "Surnamov"), new BankAccount(4212));
        bank.put(new User("Chan", "Surnamov"), new BankAccount(1245));
        bank.put(new User("Ford", "Surnamov"), new BankAccount(57879));

    }

    public static void transaction(Map<User, BankAccount> map, User user,  int som){
       map.put(user, new BankAccount(som));
    }
}
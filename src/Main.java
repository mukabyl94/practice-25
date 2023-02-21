import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        User user = new User("mukabyl", "daminov");
//        Map<User, BankAccount> bank = new HashMap<>();
//        bank.put(new User("Mika", "Surnamov"), new BankAccount(896));
//        bank.put(new User("Liya", "Surnamova"), new BankAccount(456));
//        bank.put(new User("Mick", "Surnamov"), new BankAccount(83456));
//        bank.put(new User("Nika", "Surnamov"), new BankAccount(84566));
//        bank.put(new User("Oliver", "Surnamov"), new BankAccount(416));
//        bank.put(new User("Sofia", "Surnamova"), new BankAccount(8960));
//        bank.put(new User("Soke", "Surnamov"), new BankAccount(978));
//        bank.put(new User("Nike", "Surnamov"), new BankAccount(3564));
//        bank.put(new User("Yan", "Surnamov"), new BankAccount(4212));
//        bank.put(new User("Chan", "Surnamov"), new BankAccount(1245));
//        bank.put(new User("Ford", "Surnamov"), new BankAccount(57879));
//        transaction(bank, user, 5412);
//        System.out.println(bank);


        int[] massiv = new int[10];
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]= random.nextInt(11);
        }
        for (int i = 0; i < massiv.length ; i++) {
            for (int j = 0; j < massiv.length ; j++) {
                if (massiv[j] == massiv[i]){
                    count++;
                    map.put(massiv[j], count);
                }
            }count=0;
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println(map);

    }

    public static void transaction(Map<User, BankAccount> map, User user,  int som){
       map.put(user, new BankAccount(som));
    }
}
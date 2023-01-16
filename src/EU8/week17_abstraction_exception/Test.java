package EU8.week17_abstraction_exception;

public class Test {

    public static void main(String[] args) {

        Bank user1 = new Bank();
        user1.withdrawMoney(50);

        System.out.println(user1.getBalance());

        //polymorphism
        ParentBank user2 = new Bank();
        //user2.withdrawMoney(50);


    }
}

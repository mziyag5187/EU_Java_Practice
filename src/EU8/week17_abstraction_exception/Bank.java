package EU8.week17_abstraction_exception;

public class Bank extends ParentBank {

    private static String bankName = "A_Bank";
    private String userName;
    private double balance = 100;
    private int password;

    public static String getBankName(){
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    public static void setBankName(String newName){
        bankName = newName;
    }



    @Override
    public void depositMoney(int password, double money){
        if (this.password != password) {
            throw new ArithmeticException("wrong password");
        } else {
            balance = balance + money;
        }
    }

    public void withdrawMoney(int money){
        balance = balance - money;
    }

    @Override
    public void withdrawMoney(int password, double money){
        if (this.password != password) {
            throw new ArithmeticException("wrong password");
        } else {
            balance = balance - money;
        }
    }


//    public void withdrawMoney(int password, int money){
//        if (this.balance < money) {
////            throw new ArithmeticException("wrong password");
//            System.exit(0);
//        }
//
//        if (this.password != password) {
//            throw new ArithmeticException("wrong password");
//        } else {
//            balance = balance - money;
//        }
//    }
//
//    public void setPassword(int password, int newpassword){
//        if (this.password != password) {
//            throw new ArithmeticException("wrong password");
//        } else {
//            this.password = newpassword;
//        }
//    }
//
//    public void getBalance(int password){
//        if (this.password != password) {
//            throw new ArithmeticException("wrong password");
//        } else {
//            System.out.println(this.balance);
//        }
//    }




}
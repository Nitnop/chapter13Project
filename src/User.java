public class User {

    int age;
    String address;
    String password;
    int pinNumber;

    public static void start(){
        Account useraccount = new Account(1500.00);
        useraccount.printAccBal(useraccount.accountBallance);
        useraccount.addMoney(200.00);
        BallanceChecker.printAccBal(useraccount.accountBallance);



    }
    
}

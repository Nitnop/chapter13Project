public class Account {
    
    String accountType;
    double accountBallance;
    double intrestRate;
    
    Account(double accbal){
        this.accountBallance = accbal;
    }

    public void printAccBal(double accBalPrint){
        System.out.println("your account ballance is " + accBalPrint);
    }

    public void addMoney(double deposit){
        this.accountBallance += deposit;
    }
}

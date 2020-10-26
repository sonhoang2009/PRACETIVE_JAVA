package Pracite.EX1;

public class EX1 {
    private double balance;
    private double rate;

    public EX1(double balance , double rate){
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterrest(){
        double annuaInteresRate = rate/10*100;
        return balance*(annuaInteresRate/1200);
    }


}

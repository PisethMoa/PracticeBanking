package co.istad.banking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CreditCard extends Account {
    Integer pin;
    Double limitAmont;
    LocalDate thruDate;
    public CreditCard(){

    }
    public CreditCard(Integer number, String name, Double balance){
        super(number,name,balance);
        //have mor idea
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmont() {
        return limitAmont;
    }

    public void setLimitAmont(Double limitAmont) {
        this.limitAmont = limitAmont;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    protected void deposit(Double amount) {
        //what is day?
        LocalDate now =LocalDate.now();
//       .plus(2, ChronoUnit.DAYS)
        if(now.isAfter(thruDate)){
            System.out.println("your card is Expired");
            return;
        }
        super.deposit(amount);
    }

    @Override
    protected void withdrawal(Double amount) {

        if(amount>limitAmont){
            System.out.println("over the limit amount..!");
            return;
        }
        LocalDate now =LocalDate.now();
        if(now.isAfter(thruDate)){
            System.out.println("your card is Expired");
            return;
        }
        super.withdrawal(amount);
    }
    //overload method
    //withdrawal entire balance
    protected final void withdrawal(){
        withdrawal(getBalance());
    }
    @Override
    protected void showBalance() {
        System.out.println("============================");
        System.out.println("Act No: "+getNumber());
        System.out.println("Act Name: "+getName());
        System.out.println("Balance: "+getBalance());
        System.out.println("My Pin is : "+pin);
        System.out.println("ThouDate : "+thruDate);
        System.out.println("LimitAcc : $"+limitAmont);
        System.out.println("============================");

    }
    private boolean isExpired(LocalDate date){
        //what day is today?
        LocalDate now =LocalDate.now();
        return now.isAfter(date);
    }

}
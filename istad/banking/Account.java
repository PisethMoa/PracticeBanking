package co.istad.banking;

public abstract class Account {
    private Integer number;
    private String name;
    private Double balance;
    public Account(){

    }

    public Account(Integer number, String name,Double balance){
        this.number=number;
        this.name = name;
        this.balance=balance;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double amount){


    }
    protected void deposit(Double amount){
        if(amount<0){
            System.out.println("Are you Kidding me!");
            return;
        }
        if(amount==0){
            System.out.println("your can not put your mondy");
            return;
        }
        balance +=amount;
    }
    protected void withdrawal(Double amount){
        if(amount<0){
            System.out.println("Are you Kidding me!");
            return;
        }
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance -=amount;
    }
    protected abstract void showBalance();

}
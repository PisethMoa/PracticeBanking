package co.istad.banking;

public class SavingAccount extends Account {
    private Double interest;

    private Interest interestInterFace;
    class DefaultInterest implements Interest{

        @Override
        public Double calculate(Double amount) {
            return amount*0.02;
        }
    }
    public SavingAccount(Integer number, String name, Double balance){
        super(number,name,balance);
        //have mor idea
    }
    public SavingAccount(){
        setInterestInterFace(new DefaultInterest());
    }
    public Double getInterest() {
        return interest;
    }
    public void calculateInterest(){
        interest = interestInterFace.calculate(getBalance());
    }

    public Interest getInterestInterFace() {
        return interestInterFace;
    }
    //setInterface
    public void setInterestInterFace(Interest interestInterFace) {
        this.interestInterFace = interestInterFace;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    protected void showBalance() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Saving Act No: "+getNumber());
        System.out.println("Saving Act Name: "+getName());
        System.out.println("Balance: $"+ getBalance());
        System.out.println("Interest : "+ interest);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}

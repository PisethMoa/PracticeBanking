package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;

public class BankingProgram {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(88889999);
        creditCard.setPin(1111);
        creditCard.setThruDate(LocalDate.now());
        //check credit card exists or not
        if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
            creditCard = Database.creditCard();

        }
        else{
            System.out.println("Invalid");
            return;
        }

        creditCard.deposit(500.0);
//        creditCard.withdrawal(500.0);
        creditCard.withdrawal();
        creditCard.showBalance();

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setInterestInterFace(new RielRate());
        savingAccount.showBalance();

//        SavingAccount savingAccount2 = new SavingAccount();
//        savingAccount2.setInterestInterFace(new DollarRate());
//        savingAccount2.showBalance();
        SavingAccount mySaving = Database.saving();
        mySaving.setInterestInterFace(new RielRate());
        mySaving.calculateInterest();
        System.out.println(mySaving.getInterest());



    }
}

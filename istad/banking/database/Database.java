package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(12345678,"Piseth Mao",1000.0);
        creditCard.setPin(1111);
        creditCard.setNumber(88889999);
        creditCard.setLimitAmont(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1,ChronoUnit.DAYS));
        return creditCard;


    }
    public static SavingAccount saving(){
        SavingAccount saving = new SavingAccount(1234,"Piseth Mao",100.0);

        return saving;
    }
}


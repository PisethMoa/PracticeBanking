package co.istad.banking;

public class DollarRate implements Interest {

    @Override
    public Double calculate(Double amount) {
        return amount*0.06;
    }
}
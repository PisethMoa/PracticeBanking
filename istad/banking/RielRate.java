package co.istad.banking;

public class RielRate implements Interest{

    @Override
    public Double calculate(Double amount) {
        return amount*0.09;
    }
}

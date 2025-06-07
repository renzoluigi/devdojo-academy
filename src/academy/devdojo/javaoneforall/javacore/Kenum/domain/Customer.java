package academy.devdojo.javaoneforall.javacore.Kenum.domain;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.CustomerType;

public class Customer {


    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerTypeNAME=" + customerType.getREPORT_VALUE() + ", customerTypeID=" + customerType.getDB_VALUE() +
                ", paymentType=" + paymentType +
                '}';
    }
}

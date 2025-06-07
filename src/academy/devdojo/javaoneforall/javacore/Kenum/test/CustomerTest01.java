package academy.devdojo.javaoneforall.javacore.Kenum.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Renzo" , CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer3 = new Customer("Denize" , CustomerType.STARTUP, PaymentType.CREDIT);
        Customer customer2 = new Customer("Sofia", CustomerType.INDIVIDUAL, PaymentType.CREDIT);
        Customer customer4 = new Customer("Patrick" , CustomerType.COMPANY, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);

        System.out.println("--------------------------------------");
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        // To get an enumeration based by an attribute
        System.out.println("--------------------------------------");
        for (CustomerType value : CustomerType.values()) {
            System.out.println(value);
        }
        System.out.println("--------------------------------------");
        System.out.println(CustomerType.getByReportValue("CoMPANy")); // Ignore case
    }
}

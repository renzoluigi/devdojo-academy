package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService { //The business logic

    public static void generateTaxReport(Product product){
        System.out.println("Starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);
        if (product instanceof Tomato) { // Verify if the product is an instance of Tomato
            Tomato tomato = (Tomato) product; // downcasting -> when you cast a reference of a superclass to a specific subclass
            System.out.println("Weight: " + tomato.getWeight()  );
        }
    }
}

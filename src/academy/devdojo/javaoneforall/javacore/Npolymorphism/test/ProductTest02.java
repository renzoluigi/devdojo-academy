package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest02 {
    public static void main(String[] args) {
        // Widening cast (auto cast subclass object to superclass reference verbal)
        Product product1 = new Computer("Ryzen 9", 2000);
        System.out.println(product1.calculateTaxValue());
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        System.out.println("----------");

        Product product2 = new Tomato("Italian", 2);
        System.out.println(product2.calculateTaxValue());
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
//        System.out.println(product2.getWeight()); can't access attributes or methods of subclasses

        Television television = new Television("Samsung 50\"", 3000);
        System.out.println(television.getName());


        System.out.println("----------");
        ProductTaxReportService.generateTaxReport(product1);
        System.out.println("----------");
        ProductTaxReportService.generateTaxReport(product2);
        System.out.println("----------");
        ProductTaxReportService.generateTaxReport(television);

    }
}

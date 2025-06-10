package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 5", 700);
        Tomato tomato = new Tomato("Greek", 5);
        tomato.setWeight(10.4);

        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("-------");
        ProductTaxReportService.generateTaxReport(product);
    }
}

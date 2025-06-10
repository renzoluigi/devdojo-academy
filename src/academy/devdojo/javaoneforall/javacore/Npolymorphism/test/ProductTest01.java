package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("DESKTOP", 2000);
        Tomato tomato = new Tomato("Red Tomato", 3);
        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("----------------------------");
        ProductTaxReportService.generateTaxReport(tomato);
    }
}

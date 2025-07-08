package academy.devdojo.javaoneforall.javacore.ZZEstreams.domain;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        LightNovel that = (LightNovel) object;
        return Double.compare(price, that.price) == 0 && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}

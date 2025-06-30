package academy.devdojo.javaoneforall.javacore.Ycollections.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class
Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;
    private int amount;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id can't be null");
        Objects.requireNonNull(name, "Name can't be null"); // -> Throw a NullPointerException if the value isn't null
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, double price, int amount) {
        this(id, name, price);
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Manga manga = (Manga) object;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(@NotNull Manga otherManga) {
        // negative if this < otherManga
        // 0 if this == otherManga
        // positive if this > otherManga
        if (this.id < otherManga.id) {
            return -1;
        } else if (this.id > otherManga.id) {
            return 1;
        } else {
            return 0;
        }
        // or return this.id.compareTo(otherManga.id); (compareTo of Long)
    }
}

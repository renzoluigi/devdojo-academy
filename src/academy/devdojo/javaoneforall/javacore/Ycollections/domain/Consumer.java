package academy.devdojo.javaoneforall.javacore.Ycollections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer {
    private Long id;
    private String name;

    public Consumer(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000); // Autogenerate an id (bound)
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Consumer consumer = (Consumer) object;
        return Objects.equals(id, consumer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

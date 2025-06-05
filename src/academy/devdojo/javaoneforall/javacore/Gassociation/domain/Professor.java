package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

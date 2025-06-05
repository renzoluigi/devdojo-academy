package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

import java.util.Arrays;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", professors=" + Arrays.toString(professors) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}

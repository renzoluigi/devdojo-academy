package academy.devdojo.javaoneforall.javacore.XSerialization.domain;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = -4133711872205526563L; // It's like hashcode, is useful to compare versions during the deserialization

    private Long id;
    private String name;
    private transient String password; // To don't serialize (will be null)
    private static final String SCHOOL_NAME = "DevDojo"; // From class, will not serialize
    private transient Class aClass;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // To serializate objects which we can't implement Serializable (Class)
    private void writeObject(ObjectOutputStream oos) { // Works like an Override method
        try {
            oos.defaultWriteObject();
            oos.writeUTF(aClass.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String className = ois.readUTF();
            aClass = new Class(className);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public long getId() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", class='" + aClass + '\'' +
                '}';
    }
}

package web.Model;

import java.sql.ResultSet;

public class Car {

    private String model;
    private String property;
    private int age;


    public Car() {

    }

    public Car(String model, String property, int age) {
        this.model = model;
        this.property = property;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", property='" + property + '\'' +
                ", age=" + age +
                '}';
    }


}

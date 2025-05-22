package GarageProject;

public class Customer1 {
    private String name;
    private Car1 car1;
    private String phone;

    public Customer1(String name, Car1 car1, String phone) {
        this.name = name;
        this.car1 = car1;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Car1 getCar1() {
        return car1;
    }

    public String getPhone() {
        return phone;
    }
}

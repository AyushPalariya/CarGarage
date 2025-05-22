package GarageProject;

public class Service1 {
    private String ServiceName;
    private double ServicePrice;

    public Service1(String serviceName, double servicePrice) {
        ServiceName = serviceName;
        ServicePrice = servicePrice;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public double getServicePrice() {
        return ServicePrice;
    }
}

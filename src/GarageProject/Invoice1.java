package GarageProject;

import java.util.ArrayList;
import java.util.List;

public class Invoice1 {
    private List<Service1> service1List;
    private double totalAmount;
    private Customer1 customer1;
    private Parking1 parking1;

    public Invoice1( Customer1 customer1, Parking1 parking1) {
        service1List = new ArrayList<>();
        totalAmount = 0;
        this.customer1 = customer1;
        this.parking1=parking1;
    }
    public void addService(Service1 service1){
        service1List.add(service1);
        totalAmount+=service1.getServicePrice();
    }
    public List<Service1> getService1List() {
        return service1List;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Customer1 getCustomer1() {
        return customer1;
    }

    public Parking1 getParking1() {
        return parking1;
    }
    public void printInvoice() throws InterruptedException {
        System.out.println("Printing Invoice.....");
        Thread.sleep(3000);
        System.out.println();
        System.out.println("-----------Invoice-----------");
        System.out.println("-Customer Name: "+customer1.getName());
        System.out.println("-PhoneNum: "+customer1.getPhone());
        System.out.println("-CarNumber: "+customer1.getCar1().getCarNumber());
        System.out.println("-Model: "+customer1.getCar1().getCarModel());
        System.out.println("-ParkingPillar: "+parking1.getSlot());
        System.out.println("Services:");
        for (int i = 0; i < service1List.size(); i++) {
            System.out.println(i+1+".  "+service1List.get(i).getServiceName()+":  "+service1List.get(i).getServicePrice());
        }
        System.out.println("TotalAmount is : "+totalAmount);
        System.out.println("--------Thanks For Coming---------");
    }
}

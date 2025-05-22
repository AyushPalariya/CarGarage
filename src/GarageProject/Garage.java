package GarageProject;

import java.util.*;

public class Garage {
    private List<Service1> availableServices;
    private Map<String, Customer1> customer1Map;
    private List<Parking1> parkingPillar;
    private String parkingPillarNumber;

    Garage() {
        availableServices = new ArrayList<>();
        customer1Map = new HashMap<>();
        parkingPillar=new ArrayList<>();
        loadServices();
        parkingPillar();
    }

    public void addCustomer(String name,String phoneNum,String carNum,String carModel){
        Car1 car1=new Car1(carNum,carModel);
        Customer1 customer1=new Customer1(name,car1,phoneNum);
        customer1Map.put(carNum,customer1);
        parkingSlot();
    }
    public void parkingSlot(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Give parkingPillarNumber to Customer: ");
        parkingPillarNumber=sc.next();
    }
    public void parkingPillar(){
        parkingPillar.add(new Parking1("A1"));
        parkingPillar.add(new Parking1("A2"));
        parkingPillar.add(new Parking1("A3"));
        parkingPillar.add(new Parking1("B1"));
        parkingPillar.add(new Parking1("B2"));
        parkingPillar.add(new Parking1("B3"));
    }
    public void loadServices(){
        availableServices.add(new Service1("CarWashing",1000));
        availableServices.add(new Service1("WheelChange",500));
        availableServices.add(new Service1("Punture",90));
        availableServices.add(new Service1("Paint",2000));
        availableServices.add(new Service1("OilChanging",100));
        availableServices.add(new Service1("AcInsertion",3000));
    }


    public List<Service1> getAvailableServices() {
        return availableServices;
    }

    public Map<String, Customer1> getCustomer1Map() {
        return customer1Map;
    }

    public void createInvoice(String carNum) throws InterruptedException {
        if(!customer1Map.containsKey(carNum)){
            System.out.println("No such person here");
            return;
        }

        System.out.println("Available Services:");
        for (int i = 0; i < availableServices.size(); i++) {
            System.out.println(i+1+".  "+availableServices.get(i).getServiceName()+": "+availableServices.get(i).getServicePrice());
        }
        Scanner sc=new Scanner(System.in);
        Customer1 customer1=customer1Map.get(carNum);
        Parking1 parking1=new Parking1(parkingPillarNumber);
        Invoice1 invoice1=new Invoice1(customer1,parking1);

        while(true){
            System.out.print("Enter Service Num: ");
            int choice=0;
            try{
                choice=sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("!!Invalid choice");
                return;
            }
            if(choice==0) break;
            else if(choice>0&&choice<=availableServices.size()){
                invoice1.addService(availableServices.get(choice-1));
                System.out.println("--Service Done--");
            }
            else System.out.println("please enter right service number");
        }
        invoice1.printInvoice();
    }
}

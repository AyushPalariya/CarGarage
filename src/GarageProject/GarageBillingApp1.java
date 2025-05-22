package GarageProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GarageBillingApp1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Garage garage=new Garage();

        while(true){
            System.out.println("-------Ashish Car Service Center---------");
            System.out.println();
            System.out.println("1. Add Customer");
            System.out.println("2. Services");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter Number: ");
            int num=0;
            try{
                num=sc.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.println("please enter valid number..");
            }
            sc.nextLine();
            switch(num){
                case 1:
                    System.out.print("Enter Your Name: ");
                    String name=sc.next();
                    System.out.print("Enter Your PhoneNumber: ");
                    String phone=sc.next();
                    System.out.print("Enter Your CarNum: ");
                    String carNum=sc.next();
                    System.out.print("Enter Your CarModel: ");
                    String carModel=sc.next();
                    garage.addCustomer(name,phone,carNum,carModel);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter carNumber: ");
                    String carNumber=sc.next();
                    garage.createInvoice(carNumber);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting....");
                    Thread.sleep(2000);
                    System.out.println("_____Thanks You____");
                    System.out.println();
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Number...Please try again");
                    System.out.println();
            }
        }
    }
}

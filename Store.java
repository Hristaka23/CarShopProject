package OOPJAVA.CarShopProject;

//import tomov.cartypes.Car;
//import tomov.cartypes.Motorbike;
//import tomov.Vehicle.*;
//import tomov.cartypes.*;
//import tomov.cartypes.Jeep;
//import tomov.cartypes.Suv;
//import tomov.cartypes.Van;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    String name;
    String address;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store first = new Store("F1", "USA");
        ArrayList<Car> allCars = new ArrayList<>();

        System.out.print("If you have new delivery press 1 || If you have a client press 2");// zashoto pri klient she ima izmislenite opciq

        System.out.print("Enter quantity of vehicles ");
        int quantity = Integer.parseInt(scan.nextLine());
        Delivery newDel = new Delivery(quantity);
        first.newStock(newDel, scan, allCars);

        for (Car allCar : allCars) {//samo za proba dali raboti
            System.out.println(allCar);
        }

        // ArrayList<Vehicle> vehicles = new ArrayList<>();

        //  Motorbike suzuki = new Motorbike("Suzuki", "Kawasaki", 2019, 15000, 2000, "Cross");
        //  Motorbike honda = new Motorbike("Honda", "The Super Club", 2020, 7000, 5000, "Sport");

        //  Van volkswagen = new Van("Volkswagen","Transporter T4",2013,14000,24000,8);

        //  Jeep  jeep= new Jeep("Jeep","Cherokee",2016,7000,10000,true);
        // Suv alfa_romeo= new Suv("Alfa Romeo","Stelvio",2020,34000,2900);
//        vehicles.add(alfa_romeo);
//        vehicles.add(audi);
//        vehicles.add(bmw);
//        vehicles.add(volkswagen);
//        vehicles.add(jeep);
//        vehicles.add(suzuki);
//       vehicles.add(honda);
//        System.out.println("---------OUR MODELS----------");
//        System.out.println("Please select number between"+" 0"+" - "+(vehicles.size()-1));
//
//        for (int i = 0; i < vehicles.size(); i++) {
//
//            System.out.println(i+"."+" "+vehicles.get(i).model);
//
//        }
//        System.out.println();
//        int choice=sc.nextInt();
//
////        switch (choice) {
////
////
////            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23:
////                System.out.println("Model: "+vehicles.get(choice).model+"\n"+"Brand: "+vehicles.get(choice).brand+
////                        "\n" +"Price: "+vehicles.get(choice).price+" euro"+"\n"+"Engine: "+vehicles.get(choice).engine);
////                break;
////            default:
////                System.out.println("Please select number between"+"0"+" - "+(vehicles.size()-1));
////
////        }
    }

    // pri menuto kato se izbere dostavka she bude vuvedeno kolichestvoto koeto idva

    public void newStock(Delivery newDel, Scanner scan, List<Car> allCars) {
        for (int i = 0; i < newDel.getNumberOfCarsDelivered(); i++) {
            System.out.println("Enter new car details ");
            System.out.print("Brand: ");
            String brand = scan.nextLine();
            System.out.println();

            System.out.print("Model: ");
            String model = scan.nextLine();
            System.out.println();

            System.out.print("Year: ");
            int year = Integer.parseInt(scan.nextLine());
            System.out.println();

            System.out.print("Buying Price: ");
            double buyingPrice = Double.parseDouble(scan.nextLine());
            System.out.println();

            System.out.print("Color: ");
            String color = scan.nextLine();
            System.out.println();

            Car car1 = new Car(brand, model, year, color);
            allCars.add(car1);
        }
    }
}

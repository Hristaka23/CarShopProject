package CarShopProject.Vehicle_Package;


import CarShopProject.Vehicle_Package.CAR_TYPES.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car_ADD {
    public static void addCars() { //СПОРЕД МЕН МОЖЕ И В ЕДИН МЕТОД НО СЕГА НЕ СЕ СЕЩАМ  метод *1-този и метод *2

        ArrayList<Car> allCars = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter quantity of vehicles ");
        int quantity = Integer.parseInt(scan.nextLine());
        Delivery newDel = new Delivery(quantity);
        newStock(newDel, scan, allCars);
        for (Car allCar : allCars) {
            System.out.println(allCar);
        }
    }

    public static void newStock(Delivery newDel, Scanner scan, List<Car> allCars) { //*2
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
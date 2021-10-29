//package CarShopProject;

//import tomov.cartypes.Car;
//import tomov.cartypes.Motorbike;
//import tomov.Vehicle.*;
//import tomov.cartypes.*;
//import tomov.cartypes.Jeep;
//import tomov.cartypes.Suv;
//import tomov.cartypes.Van;

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
        int choice = -1;

        System.out.println("What you want to make: \n" +
                "1. Add Vehicle \n" +
                "2. Add Employer \n" +
                "0. To exit");
        while (choice != 0) {
            choice = scan.nextInt();

            if (choice == 1) {
                Utilities.addCars();

            }
            if (choice == 2) {
                Utilities.addApplicant();

            }
        }
        System.out.println("You are exiting");

    }


}



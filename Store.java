package CarShopProject;

import CarShopProject.Applicants.Candidate;
import CarShopProject.Applicants.showEmployees;
import CarShopProject.Jobs.Jobs;
import CarShopProject.Vehicle_Package.Car_ADD;
import CarShopProject.Vehicle_Package.showVehicle;

import java.util.Scanner;


public class Store {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        Core_Store coreStore= new Core_Store("Auto Number 1","Bulgaria");
        System.out.println("     ");
        System.out.println("---------------------------------------------------  ");
        System.out.println("Welcome to the "+"'"+coreStore.name+"'"+" store !");
        System.out.println("---------------------------------------------------  ");
        Menu.menu(coreStore);
        while (choice != 0) {
            choice = scan.nextInt();

            if (choice == 1) {
                Car_ADD.addCars(coreStore);

            }
            if (choice == 2) {
                Candidate.addApplicant(coreStore);

            }
            if (choice == 3) {
                showEmployees.show(coreStore);

            }
            if (choice == 4) {

                showVehicle.ourVehicles(coreStore);
            }
//            if (choice == 5) {
//
//
//            }
            if (choice == 6) {
                Jobs.jobsInfo(coreStore);

            }

        }
        System.out.println("You are exiting");

    }


}

package CarShopProject;

import CarShopProject.Applicants.Candidate;
import CarShopProject.Jobs.Jobs;
import CarShopProject.Vehicle_Package.Car_ADD;
import CarShopProject.Vehicle_Package.ShowVehicle;
import CarShopProject.Stores.BaseStore;

import java.util.Scanner;

import static CarShopProject.Applicants.showEmployees.show;

public class Store {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        BaseStore coreStore = new BaseStore("Auto Number 1", "Bulgaria");

        System.out.println("     ");
        System.out.println("---------------------------------------------------  ");
        System.out.println("------📢📢📢 WELCOME TO OUR VEHICLE STORE! 📢📢📢----  ");
        System.out.println("---------------------------------------------------  ");
        System.out.println("     ");
        System.out.println("""
                What you want to make:\s
                1. Add Vehicle\s
                2. Candidate for Job\s
                3. Show Employers\s
                4. Show Vehicles\s
                5. Our Stores\s
                6. Job help\s
                0. To exit\s
                """
        );
        while (choice != 0) {
            choice = scan.nextInt();

            if (choice == 1) {
                Car_ADD.addCars();

            }
            if (choice == 2) {
                Candidate.addApplicant();

            }
            if (choice == 3) {
                show();

            }
            if (choice == 4) {

                ShowVehicle.ourVehicles();
            }
            if (choice == 5) {
                System.out.println(coreStore);

            }
            if (choice == 6) {
                Jobs.jobsInfo();

            }

        }
        System.out.println("You are exiting");

    }


}



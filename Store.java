package CarShopProject;
//proba
import CarShopProject.Applicants.Candidate;
import CarShopProject.Applicants.showEmployees;
import CarShopProject.Jobs.Jobs;
import CarShopProject.Vehicle_Package.Car_ADD;
import CarShopProject.Vehicle_Package.ShowVehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Store {



    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop_db";
        String username = "root";
        String password = "123456789";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }


        Scanner scan = new Scanner(System.in);
        int choice = -1;
        Core_Store Core_Store = new Core_Store("Auto Number 1", "Bulgaria");

        System.out.println("     ");
        System.out.println("---------------------------------------------------  ");
        System.out.println("------📢📢📢 WELCOME TO OUR VEHICLE STORE! 📢📢📢----  ");
        System.out.println("---------------------------------------------------  ");
        Menu.menu(Core_Store);
        while (choice != 0) {
            choice = scan.nextInt();

            if (choice == 1) {
                Car_ADD.addCars(Core_Store);

            }
            if (choice == 2) {
                Candidate.addApplicant(Core_Store);

            }
            if (choice == 3) {
                showEmployees.show(Core_Store);

            }
            if (choice == 4) {

                ShowVehicle.ourVehicles(Core_Store);
            }
//            if (choice == 5) {
//
//
//            }
            if (choice == 5) {
                Jobs.jobsInfo(Core_Store);

            }

        }
        System.out.println("You are exiting");

    }


}

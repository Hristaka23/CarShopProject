package CarShopProject;
import CarShopProject.Applicants.Applicant_ADD;
import CarShopProject.Applicants.JobApplication;
import CarShopProject.Vehicle_Package.Car_ADD;

import java.awt.font.TextHitInfo;
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

        System.out.println("""
                What you want to make:\s
                1. Add Vehicle \s
                2. Add Employer\s
                3. Show Vehicle\s
                4. Show Employer
                5. Jobs Info\s
                6. Candidate for Job\s
                0. To exit\s
                """
        );
        while (choice != 0) {
            choice = scan.nextInt();

            if (choice == 1) {
                Car_ADD.addCars();

            }
            if (choice == 2) {
                Applicant_ADD.addApplicant();

            }
            if (choice == 3) {
                Applicant_ADD.showApplicants();

            }
        }
        System.out.println("You are exiting");

    }


}



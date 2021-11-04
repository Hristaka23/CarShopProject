package CarShopProject.Applicants;

import CarShopProject.Core_Store;
import CarShopProject.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ProjectCopy2.CarShopProject.Applicants.Candidate_Methods.*;

public class Candidate {
    static List<JobApplication> accepted_applicants = new ArrayList<>();


    public static void addApplicant(Core_Store coreStore) {
        Scanner scan = new Scanner(System.in);
        int app_quantity = 1;
        Applicant_SETTER app = new Applicant_SETTER(app_quantity);
        newApplicant(app, scan,coreStore);


    }


    public static void newApplicant(Applicant_SETTER app, Scanner scan, Core_Store coreStore) {
        for (int i = 0; i < app.getNumberOfAPPSDelivered(); i++) {
            System.out.println("----YOU ARE APPLYING FOR A JOB----");
            System.out.println();
            System.out.println("Please, enter your details ✍️ !  ");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.println();

            System.out.print("phone number ");
            String phone_num = scan.next();
            System.out.println();


            System.out.print("Position to Apply: ");
            System.out.println("Choose between - [manager][mechanic][engineer][salesperson][technician][inspector][driver]");
            String position = scan.next();
            position.toLowerCase();
            System.out.println();

            System.out.print("Your experience at this position: ");
            int experience = scan.nextInt();
            System.out.println();
            System.out.print("What's your education([secondary],[high]: ");
            String education = scan.next();
            System.out.println();
            System.out.print("Write more about you... ");// ne go polzvame/qko e no nqma smisul
            String more_inf = scan.next();
            System.out.println();


            JobApplication applicant = new JobApplication(name, phone_num, education, experience, position, more_inf);
            //System.out.println("Applicants for Job Interview");
            // for (JobApplication applicant : applicant) {

            if (applicant.getPosition_want().contains("manager")) {
                if (isQualified_Manager(applicant)) {
                    accepted_applicants.add(applicant);

                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }
            if (applicant.getPosition_want().contains("mechanic")) {
                if (isQualified_Mechanic(applicant)) {
                    accepted_applicants.add(applicant);
                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }
            if (applicant.getPosition_want().contains("engineer")) {
                if (isQualified_AutoEngineer(applicant)) {
                    accepted_applicants.add(applicant);
                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }
            if (applicant.getPosition_want().contains("salesperson")) {
                if (isQualified_CarSalesPerson(applicant)) {
                    accepted_applicants.add(applicant);
                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }


            if (applicant.getPosition_want().contains("technician")) {
                if (isQualified_TireTechnician(applicant)) {
                    accepted_applicants.add(applicant);
                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }

            if (applicant.getPosition_want().contains("inspector")) {
                if (isQualified_VehicleInspector(applicant)) {
                    accepted_applicants.add(applicant);

                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }

            }
            if (applicant.getPosition_want().contains("driver")) {
                if (isQualified_TowTruckDriver(applicant)) {

                    accepted_applicants.add(applicant);
                }
                System.out.println();
                System.out.print("Would you like to candidate for other job: [yes][no]");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    addApplicant(coreStore);
                }else{
                    Menu.menu(coreStore);
                }
            }
        }


    }
}

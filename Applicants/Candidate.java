package CarShopProject.Applicants;

import java.util.*;

import static CarShopProject.Applicants.Candidate_Methods.*;

public class Candidate {
    static List<JobApplication> accepted_applicants = new ArrayList<>();


    public static void addApplicant() {
        List<JobApplication> applicants = new ArrayList<>();
        Scanner app_scan = new Scanner(System.in);
        int app_quantity = 1;
        Applicant_SETTER app = new Applicant_SETTER(app_quantity);
        newApplicant(app, app_scan, applicants);


    }


    public static void newApplicant(Applicant_SETTER app, Scanner app_scan, List<JobApplication> applicants) {
        for (int i = 0; i < app.getNumberOfAPPSDelivered(); i++) {
            System.out.println("----YOU ARE CANDIDATING FOR A JOB----");
            System.out.println();
            System.out.println("Please, enter your details ✍️ !  ");
            System.out.print("Name: ");
            String name = app_scan.next();
            System.out.println();

            System.out.print("phone number ");
            String phone_num = app_scan.next();
            System.out.println();


            System.out.print("Position to Candidate: ");
            System.out.println("*- Write it with small letters and '_'  instead of space ");
            String position = app_scan.next();
            System.out.println();

            System.out.print("Your experience at this position: ");
            int experience = app_scan.nextInt();
            System.out.println();
            System.out.print("What's your education([secondary],[high]: ");
            String education = app_scan.next();
            System.out.println();
            System.out.print("Write more about you... ");
            String more_inf = app_scan.next();
            System.out.println();

            JobApplication applicant = new JobApplication(name, phone_num, education, experience, position, more_inf);
            applicants.add(applicant);

        }


        System.out.println("Applicants for Job Interview");
        for (JobApplication applicant : applicants) {

            if (applicant.getPosition_want().contains("manager")) {
                isQualified_Manager(applicant);
                accepted_applicants.add(applicant);
            }
            if (applicant.getPosition_want().contains("mechanic")) {
                isQualified_Mechanic(applicant);
                accepted_applicants.add(applicant);

            }
            if (applicant.getPosition_want().contains("car_salesperson")) {
                isQualified_CarSalesPerson(applicant);
                accepted_applicants.add(applicant);

            }

            if (applicant.getPosition_want().contains("auto_engineer")) {
                isQualified_AutoEngineer(applicant);
                accepted_applicants.add(applicant);

            }

            if (applicant.getPosition_want().contains("tire_technician")) {
                isQualified_TireTechnician(applicant);
                accepted_applicants.add(applicant);

            }

            if (applicant.getPosition_want().contains("vehicle_inspector")) {
                isQualified_VehicleInspector(applicant);
                accepted_applicants.add(applicant);

            }
            if (applicant.getPosition_want().contains("tow_truck_driver")) {
                accepted_applicants.add(applicant);

            }
        }
    }
}

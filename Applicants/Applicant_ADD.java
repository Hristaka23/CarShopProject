package CarShopProject.Applicants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static CarShopProject.Applicants.Job_Methods.isQualified_Manager;
import static CarShopProject.Applicants.Job_Methods.isQualified_Mechanic;

public class Applicant_ADD {

    public static void addApplicant() {
        List<JobApplication> applicants = new ArrayList<>();
        Scanner app_scan = new Scanner(System.in);
        System.out.print("Enter quantity applicants ");
        int app_quantity = app_scan.nextInt();
        Applicant_SETTER app = new Applicant_SETTER(app_quantity);
        newApplicant(app, app_scan, applicants);


    }

    public static void newApplicant(Applicant_SETTER app, Scanner app_scan, List<JobApplication> applicants) {
        for (int i = 0; i < app.getNumberOfAPPSDelivered(); i++) {
            System.out.println("Enter new apps details ");
            System.out.print("Name: ");
            String name = app_scan.next();
            System.out.println();

            System.out.print("phone number ");
            String phone_num = app_scan.next();
            System.out.println();

            System.out.print("experience: ");
            int experience = app_scan.nextInt();
            System.out.println();

            System.out.print("Postion: ");
            String position = app_scan.next();
            System.out.println();
            System.out.print("education ");
            String education = app_scan.next();
            System.out.println();
            System.out.print("more information about him: ");
            String more_inf = app_scan.next();
            System.out.println();

            JobApplication applicant = new JobApplication(name, phone_num, education, experience, position, more_inf);
            applicants.add(applicant);

        }
        List<JobApplication> accepted_applicants = new ArrayList<>();

        JobApplication default_applicant1 = new JobApplication("Pesho", "0324234", "висше", 6, "manager", "");
        accepted_applicants.add(default_applicant1);

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


        }
        //==================================================================
        // todo Това искам да е  в друг метод но не знам как???//например точно това да го прехвърлим в showApplicants()
        System.out.println("      ");
        System.out.println("      ");
        System.out.println("Our Employers");
        for (int i = 0; i <accepted_applicants.size() ; i++) {
            System.out.println(accepted_applicants.get(i).getName()+" ---> "+accepted_applicants.get(i).getPosition_want());

        }

        }

    public  static void showApplicants() {



    }
}







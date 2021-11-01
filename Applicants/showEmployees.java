package CarShopProject.Applicants;

import java.util.HashSet;
import java.util.Set;

import static CarShopProject.Applicants.Candidate.accepted_applicants;

public class showEmployees {


    public static void show() {

        Set<JobApplication> acc_app = new HashSet<JobApplication>(accepted_applicants);
        JobApplication default_applicant1 = new JobApplication("Pesho", "0324234", "high", 6, "manager", "");
        JobApplication default_applicant2 = new JobApplication("Dimitur", "0324234", "secondary", 6, "manager", "");
        acc_app.add(default_applicant1);
        acc_app.add(default_applicant2);

        System.out.println("Our Employees");
        for (JobApplication b : acc_app) {
            System.out.println(b.hashCode() + "    " + "Name: " + b.getName() + "\nPosition: " + b.getPosition_want() + "");
            System.out.println("--------------------------------------------------------------");


        }
    }

}



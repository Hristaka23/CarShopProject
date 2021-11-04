package CarShopProject.Applicants;

import CarShopProject.Core_Store;
import CarShopProject.Menu;

import java.util.HashSet;
import java.util.Set;

import static ProjectCopy2.CarShopProject.Applicants.Candidate.accepted_applicants;

public class showEmployees {


    public static void show(Core_Store coreStore) {

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
        Menu.menu(coreStore);
    }

}



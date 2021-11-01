package CarShopProject.Applicants;

public class Candidate_Methods {
    public static void isQualified_Mechanic(JobApplication applicant) {
        if (applicant.getPosition_want().equals("mechanic") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 1) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ MECHANIC ] !");

        }
    }

    public static void isQualified_Manager(JobApplication applicant) {
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("high") && applicant.getExperience() > 3) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ MANAGER ] !");
        }
    }

    public static void isQualified_AutoEngineer(JobApplication applicant) {
        if (applicant.getPosition_want().equals("auto_engineer") && applicant.getEducation().equals("high") && applicant.getExperience() > 4) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ AUTO ENGINEER ] !");

        }

    }

    public static void isQualified_CarSalesPerson(JobApplication applicant) {
        if (applicant.getPosition_want().equals("car_salesperson") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 4) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ CAR SALESPERSON ] !");

        }

    }

    public static void isQualified_TireTechnician(JobApplication applicant) {
        if (applicant.getPosition_want().equals("tire_technician") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 2) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [TIRE TECHNICIAN ] !");

        }

    }

    public static void isQualified_VehicleInspector(JobApplication applicant) {
        if (applicant.getPosition_want().equals("vehicle_inspector") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 7) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ VEHICLE INSPECTOR ] !");

        }

    }

    public static void isQualified_TowTruckDriver(JobApplication applicant) {
        if (applicant.getPosition_want().equals("tow_truck_driver") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 2) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ TOW TRUCK DRIVER ] !");

        }
    }
}




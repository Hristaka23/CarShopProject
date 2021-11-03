package CarShopProject.Applicants;

public class Candidate_Methods {
    public static boolean isQualified_Manager (JobApplication applicant){
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("high") && applicant.getExperience() > 3) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ MANAGER ] !");
            return true;
        } else {
            System.out.println("Not compatible");
            return false;

        }

    }

    public static boolean isQualified_Mechanic(JobApplication applicant) {
        if (applicant.getPosition_want().equals("mechanic") && (applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high")) && applicant.getExperience() > 1) {
            System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ MECHANIC ] !");
            return true;
        } else {
            System.out.println("Not compatible");
            return false;
        }
    }

        public static boolean isQualified_AutoEngineer (JobApplication applicant){
            if (applicant.getPosition_want().equals("engineer") && applicant.getEducation().equals("high") && applicant.getExperience() > 4) {
                System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ AUTO ENGINEER ] !");
                return true;
            } else {
                System.out.println("Not compatible");
                return false;

            }
        }

        public static boolean isQualified_CarSalesPerson (JobApplication applicant){
            if (applicant.getPosition_want().equals("salesperson") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 1) {
                System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ CAR SALESPERSON ] !");
                return true;
            } else {
                System.out.println("Not compatible");
                return false;

            }
        }

        public static boolean isQualified_TireTechnician (JobApplication applicant){
            if (applicant.getPosition_want().equals("technician") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 2) {
                System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [TIRE TECHNICIAN ] !");
                return true;
            } else {
                System.out.println("Not compatible");
                return false;

            }
        }

        public static boolean isQualified_VehicleInspector (JobApplication applicant){
            if (applicant.getPosition_want().equals("inspector") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 7) {
                System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ VEHICLE INSPECTOR ] !");
                return true;
            } else {
                System.out.println("Not compatible");
                return false;

            }
        }

        public static boolean isQualified_TowTruckDriver (JobApplication applicant){
            if (applicant.getPosition_want().equals("driver") && applicant.getEducation().equals("secondary") || applicant.getEducation().equals("high") && applicant.getExperience() > 2) {
                System.out.println("Welcome, " + applicant.getName() + "!" + "\n - You are  hired for Job as a [ TOW TRUCK DRIVER ] !");
                return true;
            } else {
                System.out.println("Not compatible");
                return false;
            }
        }
    }




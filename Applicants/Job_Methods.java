package CarShopProject.Applicants;

public class Job_Methods {
    public static void isQualified_Mechanic(JobApplication applicant) {
        boolean isQualified_Mechanic;
        if (applicant.getPosition_want().equals("mechanic") && applicant.getEducation().equals("средно") || applicant.getEducation().equals("висше") && applicant.getExperience() > 1) {
            isQualified_Mechanic = true;
            System.out.println(applicant.getName() + " is qualified for Mechanic !");
        } else {
            isQualified_Mechanic = false;
//            System.out.println(applicant.getName() + " is not qualified for Mechanic !");
        }

    }

    public static void isQualified_Manager(JobApplication applicant) {
        boolean isQualified_Manager;
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("висше") && applicant.getExperience() > 3) {
            isQualified_Manager = true;
            System.out.println(applicant.getName() + " is qualified for Manager !");
        } else {
            isQualified_Manager = false;
//            System.out.println(applicant.getName() + " is not qualified for Manager !");
        }
    }
    public static void isQualified_M(JobApplication applicant) {
        boolean isQualified_Manager;
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("висше") && applicant.getExperience() > 3) {
            isQualified_Manager = true;
            System.out.println(applicant.getName() + " is qualified for Manager !");
        } else {
            isQualified_Manager = false;
//            System.out.println(applicant.getName() + " is not qualified for Manager !");
        }
    }
}




//package CarShopProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilities {
    public static void addCars() {

        ArrayList<Car> allCars = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter quantity of vehicles ");
        int quantity = Integer.parseInt(scan.nextLine());
        Delivery newDel = new Delivery(quantity);
        newStock(newDel, scan, allCars);
        for (Car allCar : allCars) {
            System.out.println(allCar);
        }
    }

    public static void newStock(Delivery newDel, Scanner scan, List<Car> allCars) { //*2
        for (int i = 0; i < newDel.getNumberOfCarsDelivered(); i++) {
            System.out.println("Enter new car details ");
            System.out.print("Brand: ");
            String brand = scan.nextLine();
            System.out.println();

            System.out.print("Model: ");
            String model = scan.nextLine();
            System.out.println();

            System.out.print("Year: ");
            int year = Integer.parseInt(scan.nextLine());
            System.out.println();

            System.out.print("Buying Price: ");
            double buyingPrice = Double.parseDouble(scan.nextLine());
            System.out.println();

            System.out.print("Color: ");
            String color = scan.nextLine();
            System.out.println();

            Car car1 = new Car(brand, model, year, color);
            allCars.add(car1);

        }
    }

    public static void addApplicant() {
        List<JobApplication> applicants = new ArrayList<>();
        Scanner app_scan = new Scanner(System.in);
        System.out.print("Enter quantity applicants ");
        int app_quantity = app_scan.nextInt();
        App_Delivery app = new App_Delivery(app_quantity);
        newApplicant(app, app_scan, applicants);


    }

    public static void newApplicant(App_Delivery app, Scanner app_scan, List<JobApplication> applicants) {
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

            JobApplication appli = new JobApplication(name, phone_num, education, experience, position, more_inf);
            applicants.add(appli);

        }

        JobApplication applicant1 = new JobApplication("Pesho", "0324234", "висше", 6, "manager", "");

        applicants.add(applicant1);


        System.out.println("Applicants for Job Interview");

        boolean contains = false;

        for (JobApplication applicant : applicants) {

            contains = applicant.getPosition_want().contains("manager");
            if (contains) {
                isQualified_Manager(applicant);
            }
            if (!contains) {
                isQualified_Mechanic(applicant);
            }

        }
    }

    public static boolean isQualified_Mechanic(JobApplication applicant) {
        boolean isQualified_Mechanic;
        if (applicant.getPosition_want().equals("mechanic") && applicant.getEducation().equals("средно") || applicant.getEducation().equals("висше") && applicant.getExperience() > 1) {
            isQualified_Mechanic = true;
            System.out.println(applicant.getName() + " is qualified for Mechanic !");
        } else {
            isQualified_Mechanic = false;
        }
        return isQualified_Mechanic;
    }

    public static boolean isQualified_Manager(JobApplication applicant) {
        boolean isQualified_Manager;
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("висше") && applicant.getExperience() > 3) {
            isQualified_Manager = true;
            System.out.println(applicant.getName() + " is qualified for Manager !");
        } else {
            isQualified_Manager = false;
        }
        return isQualified_Manager;
    }


}

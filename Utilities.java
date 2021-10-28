package CarShopProject;

import Car_Management_System.JobAplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilities {
    public static void addCars() { //СПОРЕД МЕН МОЖЕ И В ЕДИН МЕТОД НО СЕГА НЕ СЕ СЕЩАМ  метод *1-този и метод *2

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
        public static void newApplicant() {

        JobAplication applicant1 = new JobAplication("Dzhan", "0897758062", "висше", 2, "mechanic", "");
        JobAplication applicant2 = new JobAplication("Mitko", "0883458031", "висше", 2, "manager", "");
        JobAplication applicant3 = new JobAplication("Petko", "0897999342", "средно", 2, "manager", "");
        JobAplication applicant4 = new JobAplication("Boyko", "0444321332", "средно", 2, "mechanic", "");
        ArrayList<JobAplication> applicants = new ArrayList<>();
        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
        applicants.add(applicant4);

        System.out.println("Applicants for Job Interview");

        boolean contains = false;
        for (int i = 0; i < applicants.size(); i++) {

            contains = applicants.get(i).getPosition_want().contains("manager");
            if (contains) {
                isQualified_Manager(applicants.get(i));
            }
            if (!contains) {
                isQualified_Mechanic(applicants.get(i));
            }

        }
    }

    public static boolean isQualified_Mechanic(JobAplication applicant) {
        boolean isQualified_Mechanic;
        if (applicant.getPosition_want().equals("mechanic") && applicant.getEducation().equals("средно") ||  applicant.getEducation().equals("висше")  && applicant.getExperience() > 1) {
            isQualified_Mechanic = true;
            System.out.println(applicant.getName() + " is qualified for Mechanic !");
        } else {
            isQualified_Mechanic = false;
//            System.out.println(applicant.getName() + " is not qualified for Mechanic !");
        }
        return isQualified_Mechanic;
    }

    public static boolean isQualified_Manager(JobAplication applicant) {
        boolean isQualified_Manager;
        if (applicant.getPosition_want().equals("manager") && applicant.getEducation().equals("висше") && applicant.getExperience() > 3) {
            isQualified_Manager = true;
            System.out.println(applicant.getName() + " is qualified for Manager !");
        } else {
            isQualified_Manager = false;
//            System.out.println(applicant.getName() + " is not qualified for Manager !");
        }
        return isQualified_Manager;
    }



}

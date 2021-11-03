package CarShopProject.Jobs;

import CarShopProject.Store;

import java.util.Scanner;

public class Jobs {


    public static void jobsInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======YOU HAVE SELECTED JOB HELP========");
        System.out.println("""
                What you want to see:\s
                1. Manager \s
                2. Auto Mechanic\s
                3. Car Salesperson\s
                4. Vehicle Inspector\s
                5. Tow truck driver\s
                6. Auto engineer\s
                7. Tire technician\s
                0. Go to Main Menu\s
                """
        );
        int choice2 = -1;
        while (choice2 != 0) {
            choice2 = scan.nextInt();
            switch (choice2) {

                case 1:
                    System.out.println("Manager");
                    break;
                case 2:
                    System.out.println("Auto mechanic");
                    break;
                case 3:
                    System.out.println("Car Salesperson");
                    break;

                case 4:
                    System.out.println("Vehicle Inspector");
                    break;

                case 5:
                    System.out.println("Tow truck driver");
                    break;
                case 6:
                    System.out.println("Auto engineer");
                    break;


                case 7:
                    System.out.println("Tire technician");

                    break;
                case 0:
                    System.out.println("""
                            What you want to make:\s
                            1. Add Vehicle \s
                            2. Candidate for Job\s
                            3. Show Employers\s
                            4. Show Vehicles\s
                            5. Our Stores\s
                            6. Job help\s
                            0. To exit\s
                            """
                    );
                    break;
                default:
                    System.out.println("""
                            What you want to see:\s
                            1. Manager \s
                            2. Auto Mechanic\s
                            3. Car Salesperson\s
                            4. Vehicle Inspector\s
                            5. Tow truck driver\s
                            6. Auto engineer\s
                            7. Tire technician\s
                            0. Go to Main Menu\s
                            """
                    );
                    break;
            }

        }
    }
}

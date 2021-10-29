package CarShopProject.Vehicle_Package;
//
//public class Utilities {
//    public static void main(String[] args) {
////        Car bmw = new Car("jeep", "Bmw", "X5", 2015, 20.000, "black");
////        Car audi = new Car("jeep", "Audi", "Q5", 2015, 21.050, "blue");
////        Car suzuki = new Car("suv", "Suzuki", "Vitara", 2017, 10.000, "grey");
////        Car toyota = new Car("suv", "Toyota", "Land Cruiser", 2019, 40.000, "black");
////        Car range_rover = new Car("jeep", "Range Rover", "Sport", 2020, 45.000, "white");
//        Store first = new Store("Best", "Pravec");
//        JobApplication applicant1 = new JobApplication("Tedi", 3, "manager", "higher");
//        JobApplication applicant2 = new JobApplication("Veni", 1, "seller", "primary");
//        JobApplication applicant3 = new JobApplication("Neli", 0.5, "secretary", "primary");
//        boolean isTrue1 = applicant1.requirements(applicant1.getExperience(), applicant1.getEducation(), applicant1.getPosition());
//        boolean isTrue2 = applicant2.requirements(applicant2.getExperience(), applicant2.getEducation(), applicant2.getPosition());
//        boolean isTrue3 = applicant3.requirements(applicant3.getExperience(), applicant3.getEducation(), applicant3.getPosition());
//        for (int i = 0; i < 3; i++) {
//
//            if (st) {
//                first.applicants.add(applicant1);
//
//                System.out.println("Name:" + applicant1.getName() + " Education " + applicant1.education);
//            } else {
//                System.out.println("You are not compatible with this job");
//            }
//        }
//
//    }
//}
//


public class Delivery {
//za momenta samo broi koli

    int numberOfCarsDelivered;

    public Delivery(int numberOfCarsDelivered) {
        if (numberOfCarsDelivered > 0) {
            this.numberOfCarsDelivered = numberOfCarsDelivered;
        }
    }

    public int getNumberOfCarsDelivered() {
        return numberOfCarsDelivered;
    }

    public void setNumberOfCarsDelivered(int numberOfCarsDelivered) {
        if (numberOfCarsDelivered > 0) {
            this.numberOfCarsDelivered = numberOfCarsDelivered;
        }

    }
}

package CarShopProject.Vehicle_Package.CAR_TYPES;

import CarShopProject.Vehicle_Package.Vehicle;

public class Car extends Vehicle {

boolean sportmode;
    public Car(String brand, String model, int year, String color,double price,boolean sportmode) {
        super(brand, model, year, color,price);
        this.sportmode=sportmode;

    }


}

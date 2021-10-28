package CarShopProject;

public class Car extends Vehicle {
    //she se dobavqt vidovete dali e suv jeep i tn.
    //a da se napravi class primerno za kamioni veche za razlichen type vehicle bez motori za nachalo
    //String suv;


    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);

    }

    @Override
    public String toString() {//samo za proba dali raboti
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

package OOPJAVA.CarShopProject;

public class Vehicle {
    String brand;
    String model;
    int year;
    double price;
    double buyingPrice;
    String color;
    int engine;

    public  Vehicle(String brand, String model, int year, String color){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color = color;
        //this.price=price;
      //  this.engine=engine;

    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
}

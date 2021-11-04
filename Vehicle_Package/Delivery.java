package CarShopProject.Vehicle_Package;



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

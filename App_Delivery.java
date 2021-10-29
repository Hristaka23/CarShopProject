//package CarShopProject;

public class App_Delivery {

        int numberofAppsdelivered;

        public App_Delivery(int numberofAppsdelivered) {
            if (numberofAppsdelivered > 0) {
                this.numberofAppsdelivered = numberofAppsdelivered;
            }
        }

        public int getNumberOfAPPSDelivered() {
            return numberofAppsdelivered;
        }

        public void setNumberofAppsdelivered(int numberofAppsdelivered) {
            if (numberofAppsdelivered > 0) {
                this.numberofAppsdelivered = numberofAppsdelivered;
            }

        }
}

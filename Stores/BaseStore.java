package CarShopProject.Stores;

public class BaseStore {
    String name;
    String address;


    public  String toString() {
        return  "-STORE NAME: "+ this.name+"\n"+
                "-ADDRESS: "+this.address;
    }

    public BaseStore(String name, String address) {
        this.name = name;
        this.address = address;

    }


        }


package CarShopProject.Vehicle_Package;

import CarShopProject.Vehicle_Package.CAR_TYPES.Car;
import CarShopProject.Vehicle_Package.CAR_TYPES.HatchBack;
import CarShopProject.Vehicle_Package.CAR_TYPES.OffRoad4x4;
import CarShopProject.Vehicle_Package.CAR_TYPES.SUV;

import java.util.*;

public class showVehicle {


    public static void ourVehicles() {
        Map<String, ArrayList<Object>> types = new HashMap<>();
        ArrayList<Object> hatchback = new ArrayList<>();
        ArrayList<Object> sport_car = new ArrayList<>();
        ArrayList<Object> offroad_car = new ArrayList<>();
        ArrayList<Object> suv = new ArrayList<>();


        // VEHICLE TYPE: HATCHBACK
        HatchBack volkswagen_golf_mk8 = new HatchBack("Volkswagen", "Golf MK8", 2020, "White", 50000);
        HatchBack ford_focus_zetec = new HatchBack("Ford", "Focus Zetec Edition 1.0", 2021, "Grey", 61000);
        hatchback.add(volkswagen_golf_mk8);
        hatchback.add(ford_focus_zetec);
        types.put("HatchBack", hatchback);


        // VEHICLE TYPE: CAR
        Car bmw_m3 = new Car("BMW", "M3", 2019, "Black", 30000, true);
        Car audi_a8 = new Car("AUDI", "A8", 2019, "Grey", 40000, true);
        sport_car.add(bmw_m3);
        sport_car.add(audi_a8);
        types.put("sportcar", sport_car);


        // VEHICLE TYPE: OffRoad
        OffRoad4x4 mitsubishi_pajero = new OffRoad4x4("Mitsubishi", "Pajero", 2015, "White", 31000);
        OffRoad4x4 land_rover_defender = new OffRoad4x4("Land Rover", "Defender", 2017, "Orange", 21000);

        offroad_car.add(mitsubishi_pajero.getBrand());
        offroad_car.add(land_rover_defender.getBrand());
        types.put("OFFROAD", offroad_car);


        // VEHICLE TYPE: SUV
        SUV hyundai_tucson = new SUV("Hyundai", "Tucson", 2022, "White", 71000);
        SUV mazda_cx_5 = new SUV("Mazda", "CX-5", 2021, "White", 61000);

        suv.add(hyundai_tucson.getBrand());
        suv.add(mazda_cx_5.getBrand());
        types.put("SUV", suv);

        for (Map.Entry<String, ArrayList<Object>> set : types.entrySet()) {


                System.out.println("Тype : " + set.getKey() + " = " + " Vehicle's : " + set.getValue());


        }

    }


}

package CarShopProject.Vehicle_Package;

import CarShopProject.Vehicle_Package.CAR_TYPES.Car;
import CarShopProject.Vehicle_Package.CAR_TYPES.HatchBack;
import CarShopProject.Vehicle_Package.CAR_TYPES.OffRoad4x4;
import CarShopProject.Vehicle_Package.CAR_TYPES.SUV;

import java.util.*;

public class showVehicle {


    public static void ourVehicles() {
//==========================HASHMAP AND ARRAYLISTS=======================================================================
        Map<String, ArrayList<Object>> types_vehicles = new HashMap<>();
        ArrayList<Object> hatchback = new ArrayList<>();
        ArrayList<Object> sport_car = new ArrayList<>();
        ArrayList<Object> offroad_car = new ArrayList<>();
        ArrayList<Object> suv = new ArrayList<>();


//==================================VEHICLE TYPE: HATCHBACK===============================================================
        HatchBack volkswagen_golf_mk8 = new HatchBack("Volkswagen", "Golf MK8", 2020, "White", 50000);
        HatchBack ford_focus_zetec = new HatchBack("Ford", "Focus Zetec Edition 1.0", 2021, "Grey", 61000);
        hatchback.add(volkswagen_golf_mk8);
        hatchback.add(ford_focus_zetec);
        types_vehicles.put("HATCHBACK", hatchback);


//================================VEHICLE TYPE: CAR=====================================================================
        Car bmw_m3 = new Car("BMW", "M3", 2019, "Black", 30000, true);
        Car audi_a8 = new Car("AUDI", "A8", 2019, "Grey", 40000, true);
        sport_car.add(bmw_m3);
        sport_car.add(audi_a8);
        types_vehicles.put("SPORTCAR", sport_car);

//==================================VEHICLE TYPE: OFFROAD===============================================================
        OffRoad4x4 mitsubishi_pajero = new OffRoad4x4("Mitsubishi", "Pajero", 2015, "White", 31000);
        OffRoad4x4 land_rover_defender = new OffRoad4x4("Land Rover", "Defender", 2017, "Orange", 21000);

        offroad_car.add(mitsubishi_pajero);
        offroad_car.add(land_rover_defender);
        types_vehicles.put("OFFROAD", offroad_car);


//==================================VEHICLE TYPE: SUV===============================================================

        SUV hyundai_tucson = new SUV("Hyundai", "Tucson", 2022, "White", 71000);
        SUV mazda_cx_5 = new SUV("Mazda", "CX-5", 2021, "White", 61000);

        suv.add(hyundai_tucson);
        suv.add(mazda_cx_5);
        types_vehicles.put("SUV", suv);

//=====================================PRINTING=====================================================
        System.out.println("""
                🚘 VEHICLE TYPES\s
                Select :
                1. SPORT CAR \s
                2. SUV \s
                3. OFFROAD \s
                4. HATCHBACK \s
                0. To exit\s
                """
        );

        Scanner scan = new Scanner(System.in);

        int choice_type = scan.nextInt();


        for (Map.Entry<String, ArrayList<Object>> vehicles : types_vehicles.entrySet()) {
            String key = vehicles.getKey(); // contains the keys
            ArrayList<Object> val = vehicles.getValue(); // contains arraylists
            // print all the key and values in the hashmap
            // System.out.println(key + ": " + val);
            // using interator to get the specific values arraylists
            Iterator<Object> itr = val.iterator();
            int i = 0;
            Object[] data = new Object[val.size()];

                while (itr.hasNext() ) {


                    Object array = itr.next();
                data[i] = array;
                // System.out.println(data[i] + "  " + key);
                if (choice_type == 1 && key.equals("SPORTCAR")) {
                    System.out.println("VEHICLE NO: ["+(i+1)+"]");
                    System.out.println(data[i]);
                }
                if (choice_type == 2 && key.equals("SUV")) {
                    System.out.println("VEHICLE NO: ["+(i+1)+"]");
                    System.out.println(data[i]);
                }
                if (choice_type == 3 && key.equals("OFFROAD")) {
                    System.out.println("VEHICLE NO: ["+(i+1)+"]");
                    System.out.println(data[i]);
                }
                if (choice_type == 4 && key.equals("HATCHBACK")) {
                    System.out.println("VEHICLE NO: ["+(i+1)+"]");
                    System.out.println(data[i]);
                }

                i++;

            }//end of while

        }//end of for-loop


    }//END OF METHOD showVEHICLE()
}///END OF CLASS SHOW VEHICLE


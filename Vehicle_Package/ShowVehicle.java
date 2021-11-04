package CarShopProject.Vehicle_Package;

import CarShopProject.Core_Store;
import CarShopProject.Menu;
import CarShopProject.Vehicle_Package.CAR_TYPES.*;

import java.util.*;

public class showVehicle {


    public static void ourVehicles(Core_Store coreStore) {
        //==========================HASHMAP AND ARRAYLISTS=======================================================================
        Map<String, ArrayList<Object>> types_vehicles = new HashMap<>();
        ArrayList<Object> hatchback = new ArrayList<>();
        ArrayList<Object> sport_car = new ArrayList<>();
        ArrayList<Object> offroad_car = new ArrayList<>();
        ArrayList<Object> suv = new ArrayList<>();
        ArrayList<Object> electric = new ArrayList<>();
        ArrayList<Object> cabriolet = new ArrayList<>();
        ArrayList<Object> minivan = new ArrayList<>();
        ArrayList<Object> coupe = new ArrayList<>();
        ArrayList<Object> pickup = new ArrayList<>();
        ArrayList<Object> sedan = new ArrayList<>();


//==================================VEHICLE TYPE: HATCHBACK===============================================================
        HatchBack volkswagen_golf_mk8 = new HatchBack("Volkswagen", "Golf MK8", 2020, "White", 50000);
        HatchBack ford_focus_zetec = new HatchBack("Ford", "Focus Zetec Edition 1.0", 2021, "Grey", 61000);
        hatchback.add(volkswagen_golf_mk8);
        hatchback.add(ford_focus_zetec);
        types_vehicles.put("HATCHBACK", hatchback);


        // VEHICLE TYPE: CAR
        Car bmw_m3 = new Car("BMW", "M3", 2019, "Black", 30000);
        Car audi_a8 = new Car("AUDI", "A8", 2019, "Grey", 40000);
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

        //==================================VEHICLE TYPE: ELECTRIC===============================================================
        Electric_Car tesla_1 = new Electric_Car("Tesla", "Model 3", 2022, "White", 71000);
        Electric_Car tesla_2 = new Electric_Car("Tesla", "Model 1", 2022, "White", 71000);
        electric.add(tesla_1);
        electric.add(tesla_2);
        types_vehicles.put("ELECTRIC", electric);
        //==================================VEHICLE TYPE: CABRIOLET===============================================================
        Cabriolet audi_roadster = new Cabriolet("AUDI", "TT Roadster", 2020, "White", 81000);
        Cabriolet mercedes_cabrio = new Cabriolet("Mercedes", "E Class Cabriolet", 2017, "White", 71000);
        cabriolet.add(audi_roadster);
        cabriolet.add(mercedes_cabrio);
        types_vehicles.put("CABRIOLET", cabriolet);
        //==================================VEHICLE TYPE: MINIVAN===============================================================
        Minivan minivan_1 = new Minivan("Toyota", "Tucson", 2022, "White", 71000);
        Minivan minivan_2 = new Minivan("minivan", "Tucson", 2022, "White", 71000);
        minivan.add(minivan_1);
        minivan.add(minivan_2);
        types_vehicles.put("MINIVAN", minivan);
        //==================================VEHICLE TYPE: COUPE===============================================================
        Coupe coupe_1 = new Coupe("To", "Tucson", 2022, "White", 71000);
        Coupe coupe_2 = new Coupe("Coupe_2", "Tucson", 2022, "White", 71000);
        coupe.add(coupe_1);
        coupe.add(coupe_2);
        types_vehicles.put("COUPE", coupe);
        //==================================VEHICLE TYPE: PICKUP===============================================================
        Pickup_truck pickup_1 = new Pickup_truck("Pickup", "Tucson", 2022, "White", 71000);
        Pickup_truck pickup_2 = new Pickup_truck("Pickup", "Tucson", 2022, "White", 71000);
        pickup.add(pickup_1);
        pickup.add(pickup_2);
        types_vehicles.put("PICKUP", pickup);
        //==================================VEHICLE TYPE: SEDAN===============================================================
        Sedan sedan_1 = new Sedan("Sedan", "Tucson", 2022, "White", 71000);
        Sedan sedan_2 = new Sedan("Sedan", "Tucson", 2022, "White", 71000);
        sedan.add(sedan_1);
        sedan.add(sedan_2);
        types_vehicles.put("SEDAN", sedan);

//=====================================PRINTING=====================================================

        System.out.println("""
                🚘 VEHICLE TYPES\s
                Select :
                1. Sport Car \s
                2. SUV \s
                3. OffRoad \s
                4. HatchBack \s
                5. Electric Car\s
                6. Cabriolet\s
                7. Minivan\s
                8. Coupe\s
                9. Pickup\s
                10. Sedan\s
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
            while (itr.hasNext()) {


                Object array = itr.next();
                data[i] = array;
                // System.out.println(data[i] + "  " + key);
                if (choice_type == 1 && key.equals("SPORTCAR")) {
                    System.out.println("======SPORT VEHICLE =======");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 2 && key.equals("SUV")) {
                    System.out.println("======SUV VEHICLE =======");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 3 && key.equals("OFFROAD")) {
                    System.out.println("======OFFROAD VEHICLE=====");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 4 && key.equals("HATCHBACK")) {
                    System.out.println("======HATCHBACK VEHICLE=====");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }

                if (choice_type == 5 && key.equals("ELECTRIC")) {
                    System.out.println("======ELECTRIC VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 6 && key.equals("CABRIOLET")) {
                    System.out.println("======CABRIOLET VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 7 && key.equals("MINIVAN")) {
                    System.out.println("======MINIVAN VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 8 && key.equals("COUPE")) {
                    System.out.println("======COUPE VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 9 && key.equals("PICKUP")) {
                    System.out.println("======PICKUP VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }
                if (choice_type == 10 && key.equals("SEDAN")) {
                    System.out.println("======SEDAN VEHICLE=========");
                    System.out.println("VEHICLE NO: [" + (i + 1) + "]");
                    System.out.println(data[i]);
                }

                i++;

            }
        }
        System.out.println();
        System.out.print("Would you like to see another type of car: [yes][no]");
        String choice = scan.next();
        if (choice.equals("yes")) {
            ourVehicles(coreStore);
        }

        Menu.menu(coreStore);

    }
}

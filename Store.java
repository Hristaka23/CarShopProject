package CarShopProject;

//import tomov.cartypes.Car;
//import tomov.cartypes.Motorbike;
//import tomov.Vehicle.*;
//import tomov.cartypes.*;
//import tomov.cartypes.Jeep;
//import tomov.cartypes.Suv;
//import tomov.cartypes.Van;

import java.util.Scanner;

public class Store {
    String name;
    String address;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store first = new Store("F1", "USA");
  /* TODO  май трябва да има един while цикъл който като се натисне 0 да връща назад  */
        int choice = scan.nextInt();
/* TODO  Колите които сме добавили от конзолата да отиват при тези които ги има в програма,които сме ги добавили
     ръчно и ако същестува същата кола да не може... */
        //Това тук дали ще е по-добре с switch case?//защото като  има default: ако потребителя сгреши нещо
        //при въвеждането да го върнем на същото място където е сгрешил
        if (choice == 1) {//ако се натисне 1  извиква се метода за добавяне на коли

            Utilities.addCars();
        }
        //Ако се натисне 2- показва кои са назначени
/* TODO от конзолата да въвеждаме данните на работодателя ако искаме да добавяме.Но да има и работници,които
    сме добавили  ръчно.И ако съществува такъв работник да не може да добави.
  */
        if(choice == 2){
           Utilities.newApplicant();
        }

    }
}



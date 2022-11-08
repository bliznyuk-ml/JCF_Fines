package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {


    public static void main(String[] args) {

        Set<Human> baseHumans = new HashSet<>();

        Human davidGilmor = new Human("David", "Gilmor", 3_051_002_433L, "London");
        Human davidGilmor2 = new Human("David", "Gilmor", 3_051_002_433L, "Rome");
        Human markKnopfler = new Human("Mark", "Knopfler", 4_651_984_321L, "Manchester");
        Human kirckHammet = new Human("Kirck", "Hammet", 5_876_345_234L, "Los Angeles");
        Human tillLindemann = new Human("Till", "Lindemann", 3_456_753_034L, "Berlin");

        //Додавання нової людини з інформацією про неї
        baseHumans.add(davidGilmor);
        baseHumans.add(davidGilmor2);
        baseHumans.add(markKnopfler);
        baseHumans.add(kirckHammet);
        baseHumans.add(tillLindemann);

        System.out.println(baseHumans);

        //Заміна інформації про людину та її штрафи
        davidGilmor.setCity("Manchester");

        //Додавання нових штрафів для вже існуючих записів
        davidGilmor.setFines(new LandTaxFine(300));
        markKnopfler.setFines(new ValueAddedTaxFine(600));
        markKnopfler.setFines(new ValueAddedTaxFine(300));
        markKnopfler.setFines(new LandTaxFine(200));
        kirckHammet.setFines(new PropertyTaxFine(800));

        System.out.println(baseHumans);

        //Видалення штрафу
        for (Human m : baseHumans) {
            if (m.equals(davidGilmor)) {
                m.removeFines(new LandTaxFine(300));
                break;
            }
        }
        System.out.println(baseHumans);
        System.out.println();

        //Друк даних по конкретному коду
        Human tmp = null;
        long searchIdentificationCode = 5_876_345_234L;
        for (Human m : baseHumans) {
            if (m.getIdentificationCode() == searchIdentificationCode) {
                System.out.print("Found data by identification code: " + searchIdentificationCode);
                System.out.println(m);
                tmp = m;
                break;
            }
        }
        if (tmp == null) {
            System.out.println("Data by identification code: " + searchIdentificationCode + " not found");
        }

        System.out.println();

        //Друк даних по конкретному місту
        String city = "Berlin";
        int count = 0;
        for (Human m : baseHumans) {
            if (m.getCity().equals(city)) {
                System.out.print("Found data by city: " + city);
                System.out.println(m);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("City " + city + " not found");
        }

        System.out.println();

        //Друк даних по конкретному типу "Value added tax fine" штрафу
        for (Human m : baseHumans) {
            m.showValueAddedTaxFine();
        }

        System.out.println();

        //Друк даних по конкретному типу "Land tax fine" штрафу
        for (Human m : baseHumans) {
            m.showLandTaxFine();
        }

        System.out.println();

        //Друк даних по конкретному типу "Property tax fine" штрафу
        for (Human m : baseHumans) {
            m.showPropertyTaxFine();
        }
    }
}

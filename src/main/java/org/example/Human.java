package org.example;

import java.util.ArrayList;

public class Human {
    private String name;
    private String lastName;
    private final long identificationCode;
    private String city;
    ArrayList<Fine> fines = new ArrayList<>();

    public Human(String name, String lastName, long identificationCode, String city) {
        this.identificationCode = identificationCode;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    public void setFines(Fine fine) {
        fines.add(fine);
    }

    public void findFines(Fine fine) {
        System.out.println(fines.indexOf(fine));
        if (fines.contains(fine)) {
            System.out.println("the fine is in the database");
        } else {
            System.out.println("the fine is not in the database");
        }
    }

    public void removeFines(Fine fine) {
        if (fines.size() != 0) {
            fines.remove(fine);
        }
    }

    public void showValueAddedTaxFine() {
        for (Fine fine : fines) {
            if (fine instanceof ValueAddedTaxFine){
                String s = String.format("\n Name: %-8s| Last name: %-10s| Identification code: %10d| City: %-12s| Fines %s ", name, lastName, identificationCode, city, fine);
                System.out.println("Value added tax fine has: " + s);
            }
        }
    }

    public void showLandTaxFine() {
        for (Fine fine : fines) {
            if (fine instanceof LandTaxFine){
                String s = String.format("\n Name: %-8s| Last name: %-10s| Identification code: %10d| City: %-12s| Fines %s ", name, lastName, identificationCode, city, fine);
                System.out.println("Land tax fine has: " + s);
            }
        }
    }

    public void showPropertyTaxFine() {
        for (Fine fine : fines) {
            if (fine instanceof PropertyTaxFine){
                String s = String.format("\n Name: %-8s| Last name: %-10s| Identification code: %10d| City: %-12s| Fines %s ", name, lastName, identificationCode, city, fine);
                System.out.println("Property tax fine has: " + s);
            }
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getIdentificationCode() {
        return identificationCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("\n Name: %-8s| Last name: %-10s| Identification code: %10d| City: %-12s| Fines %s ", name, lastName, identificationCode, city, fines);
    }

    @Override
    public int hashCode() {
        return (int) (identificationCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human human) {
            return identificationCode == human.identificationCode;
        }
        return super.equals(obj);
    }
}

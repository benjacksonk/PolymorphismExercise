package org.yup.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<Asset>();


        // Create new assets, houses and vehicles

        House house1 = new House("Grand Estate", "4/4/2014", 20000000,
                "123 Main Street", 1, 150000, 300000
        );

        House house2 = new House("Micro-cabin", "3/3/2016", 85000,
                "by the freeway", 4, 1000, 50
        );

        Vehicle vehicle1 = new Vehicle("newer car", "2/2/2018", 9000,
                "Honda Civic", 3, 3000
        );

        Vehicle vehicle2 = new Vehicle("older truck", "1/1/2020", 12000,
                "Ford F-150", 5, 5000
        );

        // add them to my ArrayList<Asset>
        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        // Loop through my assets
        for (Asset asset : assets) {

            // Print the description, the date you acquired it, how much you paid for it, and its value.
            System.out.printf("%s | acquired: %s | price paid: $ %.2f | value: $ %.2f\n",
                asset.getDescription(),
                asset.getDateAcquired(),
                asset.getOriginalCost(),
                asset.getValue()
            );

            // After that, check if its a house or a vehicle (use instanceof)
            if (asset instanceof House) {
                // if its a house, show the address
                System.out.printf("House Address: %s\n", ((House) asset).getAddress());
            }
            else if (asset instanceof Vehicle vehicle) {
                // if its a vehicle, show the make/model and year
                System.out.printf("Vehicle Make & Model: %s | Vehicle Age: %d years\n", vehicle.getMakeModel(), vehicle.getYear());
            }

            System.out.println();
        }
    }
}

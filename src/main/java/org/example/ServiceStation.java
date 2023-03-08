package org.example;

public class ServiceStation {

    public void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] != null) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                updateAllTyres(transports[i]);
            }
            checkIfCar(transports[i]);
            checkIfTruck(transports[i]);
            System.out.println();
        }
    }

    public static void updateAllTyres(Transport transports) {
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            transports.updateTyre();
        }
    }

    public static void checkIfCar(Transport transports) {
        if (transports instanceof Car) {
            ((Car) transports).checkEngine();
        }
    }

    public static void checkIfTruck(Transport transports) {
        if (transports instanceof Truck) {
            ((Truck) transports).checkEngine();
            ((Truck) transports).checkTrailer();
        }
    }

}




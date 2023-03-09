package org.example;

public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        int count = 0;
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у велосипеда");
            count++;
        }
        System.out.printf("Всего поменяно покрышек: %d%n%n", count);
    }
}

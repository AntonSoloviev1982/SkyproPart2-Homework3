package org.example;

public class Truck extends Transport implements CheckEngineTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        int count = 0;
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у грузового автомобиля");
            count++;
        }
        System.out.printf("Всего поменяно покрышек: %d%n", count);
        this.checkEngine();
        this.checkTrailer();
        System.out.println();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузового автомобиля");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

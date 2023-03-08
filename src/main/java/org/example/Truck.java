package org.example;

public class Truck extends Transport implements CheckEngineTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузового автомобиля");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузового автомобиля");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

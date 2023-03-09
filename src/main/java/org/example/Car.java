package org.example;

public class Car extends Transport implements CheckEngineTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        int count = 0;
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у легкового автомобиля");
            count++;
        }
        System.out.printf("Всего поменяно покрышек: %d%n", count);
        this.checkEngine();
        System.out.println();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }

}
